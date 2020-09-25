package AutowireByAnnotationQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context =  new ClassPathXmlApplicationContext("AutowireByAnnotationQualifier/AutoWireconfig.xml");
		 Employee employee = context.getBean("employee", Employee.class);
		 System.out.println(employee);
		  
		
	}

}
