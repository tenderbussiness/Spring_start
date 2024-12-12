package org.test.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
     // Auto auto =   context.getBean("auto", Auto.class);
       // System.out.println(auto.getNumOfWheels());
       // System.out.println(auto);
        //Engine engine =  context.getBean("engine", Engine.class);
       // System.out.println(engine);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      Autopark autopark =  context.getBean("autopark",Autopark.class);
        System.out.println(autopark);



    }


}

