import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * @author xusonglin
 * @date 2022/8/16 - 20:00
 */
@SpringBootTest
public class Application {
    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
    }
    @Test
    public void getBean(){
        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }
    }
}
