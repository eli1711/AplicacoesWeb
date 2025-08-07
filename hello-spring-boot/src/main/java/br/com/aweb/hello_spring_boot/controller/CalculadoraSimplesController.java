package br.com.aweb.hello_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraSimplesController {
    @GetMapping("/calcular")
    public String calcular(
    @RequestParam  Integer num1,
    @RequestParam  Integer num2,
    @RequestParam (required = false, defaultValue = "soma") String op
    ) {
        if (op.equals("subitracao"))
        return "Resultado "+ (num1 - num2);
        
    return "Resultado "+ (num1 + num2);
    }

}
