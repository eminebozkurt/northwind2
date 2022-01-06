package com.example.northwind2.business.abstracts;

import com.example.northwind2.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
