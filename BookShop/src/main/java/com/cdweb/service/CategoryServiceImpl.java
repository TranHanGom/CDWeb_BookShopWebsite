package com.cdweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdweb.entity.Category;
import com.cdweb.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryRepository categoryRepository;
	@Override
	public Iterable<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

}
