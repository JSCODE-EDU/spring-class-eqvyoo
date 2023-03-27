package com.spring.day4.repository;

import com.spring.day4.dto.Product;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private static final List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product("컴퓨터", 3000));
        products.add(new Product("키보드", 2000));
        products.add(new Product( "마우스", 1000));
    }
    public void saveProduct(Product product){
            if(findOneByName(product.getName()).isPresent()) {
                System.out.println("상품 등록에 실패했습니다.");
            }
            else {
                products.add(product);
                System.out.println("상품 등록에 성공했습니다.");
            }
    }

    public List<Product> findAll(){
        return products;
    }

    public Product findOneByID(int id){
        return products.get(id);
    }

    public Optional<Product> findOneByName(String name){return products.stream().filter(product->product.getName().equals(name)).findAny();}


}
