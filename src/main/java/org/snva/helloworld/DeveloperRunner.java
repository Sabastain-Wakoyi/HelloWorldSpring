package org.snva.helloworld;

import org.snva.helloworld.beans.Role;
import org.snva.helloworld.beans.User;

import java.util.ArrayList;
import java.util.List;

public class DeveloperRunner {
    public static void main(String[] args) {
//  Role learner = new Role();
//  Role admin = new Role();
//  Role architect = new Role();

//        Role learner= new Role();
//        learner.setRoleId(111l);
//        learner.setRoleName("learner");
//        learner.setRoleDescription("Just a learner");
//
//        Role architect = new Role();
//        architect.setRoleId(222l);
//        architect.setRoleName("architect");
//        architect.setRoleDescription("Just an architect");
//
//        Role admin = new Role();
//        admin.setRoleId(333l);
//        admin.setRoleName("admin");
//        admin.setRoleDescription("This is the administrator");
//
//        List<Role> rolesEssoko =new ArrayList<>();
//        rolesEssoko.add(learner);
//
//        List<Role> rolesAbe =new ArrayList<>();
//        rolesAbe.add(architect);
//
//
//        List<Role> rolesSabas=new ArrayList<>();
//        rolesSabas.add(admin);
//
//
//
//
//        User essoko = new User();
//        essoko.setContact("+112");
//        essoko.setUserId("123");
//        essoko.setUserName("hhh");
//        essoko.setFirstName("essoko");
//        essoko.setLastName("xxxx");
//        essoko.setRole(rolesEssoko);
//
//        User abe = new User();
//        abe.setContact("233677");
//        abe.setUserId("234");
//        abe.setUserName("uu");
//        abe.setFirstName("abe");
//        abe.setLastName("lll");
//        abe.setRole(rolesAbe);
//
//
//        User sabas = new User();
//        sabas.setContact("+00998");
//        sabas.setUserId("345");
//        sabas.setUserName("yyyy");
//        sabas.setFirstName("sabas");
//        sabas.setLastName("uu");
//        sabas.setRole(rolesSabas);
//
//        List<User> users = new ArrayList<>();
//        users.add(essoko);
//        users.add(abe);
//        users.add(sabas);

//        users.forEach(x->{
//            System.out.print(x.getFirstName());
//            System.out.print(" having ");
//            System.out.print(x.getRole().size());
//            System.out.print(" roles details ->");
//            System.out.println(x);
//        });


//        bean inheritance


        Role learner= new Role();
        learner.setRoleId(111l);
        learner.setRoleName("learner");
        learner.setRoleDescription("Just a learner");

        Role instructor = new Role();
        architect.setRoleId(222l);
        architect.setRoleName("architect");
        architect.setRoleDescription("Just an architect");

        List<Role> rolesforlearner =new ArrayList<>();
        rolesEssoko.add(learner);

        List<Role> rolesforinstructor =new ArrayList<>();
        rolesAbe.add(architect);



        User learner = new User();
        learner.setContact("+112");
        learner.setUserId("123");
        learner.setUserName("hhh");
        learner.setFirstName("essoko");
        learner.setLastName("xxxx");
        learner.setRole(rolesforlearner);

        User instructor = new User();
        instructor.setContact("233677");
        instructor.setUserId("234");
        instructor.setUserName("uu");
        instructor.setFirstName("abe");
        instructor.setLastName("lll");
        instructor.setRole(rolesforinstructor);


        List<User> users = new ArrayList<>();
       users.add(learner);
       users.add(instructor);


        users.forEach(x->{
            System.out.print(x.getFirstName());
            System.out.print(" having ");
            System.out.print(x.getRole().size());
            System.out.print(" roles details ->");
            System.out.println(x);
        });


    }
}
