import com.kototo.mybatis.quick.mapper.EmployeeMapper;
import com.kototo.mybatis.quick.pojo.Employee;
import com.kototo.mybatis.quick.util.SqlSessionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Slf4j
public class MyBatisTest {
    @Test
    public void testBase() throws IOException {
        //1.读取核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.通过SqlSessionFactory工厂对象获取Sqlsession(类connection)
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.基于接口获取实现类对象(代理)
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        //5.以接口角度调用方法
        List<Employee> employeeList = employeeMapper.selectAllEmp();
        //6.处理结果
        employeeList.forEach(System.out::println);
        //7.释放链接
        sqlSession.close();
    }
    @Test
    public void testUtil() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employeeList = employeeMapper.selectAllEmp();
//        employeeList.forEach(System.out::println);
        for (Employee employee : employeeList) {
            log.info(employee.toString());
        }

        sqlSession.close();

    }
    @Test
    public void testLog() {
        System.out.println();
    }
    @Test
    public void testSelectOne() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.selectEmpById(1);
        System.out.println("employee = " + employee);
    }
    @Test
    public void testInsert() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = new Employee(null, "kototo", 392.3);
        Integer integer = employeeMapper.insertEmp(employee);
        log.info(integer.toString());

        sqlSession.commit();
    }
    @Test
    public void testUpdate() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = new Employee(11, "ototo", 123.3);
        Integer integer = employeeMapper.updateEmp(employee);
        log.info(integer.toString());
        sqlSession.commit();
    }
    @Test
    public void testDelete() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Integer integer = employeeMapper.deleteEmp(2);
        log.info(integer.toString());
        sqlSession.commit();
    }
}
