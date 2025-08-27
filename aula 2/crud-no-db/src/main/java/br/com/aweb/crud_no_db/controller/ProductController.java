package br.com.aweb.crud_no_db.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aweb.crud_no_db.dto.ProductDTO;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/products")
public class ProductController {
    
    private Map<Long, ProductDTO> products = new HashMap<>();
    private Long nextId = 1L;

    //listar todos os produtos
    @GetMapping
    public List<ProductDTO> allProducts(){
        return new ArrayList<>(products.values());
    }

    //procurar prodtos por id
    @GetMapping("/{id}")
    public ProductDTO getProductById(@PathVariable Long id) {
        return products.get(id);
    }
    
    //criar produto
    @PostMapping
    public ProductDTO createProduct(@RequestBody ProductDTO product){
        product.setId(nextId++);
        products.put(product.getId(), product);
        return product;
    }
    // remover produto
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id){
        if(products.remove(id)!= null)
            return "produto removido";
        return "produto não encontrado";
    }

    @GetMapping("/{id}")
    public ProductDTO updateProduct(@PathVariable Long id,
    @RequestBody ProductDTO updateProduct) {
        if(products.containsKey(id)){
            updateProduct.setId(id);
            products.put(id, updateProduct);
        }
        return null;
        
    }
    
}
