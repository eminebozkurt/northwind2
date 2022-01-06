package com.example.northwind2.business.concretes;

import com.example.northwind2.business.abstracts.ProductService;
import com.example.northwind2.dataAccess.abstracts.ProductDao;
import com.example.northwind2.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
