import com.kototo.spring.aop.anno.Calculator;
import com.kototo.spring.aop.anno.NewsUserServiceImpl;
import com.kototo.spring.aop.anno.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = SpringConfig.class)
public class AopTest {
    @Autowired
    private Calculator calculator;

    @Autowired
    private NewsUserServiceImpl newsUserService;

    @Test
    public void test() {
        calculator.add(1,5);
//        newsUserService.showAll(1,2);
    }

}
