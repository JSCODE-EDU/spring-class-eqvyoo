package com.spring.day4;

import org.springframework.stereotype.Service;

import java.util.List;

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
        return productRepository.findOne(id);
    }

}
