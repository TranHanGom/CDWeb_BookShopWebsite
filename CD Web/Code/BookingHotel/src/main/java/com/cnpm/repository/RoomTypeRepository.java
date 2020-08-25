package com.cnpm.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cnpm.model.Roomtype;
@Repository
public interface RoomTypeRepository extends JpaRepository<Roomtype, Integer> 
{
 
	 List<Roomtype> findByNameContaining(String term);
}
