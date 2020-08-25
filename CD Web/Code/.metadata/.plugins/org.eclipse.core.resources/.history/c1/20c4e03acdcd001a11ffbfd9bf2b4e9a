package com.cnpm.service;

	import java.util.List;
	 
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

import com.cnpm.model.Room;
import com.cnpm.repository.RoomRepository;
	 
	@Service
	@Transactional
	public class RoomService {
	 
	    @Autowired
	    private RoomRepository repo;
	    
	    public List<Room> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Room product) {
	        repo.save(product);
	    }
	     
	    public Room get(int id) {
	        return repo.findById(id).get();
	    }
	     
	   
	
	   
}
