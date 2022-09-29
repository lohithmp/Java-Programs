package com.training.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
    Main class to call the Bus class methods.
 */

//We define the bus class and EngineStart class bean using xml based configuration
public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        Bus bus=context.getBean(Bus.class);
        System.out.println("Station 1");
        bus.firstStop();
        System.out.println("Station 2");
        bus.secondStop();
        System.out.println("Station 3");
        bus.thirdStop();
    }
}
