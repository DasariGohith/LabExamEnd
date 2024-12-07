package com.klef.jfsd.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.model.Order;
import com.klef.jfsd.springboot.service.OrderService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("order")
public class OrderController
{
	@Autowired  //communication between controller and service layer
	private OrderService service;
	
	@GetMapping("/")
	public String home()
	{
		return "Spring Boot Rest API Project";
	}
	
	@PostMapping("add")
	public String addorder(@RequestBody Order o)
	{
		return service.addorder(o);
	}
	
	
	
}