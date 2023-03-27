package com.spring.day4.service;

import com.spring.day4.dto.Product;
import com.spring.day4.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProduct(Product product){
        productRepository.saveProduct(product);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findOne(int id){
        return productRepository.findOneByID(id);
    }

    public Optional<Product>findByName(String name){
        return productRepository.findOneByName(name);
    }
}
