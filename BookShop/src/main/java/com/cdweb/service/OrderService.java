package com.cdweb.service;

import com.cdweb.entity.Category;
import com.cdweb.entity.Order;

public interface OrderService {
	public Iterable<Order> findAll();
	Order save(Order order);

}
