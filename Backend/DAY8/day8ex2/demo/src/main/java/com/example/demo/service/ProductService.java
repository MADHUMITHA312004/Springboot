package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;

@Service
public class ProductService {
    private ProductRepo productRepo;
    public ProductService(ProductRepo productRepo)
    {
        this.productRepo=productRepo;
    }

    public boolean saveMethod(Product product)
    {
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }

    public List<Product> nameStartWith(String name)
    {
        return productRepo.findByDistinctProductNameStartWithname(name);
    }

    public List<Product> nameEndWith(String name)
    {
        return productRepo.findByDistinctProductNameEndWithname(name);
    }

    public List<Product> sortByPrice()
    {
        return productRepo.findByDistinctProductsSortByPrice();
    }
}
