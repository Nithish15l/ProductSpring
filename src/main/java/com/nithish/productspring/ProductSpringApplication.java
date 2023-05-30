package com.nithish.productspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);

        ProductService service = context.getBean(ProductService.class);

//        Product product = new Product("Apple", "SmartPhone", "Yellow", 2045);
//        service.addProduct(product);

//        service.getAllProducts().forEach(System.out::println);  //get All Products
//        service.getProductByName("").forEach(System.out::println);
//        service.getProductWithText("").forEach(System.out::println);
//        service.getOutOfWarranty().forEach(System.out::println);

    }

}
