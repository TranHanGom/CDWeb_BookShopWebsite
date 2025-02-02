package com.cdweb.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cdweb.entity.Product;

public interface ProductService {
	public Iterable<Product> findAll();

	Product findById(Integer id);

	Page<Product> findAllProductsPageable(Pageable pageable);

	Page<Product> listAll(int pageNum, String sortField, String sortDir);

	List<Product> lastestProducts(String lastest);
	List<Product> trendProducts(String trend);
	Product findOne(int id);
	
}
