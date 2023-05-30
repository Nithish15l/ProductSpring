package com.nithish.productspring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {

    List<Product> findAllByNameContainingIgnoreCase(String name);

    @Query("SELECT p FROM Product p WHERE lower(p.name) LIKE %:text% OR lower(p.type) LIKE %:text% OR lower(p.place) LIKE %:text%")
    List<Product> findProdsByText(String text);

    List<Product> findAllByWarrantyLessThan(int currentYear);
}
