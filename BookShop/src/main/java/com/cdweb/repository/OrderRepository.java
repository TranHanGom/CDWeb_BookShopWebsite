package com.cdweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdweb.entity.Category;
import com.cdweb.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
