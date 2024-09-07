import com.kototo.spring.jdbctemplate.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = "classpath:jdbc.xml")
public class SpringTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test() {
        //update
        //        String sql = "insert into students (name, gender, age, class) values(?,?,?,?)";
//        Object[] args = {"kototo", "男", 16, "大学3班"};
//        int update = jdbcTemplate.update(sql, args);
//        System.out.println("update = " + update);

//        String sql = "update students set name=? where id = ?";
//        Object[] args = {"tutuko",9};
//        int update = jdbcTemplate.update(sql, args);
//        System.out.println("update = " + update);

//        String sql = "delete from students where id = ?";
//        int update = jdbcTemplate.update(sql, 8);
//        System.out.println("update = " + update);

        //show

//        String sql = "select max(age) from students";
//        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
//        System.out.println("integer = " + integer);

//        String sql = "select id,name,gender,age,class as classes from students where id = ?";
//        Student student = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Student.class), 9);
//        System.out.println("student = " + student);

        String sql = "select id,name,gender,age,class as classes from students";

        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        for (Student student : studentList) {
            System.out.println("student = " + student);
        }

    }
}
