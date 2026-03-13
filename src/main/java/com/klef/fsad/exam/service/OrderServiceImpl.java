package com.klef.fsad.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Order;
import com.klef.fsad.exam.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService
{
    @Autowired
    private OrderRepository orderRepository;

    public String addOrder(Order order)
    {
        orderRepository.save(order);
        return "Order Added Successfully";
    }

    public List<Order> viewAllOrders()
    {
        return orderRepository.findAll();
    }
}