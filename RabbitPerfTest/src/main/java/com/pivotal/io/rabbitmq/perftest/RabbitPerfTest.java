package com.pivotal.io.rabbitmq.perftest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.rabbitmq.examples.PerfTest;

@Component(value="app")
@SpringBootApplication
public class RabbitPerfTest {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(RabbitPerfTest.class, args);
        
        RabbitPerfTest app = (RabbitPerfTest)context.getBean("app");
        
        PerfTest.main(app.arguments.split(" "));
        
    }
    
    @Value("${args}")
    public String arguments;
   
}
