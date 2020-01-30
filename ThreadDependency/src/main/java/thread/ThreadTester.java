package thread;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThreadTester {
	public static void main(String[] args) {
		try {
			String metaInfo = "context.xml";
ApplicationContext spring = new ClassPathXmlApplicationContext(metaInfo);
Rocket ref = spring.getBean(Rocket.class);


	Labour ref1 = spring.getBean(Labour.class);
	ref.launch();
	ref1.work();
		} catch (BeansException e) {
			
			e.printStackTrace();
		}
	
	}
}
