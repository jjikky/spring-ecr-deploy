package org.jikky.springdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringdockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdockerApplication.class, args);
    }
}

@RestController
class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        return "지키의 해피해피 해피몽몽 스프링 서버";
    }
}
