package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.ProductModel;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public boolean saveProduct(ProductModel productModel)
    {
        try {
            productRepository.save(productModel);
            
        } 
        catch (Exception e) {
            return false;
        }
        return true;
    }
    public ProductModel getByProductId(int id)
    {
         return productRepository.findById(id).orElse(null);
    }
    public List<ProductModel>getProduct()
    {
        return productRepository.findAll();
    }
}
