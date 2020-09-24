package com.springcore.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spring/config.xml");
     Cons con = (Cons) context.getBean("cons1");
     System.out.println(con);
     con.add();
    }
}
