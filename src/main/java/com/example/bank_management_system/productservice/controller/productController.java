package com.example.bank_management_system.productservice.controller;

import com.example.bank_management_system.productservice.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class productController {
    //for get url : localhost:8080/product/1/tanu?mediaType=json
    @GetMapping(path="/{id}/{temp}")
    public Product getProductById(@PathVariable("id") int id, @PathVariable("temp") String name){
        Product prod = new Product();
        prod.setId( id);
        prod.setFirstName(name);
        prod.setLastName("Gupta");
        return prod;
    }
//@RequestBody -> Convert the received Json to a Product Java object
    @PostMapping(path="")
    //@PostMapping(path="", produces = "application/xml") we can do in this way as well to return our java object as a xml format

    public Product createProduct(@RequestBody Product product){
        return product;
    }

}
