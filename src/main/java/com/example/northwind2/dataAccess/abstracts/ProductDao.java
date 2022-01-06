package com.example.northwind2.dataAccess.abstracts;

import com.example.northwind2.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
