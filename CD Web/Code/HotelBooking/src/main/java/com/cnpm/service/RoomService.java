package com.cnpm.service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.cnpm.model.Room;

public interface RoomService {
	public Iterable<Room> findAll();
	Room findById(Integer id);
	void save(Room room);
    void remove(Room room);
}
