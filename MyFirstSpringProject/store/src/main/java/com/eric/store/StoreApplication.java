package com.eric.store;


/*
dependency management:
spring-boot-starter-web
1.Tomcat
2.web
3.webMVC
    M = Model Data / Logic ::: Java Class
    V = View ::: What the user see
    C = Controller ::: Mediator between 'Model' and 'View'
4.jackson
     The
5.logging
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }

}
