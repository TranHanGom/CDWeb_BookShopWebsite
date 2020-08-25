package com.cnpm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnpm.model.Booking;
import com.cnpm.model.BookingDetail;
import com.cnpm.service.BookingDetailService;
import com.cnpm.service.BookingService;
import com.cnpm.utils.*;

@Controller
@RequestMapping("payment")
public class PaymentController {
	@Autowired
	private BookingDetailService bookingdetailService;
	
//	
//	@RequestMapping(value="addbook",method = RequestMethod.GET)
//    public String addbook(HttpSession session,ModelMap model) {
//		if (session.getAttribute("stay")!= null) {
//			List<Item> stay=(List<Item>) session.getAttribute("stay");
//			for (Item item :stay) {
//				
//				BookingDetail book=new BookingDetail();
//				
//				
//				bookingdetailService.save(book);
//			
//								
//			
//				
//			}
//			session.removeAttribute("stay");
//			
//		}
//		return "redirect:/payment";
//    }
}
