package br.com.aweb.hello_spring_boot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MensagemController {
    @GetMapping("/mensagem")
    public String mensagem(
        @RequestParam (required = false, defaultValue ="visitante")String usuario, 
        @RequestParam (required = false, defaultValue ="pt")String idioma
     ) {


    
    
    
}
