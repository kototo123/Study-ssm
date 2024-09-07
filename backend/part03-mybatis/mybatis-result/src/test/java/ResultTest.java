import com.kototo.mybatis.result.mapper.EmployeeMapper;
import com.kototo.mybatis.result.mapper.OrderMapper;
import com.kototo.mybatis.result.pojo.Employee;
import com.kototo.mybatis.result.pojo.Order;
import com.kototo.mybatis.result.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class ResultTest {
    @Test
    public void testSelectCount() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper sessionMapper = sqlSession.getMapper(EmployeeMapper.class);
        Integer count = sessionMapper.selectEmpCount();
        Double maxSalary = sessionMapper.selectMaxSalary();
        System.out.println("count = " + count);
        System.out.println("maxSalary = " + maxSalary);
    }

    @Test
    public void testSelectEmpBySalary() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper sessionMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = sessionMapper.selectEmpBySalary(200.33);
        System.out.println("employee = " + employee);
    }

    @Test
    public void testSelectSalary() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper sessionMapper = sqlSession.getMapper(EmployeeMapper.class);
        Map<String, Object> stringObjectMap = sessionMapper.selectSalary();
        Set<Map.Entry<String, Object>> entries = stringObjectMap.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println("entry = " + entry);
        }
    }

    @Test
    public void testInsert() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper sessionMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = new Employee(null, "ttutuko", 1.23);
        sessionMapper.insertEmp(employee);

        sqlSession.commit();
        System.out.println(employee);
    }

    @Test
    public void testInsertOrder() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

//        String orderId = UUID.randomUUID().toString().replaceAll("-", "");
        Order order = new Order(null,"Xiaomi418 pro plus ultra");
        orderMapper.insertOrder(order);

        sqlSession.commit();

        System.out.println("order = " + order);
    }

    @Test
    public void testSelectEmp() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper sessionMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = sessionMapper.selectEmp(1);
        System.out.println("employee = " + employee);
    }
}
