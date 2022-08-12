package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Address add1 = (Address) context.getBean("Address"); // Configured with XML
        System.out.println(add1);
        add1.setCountry("United States");
        add1.setState("Arizona");
        add1.setCity("Phoenix");
        add1.setZipcode("12345");
        System.out.println(add1);
        Phone phone1 = (Phone) context.getBean("phone"); // Configured with annotations
        phone1.setMob("12345890");
        List<Phone> ph1 = new ArrayList<>();
        ph1.add(phone1);
        System.out.println(phone1.getMob());
        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class); // Configured with Class
        Student student1 = context2.getBean(Student.class);
        student1.setAdd(add1);
        student1.setId(356547);
        student1.setName("John");
        student1.setPh(ph1);
        System.out.println(student1);
    }
}