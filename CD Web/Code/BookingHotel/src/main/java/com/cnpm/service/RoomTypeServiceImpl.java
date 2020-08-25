package com.cnpm.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnpm.model.Roomtype;
import com.cnpm.repository.RoomTypeRepository;

@Service

public class RoomTypeServiceImpl implements RoomTypeService {

	
	@Autowired
	private RoomTypeRepository roomTypeRepository;
	@Override
	public Iterable<Roomtype> findAll() {
		// TODO Auto-generated method stub
		return roomTypeRepository.findAll();
	}

}
