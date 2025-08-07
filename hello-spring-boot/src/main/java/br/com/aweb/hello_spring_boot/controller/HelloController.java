package br.com.aweb.hello_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
    @GetMapping
    public String sayHello(){
        return "Ola Mundo Spring Boot !";
    }
    @GetMapping("/ola")
    public String sayHelloCustom() {
        return  "Olá Mundo Especifico!";
    }
    
    @GetMapping("/greet")
    public String greet(@RequestParam ("name") String userName) {
        return  "Olá, " +userName+ "! Bem Vindo";
    }
}
