package org.snva.helloworld.utils;

import org.snva.helloworld.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringMain {

    public static void main(String[] args) {
        // in the beginning we used to have the ffx implementations to user or wire our dependencies
        //BeanFactory (3x) (6x)
        //ApplicationContext

        //the ffx implementations
        //1 ClassPathXmlApplicationContext
        //2 FileSystemXmlApplicationContext
        //AnnotationConfigApplicationContext


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("");
       User sabas=(User) applicationContext.getBean("sabas");
        List<User> users=(List<User>) applicationContext.getBean("Users");

        System.out.println(sabas);

    }
}
