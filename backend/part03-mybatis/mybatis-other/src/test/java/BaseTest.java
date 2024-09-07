import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kototo.mybatis.other.mapper.EmployeeMapper;
import com.kototo.mybatis.other.pojo.Employee;
import com.kototo.mybatis.other.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BaseTest {

    @Test
    public void select() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        PageHelper.startPage(6,2);

        List<Employee> employees = employeeMapper.selectEmp();

        PageInfo<Employee> pageInfo = new PageInfo<>(employees,3);

        System.out.println(pageInfo.getPages());
        System.out.println(pageInfo.getPrePage());
        System.out.println(pageInfo.getNextPage());
        System.out.println(pageInfo.isIsFirstPage());
        System.out.println(pageInfo.isIsLastPage());

        int[] navigatepageNums = pageInfo.getNavigatepageNums();
        System.out.println("=====================");
        for (int navigatepageNum : navigatepageNums) {
            System.out.print(navigatepageNum+"\t");
        }

        employees.forEach(System.out::println);
    }
}
