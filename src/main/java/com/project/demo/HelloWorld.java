package com.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class HelloWorld {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);

        /*LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);*/

        /*Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());*/

        /*List<Integer> inputs = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        for(int i=0; i< inputs.size(); i++){
            if(inputs.get(i) % 3== 0 && inputs.get(i)%5 == 0) {
                System.out.println("ab" + inputs.get(i));
            }
            else if (inputs.get(i) % 3== 0 ) {
                System.out.println("a" + inputs.get(i));
            }
            else if (inputs.get(i) % 5== 0 ) {
                System.out.println("b" + inputs.get(i));
            }
        }*/


    }
}
