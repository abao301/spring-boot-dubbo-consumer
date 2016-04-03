package com.jiutong.bnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@ImportResource("dubbo-consumer.xml")
public class App 
{
    public static void main( String[] args )
    {

        SpringApplication.run(App.class,args);
    }
}
