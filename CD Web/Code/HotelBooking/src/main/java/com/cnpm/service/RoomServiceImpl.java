package com.cnpm.service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cnpm.model.Room;
import com.cnpm.repository.RoomRepository;
@Service
public class RoomServiceImpl implements RoomService{
	@Autowired
	private RoomRepository roomRepository;

	@Override
	public Iterable<Room> findAll() {
		// TODO Auto-generated method stub
		return roomRepository.findAll();
	}

	@Override
	public Room findById(Integer id) {
		// TODO Auto-generated method stub
		return roomRepository.findById(id).get();
	}

	@Override
	public void save(Room room) {
		// TODO Auto-generated method stub
		roomRepository.save(room);
	}

	@Override
	public void remove(Room room) {
		// TODO Auto-generated method stub
		roomRepository.delete(room);
	}

	

	

	
}
