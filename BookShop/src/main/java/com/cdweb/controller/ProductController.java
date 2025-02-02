package com.cdweb.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdweb.model.Item;
import com.cdweb.service.ProductService;

@Controller
@RequestMapping("/product-detail")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	@RequestMapping(value = "details/{productId}", method = RequestMethod.GET)
	public String details(@PathVariable("productId") int productId, ModelMap model) {
		model.put("product", productService.findById(productId));
		return "product-detail";
	}
}
