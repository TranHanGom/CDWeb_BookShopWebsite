package com.cdweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdweb.entity.Category;
import com.cdweb.entity.Order;
import com.cdweb.repository.CategoryRepository;
import com.cdweb.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderRepository orderRepository;
	@Override
	public Iterable<Order> findAll() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}
	@Override
	public Order save(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

}
