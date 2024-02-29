package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ProductModel;
import com.example.demo.service.ProductService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class ProductController {
    private ProductService productService;
   
    
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/product")
    public ResponseEntity <ProductModel>postProduct(@RequestBody ProductModel productModel)
    {
         if (productService.saveProduct(productModel)==true) {
            return new ResponseEntity<>(productModel,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(productModel,HttpStatus.NOT_FOUND);

    }
    @GetMapping("/product/{id}")
    public ResponseEntity <ProductModel>getproduct(@PathVariable("id")int id)
    {
         ProductModel p= productService.getByProductId(id);
         if(p==null)
         {
            return new ResponseEntity<>(p,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(p,HttpStatus.OK);
    }
    @GetMapping("/product")
   public ResponseEntity<List<ProductModel>>getProduct()
   {
           List<ProductModel>b=productService.getProduct();
           if(b.size()==0)
           {
            return new ResponseEntity<>(b,HttpStatus.NOT_FOUND);
           }
           return new ResponseEntity<>(b,HttpStatus.CREATED);
   }
    
    
}
