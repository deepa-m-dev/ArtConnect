package com.example.ArtConnect.service;



import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ArtConnect.model.Order;
import com.example.ArtConnect.repository.OrderRepository;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(String artworkId, String buyerId) {
        Order order = new Order();
        order.setArtworkId(artworkId);
        order.setBuyerId(buyerId);
        order.setStatus("Pending");
        order.setCreatedAt(new Date());
        return orderRepository.save(order);
    }

    public List<Order> getOrdersByBuyer(String buyerId) {
        return orderRepository.findByBuyerId(buyerId);
    }

	public void deleteOrder(String orderId) {
		
		orderRepository.deleteById(orderId);
	}
}
