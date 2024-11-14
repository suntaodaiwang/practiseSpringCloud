package com.example.orderservice.service;

import com.example.orderservice.pojo.Order;

public interface IOrderService {
    Order findById(Long id);
}
