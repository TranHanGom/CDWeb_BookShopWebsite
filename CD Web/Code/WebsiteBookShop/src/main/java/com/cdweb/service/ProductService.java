package com.cdweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdweb.model.Product;
import com.cdweb.repository.ProductRepository;


 
@Service
@Transactional
public class ProductService {
 
    @Autowired
    private ProductRepository repo;
    
    public List<Product> listAll() {
        return repo.findAll();
    }
     
    public void save(Product product) {
        repo.save(product);
    }
     
    public Product get(int id) {
        return repo.findById(id).get();
    }
     
   

   
}