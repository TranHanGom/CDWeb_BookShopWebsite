package com.cdweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdweb.entity.Category;
import com.cdweb.entity.Order;
import com.cdweb.entity.OrderDetail;
import com.cdweb.entity.OrderDetailId;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,OrderDetailId> {

}
