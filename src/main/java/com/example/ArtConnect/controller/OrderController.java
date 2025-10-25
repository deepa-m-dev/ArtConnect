package com.example.ArtConnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ArtConnect.service.OrderService;

@Controller
	public class OrderController {

	    @Autowired
	    private OrderService orderService;

	    @PostMapping("/orders/delete/{orderId}")
	    public String deleteOrder(@PathVariable String orderId) {
	        orderService.deleteOrder(orderId); // implement in service
	        return "redirect:/buyer-dashboard";
	    }
	}


