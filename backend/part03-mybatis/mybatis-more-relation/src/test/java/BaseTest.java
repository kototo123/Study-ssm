import com.kototo.mybatis.more.mapper.TeacherMapper;
import com.kototo.mybatis.more.pojo.Teacher;
import com.kototo.mybatis.more.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BaseTest {

    @Test
    public void testMoreToMore() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);

        List<Teacher> teachers = teacherMapper.selectAllTeacher();
        teachers.forEach(System.out::println);
    }
}
