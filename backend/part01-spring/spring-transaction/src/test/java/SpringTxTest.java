import com.kototo.spring.tx.StudentsService;
import com.kototo.spring.tx.TopService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.io.FileNotFoundException;

@SpringJUnitConfig(locations = "classpath:spring-tx.xml")
public class SpringTxTest {

    @Autowired
    private StudentsService studentsService;

    @Autowired
    private TopService topService;

    @Test
    public void test(){
//        studentsService.changeInfo();
        topService.change();
    }
}
