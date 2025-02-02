package com.cdweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdweb.entity.Product;






@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Integer> {
	@Query(value=" select * from product where featured =:lastest", nativeQuery=true)
	 List<Product> lastestProducts(@Param("lastest")String lastest);
	@Query(value=" select * from product where featured =:trend", nativeQuery=true)
	 List<Product> trendProducts(@Param("trend")String trend);
	
}

