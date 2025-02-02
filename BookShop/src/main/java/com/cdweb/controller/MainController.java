package com.cdweb.controller;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.cdweb.entity.Order;
import com.cdweb.entity.OrderDetail;
import com.cdweb.entity.OrderDetailId;
import com.cdweb.entity.Product;
import com.cdweb.model.Item;
import com.cdweb.model.PageModel;
import com.cdweb.model.Pager;
import com.cdweb.service.CategoryService;
import com.cdweb.service.OrderDetailService;
import com.cdweb.service.OrderService;
import com.cdweb.service.ProductService;
import com.cdweb.service.UserService;


@Controller
public class MainController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
    private PageModel pageModel;
	
	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderDetailService orderDetailService;

    @GetMapping("/")
    public String root(Model model ) {
    	 model.addAttribute("categories", categoryService.findAll());
         model.addAttribute("products", productService.findAll());
         model.addAttribute("lastestProducts", productService.lastestProducts("lastest"));
         model.addAttribute("trendProducts", productService.lastestProducts("trend"));
        return "index";
    }
    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
    @GetMapping("/list-product")
    public String list(Model model, Pageable pageable ) {
    	 model.addAttribute("categories", categoryService.findAll());
   model.addAttribute("products", productService.findAll());
//    	
//    pageModel.setSIZE(6);
//    pageModel.initPageAndSize();
//    model.addAttribute("products", productService.findAllProductsPageable(PageRequest.of(pageModel.getPAGE(), pageModel.getSIZE())));
//       
        return "list-product";
    }
   
//    @GetMapping("/list-product/{id}")
//	public Product findOne(@PathVariable Integer id) {
//		return productService.findById(id);
//	}
   
    @GetMapping("/admin")
	public String admin() {
		return "admin";
	}
    @GetMapping("/contact")
   	public String contact() {
   		return "contact";
   	}
    @GetMapping("/home")
   	public String home(Model model ) {
   	 model.addAttribute("categories", categoryService.findAll());
     model.addAttribute("products", productService.findAll());
     model.addAttribute("lastestProducts", productService.lastestProducts("lastest"));
     model.addAttribute("trendProducts", productService.lastestProducts("trend"));
   		return "home";
   	}
   
   
}
