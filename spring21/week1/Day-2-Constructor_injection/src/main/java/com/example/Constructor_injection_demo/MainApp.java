package com.example.Constructor_injection_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ci.xml");

        Laptop laptop = (Laptop) context.getBean("laptopBean");
        laptop.start();
    }
}
