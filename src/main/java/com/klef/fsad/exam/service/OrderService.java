package com.klef.fsad.exam.service;

import java.util.List;
import com.klef.fsad.exam.model.Order;

public interface OrderService 
{
    public String addOrder(Order order);
    public List<Order> viewAllOrders();
}