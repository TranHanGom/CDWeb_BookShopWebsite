package com.cnpm.repository;


import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cnpm.model.Room;


@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{
	
}
