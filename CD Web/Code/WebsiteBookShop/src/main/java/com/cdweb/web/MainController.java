package com.cdweb.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdweb.model.Product;
import com.cdweb.service.ProductService;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "index";
    }
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
    @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }
    @GetMapping("/user")
    public String userIndex() {
        return "user/home";
    }
    @Autowired
	private ProductService service; 
	
	@RequestMapping("/productlist")
	public String viewProductPage(Model model) {
		List<Product> listProducts = service.listAll();
		model.addAttribute("listProducts", listProducts);
		
		return "productlist";
	}
	
   
}
