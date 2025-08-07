package br.com.aweb.crud_no_db.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aweb.crud_no_db.dto.productDTO;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/products")
public class ProductController {

    private Map<Long, productDTO> products = new HashMap<>();
    private Long nextid = 1L;

    @GetMapping
    public List<productDTO> allProducts(){
        return new ArrayList<>(products.values());
        
    }
    @GetMapping("/id")
    public productDTO getProductById(@PathVariable Long id) {
        return products.get(id);
    }

    @PostMapping
    public productDTO createProduct(@RequestBody productDTO product){
        
    }
    

    
}
