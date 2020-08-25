package com.cnpm.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnpm.model.Booking;
import com.cnpm.service.BookingService;

@Controller
public class CustomerController {
	@Autowired
	private BookingService bookingService;
	
//	@RequestMapping(value="add", method = RequestMethod.GET)
//    public String add(Model model) {
//        Booking booking= new Booking();
//        booking.setStatus("pending");
//        booking.setCreateDate(new Date());
//        
//        model.addAttribute("booking", booking);
//        return "redirect:/payment";
//    }
//	@RequestMapping(value="add", method = RequestMethod.POST)
//    public String add(@ModelAttribute("booking") Booking booking,ModelMap model) {
//		
//        
//		bookingService.save(booking);
//		
//        return "redirect:/payment";
//    }
	@GetMapping("/customerinfo")
	  public String greetingForm(Model model) {
		 Booking booking= new Booking();
       booking.setStatus("pending");
       booking.setCreateDate(new Date());
       
       model.addAttribute("booking", booking);
	    return "customerinfo";
	  }

	  @PostMapping("/customerinfo")
	  public String greetingSubmit(@ModelAttribute Booking booking, Model model) {
		  
	       booking.setStatus("pending");
	       booking.setCreateDate(new Date());
		  bookingService.save(booking);
		 
	    model.addAttribute("booking", booking);
	   
	    return "payment";
	  }
	
}