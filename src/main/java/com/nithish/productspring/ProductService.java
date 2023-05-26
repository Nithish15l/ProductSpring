package com.nithish.productspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDB db;

//    /* Add Product to List: products */
//    public void addProduct(Product p) {
//        db.save(p);
//    }

    /* Return All Products in a List */
    public List<Product> getAllProducts() {
        return db.findAll();
    }

//    // Search a Product By Name
//    public List<Product> getProductByName(String name) {
//        return db.getProductByName(name);
//    }
//
//    // Search a Product By Text
//    public List<Product> getProductWithText(String text) {
//        return db.getProductWithText(text);
//   }
//
//    /* List Products Out of Warranty */
//    public List<Product> getOutOfWarranty() {
//        return db.getOutOfWarranty();
//    }
//

}
