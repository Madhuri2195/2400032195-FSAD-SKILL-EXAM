package com.klef.fsad.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Order;
import com.klef.fsad.exam.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController 
{
    @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    public String addOrder(@RequestBody Order order)
    {
        return orderService.addOrder(order);
    }

    @GetMapping("/viewall")
    public List<Order> viewAllOrders()
    {
        return orderService.viewAllOrders();
    }
}