import com.kototo.mybatis.relation.mapper.DepartmentMapper;
import com.kototo.mybatis.relation.mapper.EmployeeMapper;
import com.kototo.mybatis.relation.pojo.Department;
import com.kototo.mybatis.relation.pojo.Employee;
import com.kototo.mybatis.relation.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

public class RelationTest {

    @Test
    public void testToOne() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        Employee employee = employeeMapper.selectEmpAndDeptId(14);
        System.out.println("employee = " + employee);
    }

    @Test
    public void testMoreToMore() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);

        Department department = departmentMapper.selectDeptAndEmpsById(1);
        System.out.println("department = " + department);
    }
}
