package com.spring.day4;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private static final List<Product> products = new ArrayList<>();
    public void saveProduct(Product product){
        products.add(product);
    }

    public List<Product> findAll(){
        return products;
    }

    public Product findOne(int id){
        return products.get(id);
    }
}
