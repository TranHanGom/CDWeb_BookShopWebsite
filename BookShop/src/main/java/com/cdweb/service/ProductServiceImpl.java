package com.cdweb.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.stereotype.Service;

import com.cdweb.entity.Product;
import com.cdweb.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	private Map<Product, Integer> products = new HashMap<>();

	@Autowired
	private ProductRepository productRepository;
	

	
	@Override
	public Iterable<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}
	@Override
	public Page<Product> findAllProductsPageable(Pageable pageable) {
		// TODO Auto-generated method stub
		 return productRepository.findAll(pageable);
    }
	@Override
	public Page<Product> listAll(int pageNum, String sortField, String sortDir) {
		// TODO Auto-generated method stub
		Pageable pageable = PageRequest.of(pageNum - 1, 5, 
				sortDir.equals("asc") ? Sort.by(sortField).ascending()
									  : Sort.by(sortField).descending()
		);
		
		return productRepository.findAll(pageable);
	}

	@Override
	public Product findOne(int id) {
		// TODO Auto-generated method stub
		return productRepository.getOne(id);
	}
	@Override
	public List<Product> lastestProducts(String lastest) {
		// TODO Auto-generated method stub
		return productRepository.lastestProducts(lastest);
	}
	@Override
	public List<Product> trendProducts(String trend) {
		// TODO Auto-generated method stub
		return productRepository.trendProducts(trend);
	}
	
	
	
	
		
	
	
}
