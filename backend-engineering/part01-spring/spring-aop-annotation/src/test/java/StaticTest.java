import com.kototo.spring.aop.proxy.Calculator;
import com.kototo.spring.aop.proxy.CalculatorProxy;
import com.kototo.spring.aop.proxy.CalculatorPureImpl;
import com.kototo.spring.aop.proxy.ProxyFactory;
import org.junit.jupiter.api.Test;

public class StaticTest {

    @Test
    public void staticTest() {
        CalculatorPureImpl calculatorPure = new CalculatorPureImpl();

        CalculatorProxy proxy = new CalculatorProxy(calculatorPure);
        int result = proxy.add(1, 2);
        System.out.println("result = " + result);
    }
    @Test
    public void testDynamicProxy(){
        ProxyFactory factory = new ProxyFactory(new CalculatorPureImpl());
        Calculator proxy = (Calculator) factory.getProxy();
        proxy.add(1,3);
        proxy.sub(1,3);
        proxy.mul(1,3);
        //proxy.div(1,1);
    }
}
