package com.spring.day4.controller;

import com.spring.day4.dto.Product;
import com.spring.day4.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    private static final List<Product> products = new ArrayList<>();

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @PostMapping("api/products")
    public void save(@RequestBody Product product){
        productService.saveProduct(product);
    }

    @GetMapping("api/products")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping(value = "api/product",params = "id")
    public Product findOneById(@RequestParam int id){
        return productService.findOne(id);
    }

    @GetMapping(value = "api/products", params = "name")
    public Optional<Product> findOneByName(@RequestParam String name){
        return productService.findByName(name);
    }
}
