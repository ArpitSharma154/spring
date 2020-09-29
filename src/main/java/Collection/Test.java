package Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Collection/config.xml");
	Person per = (Person) context.getBean("per1");
	System.out.println(per);
	System.out.println(per.getFriends().getClass().getName());
	System.out.println("_____________________________________________________________");
	System.out.println(per.getFeeStructure());
	System.out.println(per.getFeeStructure().getClass().getName());
	System.out.println("_____________________________________________________________");
	System.out.println(per.getProperties());
	System.out.println(per.getProperties().getClass().getName());
	
}
}
