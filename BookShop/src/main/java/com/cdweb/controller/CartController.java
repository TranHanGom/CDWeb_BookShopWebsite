package com.cdweb.controller;

import java.awt.print.Paper;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManagerFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cdweb.entity.Order;
import com.cdweb.entity.OrderDetail;
import com.cdweb.entity.OrderDetailId;
import com.cdweb.entity.Product;
import com.cdweb.model.Item;
import com.cdweb.model.Pager;
import com.cdweb.service.OrderDetailService;
import com.cdweb.service.OrderService;
import com.cdweb.service.ProductService;
import com.cdweb.service.UserService;

@Controller
@RequestMapping("cart")
public class CartController {
	

	@Autowired
	private ProductService productService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderDetailService orderDetailService;
	@Autowired
	private UserService userService;
	@Autowired
	private OrderDetailService detailService;

	@RequestMapping(method = RequestMethod.GET)
	public String index(HttpSession session, ModelMap model) {
		int countItems = 0;
		int total = 0;
		if (session.getAttribute("cart") != null) {
			List<Item> cart = (List<Item>) session.getAttribute("cart");
			countItems = cart.size();
			for (Item item : cart) {

				total += item.getProduct().getProductPrice() * item.getQuantity();
			}
		}
		model.put("countItems", countItems);

		model.put("total", total);

		return "cart";
	}

	@RequestMapping(value = "buy/{productId}", method = RequestMethod.GET)
	public String buy(@PathVariable("productId") int roomId, HttpSession session) {
		if (session.getAttribute("cart") == null) {
			List<Item> cart = new ArrayList<Item>();
			cart.add(new Item(productService.findById(roomId), 1));
			session.setAttribute("cart", cart);

		} else {
			List<Item> cart = (List<Item>) session.getAttribute("cart");
			int index = exists(roomId, cart);
			if (index == -1) {
				cart.add(new Item(productService.findById(roomId), 1));
			} else {
				int newQuantity = cart.get(index).getQuantity() + 1;
				cart.get(index).setQuantity(newQuantity);
			}
		}

		return "redirect:/cart";
	}

	@RequestMapping(value = "remove/{index}", method = RequestMethod.GET)
	public String remove(@PathVariable("index") int index, HttpSession session) {
		List<Item> cart = (List<Item>) session.getAttribute("cart");
		cart.remove(index);
		session.setAttribute("cart", cart);
		return "redirect:/cart";
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(@RequestParam("quantity") int[] quantity, HttpSession session) {
		if (session.getAttribute("cart") != null) {
			List<Item> cart = (List<Item>) session.getAttribute("cart");
			for (int i = 0; i < cart.size(); i++) {
				cart.get(i).setQuantity(quantity[i]);
			}
		}
		return "redirect:/cart";
	}

	public int exists(int id, List<Item> cart) {
		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i).getProduct().getProductId() == id) {
				return i;
			}
		}
		return -1;
	}

    @RequestMapping(value = "checkout", method = RequestMethod.GET)
	public String addOrder(Authentication authen,HttpSession session) {
    
    		if (authen==null) {
    			return "redirect:/login";
    		} else {
    			
    			
    		
		if (session.getAttribute("cart") != null) {

			Order order = new Order();
			order.setDate(new Date());
		order.setUser(userService.findByEmail(authen.getName()));
			order.setStatus(true);
			
			order = orderService.save(order);
			List<Item> cart = (List<Item>) session.getAttribute("cart");
			for (Item item:cart) {
				OrderDetail detail=new OrderDetail();
				
				//detail.setId(new OrderDetailId(order.getId(), item.getProduct().getProductId()));
				detail.setId(new OrderDetailId(order.getId(), (item.getProduct().getProductId()), item.getProduct().getProductPrice(), item.getQuantity()));
				
				
				detail=orderDetailService.save(detail);
			}
			session.removeAttribute("cart");
			
		}
    }

		return "checkout";
	
	}
	
}

	

