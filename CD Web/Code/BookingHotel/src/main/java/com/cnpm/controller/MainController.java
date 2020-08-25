package com.cnpm.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.cnpm.service.RoomService;
import com.cnpm.service.RoomTypeService;
import com.cnpm.utils.ImageUtil;
@Controller
public class MainController {
	@Autowired
	private RoomTypeService roomTypeService;
	@Autowired
	private RoomService roomService;
	

    @GetMapping("/")
    public String root() {
        return "/index";
    }
    @GetMapping("/room")
    public String list(Model model ) {
        model.addAttribute("roomtypes", roomTypeService.findAll());
        model.addAttribute("rooms", roomService.findAll());
      
       
        return "room";
    }
    @GetMapping("/roomdetail")
    public String roomdetail() {
        return "roomdetail";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/payment")
    public String payment() {
        return "payment";
    }
    
    @GetMapping("/register")
    public String register() {
        return "register";
    }
   
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
