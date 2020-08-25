package com.cnpm.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnpm.utils.*;
import com.cnpm.model.Booking;

import com.cnpm.model.Room;

import com.cnpm.service.BookingService;
import com.cnpm.service.RoomService;

@Controller
@RequestMapping("booking")
public class BookingController {
	@Autowired
	private RoomService roomService;
	
	@Autowired
	private BookingService bookingService;
	
	
	@RequestMapping(method = RequestMethod.GET)
    public String index(HttpSession session,ModelMap model) {
	int countItems=0;
	double total=0;
	if (session.getAttribute("stay" )!=null) {
		List<Item> cart=(List<Item>) session.getAttribute("stay");
		countItems=cart.size();
		for(Item item: cart) {
			
			total+=item.getRoom().getRoomPrice()* item.getQuantity();
		}
	}
	model.put("countItems", countItems);
	model.put("total", total);
	
	
        return "booking";
    }
	@RequestMapping(value="book/{roomId}", method = RequestMethod.GET)
    public String buy( @PathVariable("roomId") int roomId,HttpSession session) {
		if (session.getAttribute("stay")==null) {
			List<Item> stay= new ArrayList<Item>();
			stay.add(new Item(roomService.findById(roomId),1));
			session.setAttribute("stay", stay);
			
		}else {
			List<Item> stay=(List<Item>) session.getAttribute("stay");
			int index=exists(roomId, stay);
			if (index==-1) {
				stay.add(new Item(roomService.findById(roomId),1));
			}else {
				int newQuantity=stay.get(index).getQuantity()+1;
				stay.get(index).setQuantity(newQuantity);
			}
		}
	        
        return "redirect:/booking";
    }
	@RequestMapping(value="remove/{index}", method = RequestMethod.GET)
    public String remove( @PathVariable("index") int index,HttpSession session) {
		List<Item> stay=(List<Item>) session.getAttribute("stay"); 
	    stay.remove(index);
	    session.setAttribute("stay", stay);
        return "redirect:/booking";
    }
	
	public int exists(int id,List<Item> stay) {
		for (int i = 0; i < stay.size(); i++) {
			if (stay.get(i).getRoom().getRoomId()==id){
				return i;
			}
		}
		return -1;
	}


}
