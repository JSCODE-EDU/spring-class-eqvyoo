package com.spring.day4;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private static final List<Product> products = new ArrayList<>();

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @PostMapping("api/products")
    public String save(@RequestBody Product product){
        productService.saveProduct(product);
        return "잘 저장됨";
    }
    @GetMapping("api/products")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("api/product")
    public Product findOne(@RequestParam int id){
        return productService.findOne(id);
    }
}
