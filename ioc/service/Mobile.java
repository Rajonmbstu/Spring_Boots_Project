package com.IoC_Containers.Spring_Pro2.service;
import com.IoC_Containers.Spring_Pro2.service.Sim;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        // Using ApplicationContext to implement Spring IoC
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("beans.xml");

        // Get the bean
        Sim sim = applicationContext.getBean("sim", Airtel.class);

        // Calling the methods
        sim.calling();
        sim.data();
    }
}