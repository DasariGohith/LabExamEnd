package com.klef.jfsd.springboot.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.jfsd.springboot.model.Order;
import com.klef.jfsd.springboot.repository.OrderRepository;

@Service //it denotes the service layer
public class OrderServiceImpl implements OrderService
{
	@Autowired //for communication between repository and service layer
    private OrderRepository repository;	
	@Override
	public String addorder(Order o) {
		
		repository.save(o);
		return "order added successfully";
	}



}
