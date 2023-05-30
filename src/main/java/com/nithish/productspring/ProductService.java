package com.nithish.productspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.Year;
import java.util.Collections;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDB db;

    /* Add Product to List: products */
    public void addProduct(Product p) {
        db.save(p);
    }

    /* Return All Products in a List */
    public List<Product> getAllProducts() {
        return db.findAll();
    }

    // Search a Product By Name
    public List<Product> getProductByName(String name) {
        List<Product> list = db.findAllByNameContainingIgnoreCase(name);
        return checkInput(name, list);
    }

      // Search a Product By Text
    public List<Product> getProductWithText(String text) {
        List<Product> list = db.findProdsByText(text);
        return checkInput(text, list);
    }

    /* List Products Out of Warranty */

    public List<Product> getOutOfWarranty() {
        int currentYear = Year.now().getValue();
        return db.findAllByWarrantyLessThan(currentYear);
    }

    private static List<Product> checkInput(String input, List<Product> list) {
        if (input.trim().isEmpty() || list.isEmpty()) {
            System.out.println("No Products Found...");
            return Collections.emptyList();
        }
        return list;
    }

}
