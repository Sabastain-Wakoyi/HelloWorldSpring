package org.snva.helloworld;

import org.snva.helloworld.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SpringRunner
{


    public static void main( String[] args )
    {
        ApplicationContext userContext = new ClassPathXmlApplicationContext
                ("users-context.xml");
       User sabas = (User) userContext.getBean("sabas");
        System.out.println( sabas );
    }


}
