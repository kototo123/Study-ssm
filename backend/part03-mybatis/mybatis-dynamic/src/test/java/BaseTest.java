import com.kototo.mybatis.dynamic.mapper.EmployeeMapper;
import com.kototo.mybatis.dynamic.pojo.Employee;
import com.kototo.mybatis.dynamic.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseTest {

    @Test
    public void testselectCondition() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        Map<String, Object> condition = new HashMap<>();
//        condition.put("empName", "ototo");
        condition.put("empSalary", 123.3);
        condition.put("deptId", 1);
        List<Employee> employeeList = employeeMapper.selectEmpByCondition(condition);
        employeeList.forEach(System.out::println);
    }

    @Test
    public void testupdateCondition() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        Map<String, Object> condition = new HashMap<>();
        condition.put("empId", 15);
        condition.put("empName", "kototo");
//        condition.put("empSalary", 1233.3);
//        condition.put("deptId", 1);
        employeeMapper.updateByCondition(condition);
        sqlSession.commit();
    }

    @Test
    public void testselectTrimCondition() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        Map<String, Object> condition = new HashMap<>();
        condition.put("empName", "ototo");
        condition.put("empSalary", 123.3);
//        condition.put("deptId", 1);
        List<Employee> employeeList = employeeMapper.selectEmpByCondition(condition);
        employeeList.forEach(System.out::println);
    }

    @Test
    public void testselectchooseCondition() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        Map<String, Object> condition = new HashMap<>();
        condition.put("empName", "ototo");
        condition.put("empSalary", 123.3);
        condition.put("deptId", 1);
        List<Employee> employeeList = employeeMapper.selectEmpByChoose(condition);
        employeeList.forEach(System.out::println);
    }

    @Test
    public void testselectforeachCondition() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(11);
        ids.add(15);
        List<Employee> employees = employeeMapper.selectEmpByForeach(ids);
        employees.forEach(System.out::println);
    }

    @Test
    public void testinsertforeachCondition() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employeelist = new ArrayList<>();
        employeelist.add(new Employee(null,"jjj",123.3,1));
        employeelist.add(new Employee(null,"qqq",13.3,2));
        employeelist.add(new Employee(null,"www",14.3,3));
        employeelist.add(new Employee(null,"eee",15.3,1));
        Integer integer = employeeMapper.insertEmpByBatch(employeelist);
        sqlSession.commit();
    }

    @Test
    public void testupdateforeachCondition() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employeelist = new ArrayList<>();
        employeelist.add(new Employee(16,"jjj",123.3,1));
        employeelist.add(new Employee(17,"qqq",13.3,2));
        employeelist.add(new Employee(18,"www",4.3,3));
        employeelist.add(new Employee(19,"eee",15.3,1));
        employeeMapper.updateEmpByBatch(employeelist);
        sqlSession.commit();
    }
}
