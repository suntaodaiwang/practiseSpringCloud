package com.example.orderservice.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.orderservice.pojo.Order;
import com.example.orderservice.service.IOrderService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderService orderService;
    @GetMapping("/{id}")
    public JSONObject getOrderById(@PathVariable String id){
        Long id2 = Long.valueOf(id);
        Order order = orderService.findById(id2);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("order",order);
        return jsonObject;
    }
}
