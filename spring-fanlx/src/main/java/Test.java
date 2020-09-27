import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: Test
 * @Description: TODO
 * @Author: fanlx
 * @Date: 2020-09-27 12:49
 */

public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Object indexService = applicationContext.getBean("indexService");
		System.out.println(indexService);
	}
}
