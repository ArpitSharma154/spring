package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	  public static void main(String[] args) 
	  { 
		  AbstractApplicationContext context = new
		  ClassPathXmlApplicationContext("lifecycle/config.xml");
		  Samosa sam = (Samosa) context.getBean("s1"); 
		  context.registerShutdownHook(); 
		  System.out.println(sam); 
	  }
	 
	
}
