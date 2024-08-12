import com.kototo.spring.tx.xml.StudentsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:spring-tx.xml")
public class SpringTest {
    @Autowired
    private StudentsService studentsService;

    @Test
    public void test() {
        studentsService.changeInfo();
    }
}
