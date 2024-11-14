package com.example.orderservice.service.serviceImp;

import com.example.orderservice.Mapper.OrderMapper;
import com.example.orderservice.pojo.Order;
import com.example.orderservice.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImp implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Override
    public Order findById(Long id) {
        return orderMapper.findById(id);
    }
}
