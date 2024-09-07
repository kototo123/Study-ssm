import com.kototo.mybatis.param.mapper.EmployeeMapper;
import com.kototo.mybatis.param.pojo.Employee;
import com.kototo.mybatis.param.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParamTest {
    @Test
    public void testSelectAll() {
        SqlSession sqlSession = SqlSessionUtil.openSession();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        List<Employee> employeeList = employeeMapper.selectAll();

        for (Employee employee : employeeList) {
            System.out.println("employee = " + employee);
        }
    }

    @Test
    public void testSharpAndDollar() {
        SqlSession sqlSession = SqlSessionUtil.openSession();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        Employee employee = employeeMapper.selectEmpById(1);
        Employee employee1 = employeeMapper.selectEmpById2(4);
        System.out.println("employee = " + employee);
        System.out.println("employee1 = " + employee1);
    }

    @Test
    public void testSelectAllOrder() {
        SqlSession sqlSession = SqlSessionUtil.openSession();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        List<Employee> employeeList = employeeMapper.selectAllOrder("asc");

        for (Employee employee : employeeList) {
            System.out.println("employee = " + employee);
        }
    }

    @Test
    public void testInsertEmp() {
        SqlSession sqlSession = SqlSessionUtil.openSession();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = new Employee(null, "kkk", 123.123123);
        employeeMapper.insertEmp(employee);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectMoreArgs() {
        SqlSession sqlSession = SqlSessionUtil.openSession();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
//        List<Employee> employeeList = employeeMapper.selectEmpByNameAndSalary("ototo", 123.3);
//        employeeList.forEach(System.out::println);

        Map<String, Object> map = new HashMap<>();
        map.put("empName","ototo");
        map.put("empSalary", 123.3);
        List<Employee> employeeList = employeeMapper.selectEmpByMap(map);
        employeeList.forEach(System.out::println);
    }
}
