package com.java.myrotiuk.qubit.rest.controller;

import com.java.myrotiuk.qubit.rest.model.CoffeeType;
import com.java.myrotiuk.qubit.rest.model.Order;
import com.java.myrotiuk.qubit.rest.model.OrderDTO;
import com.java.myrotiuk.qubit.rest.service.CoffeeServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ivan on 20.01.2019. All rights reserved.
 */
@RestController
public class OrderCoffeeController {

    @Autowired
    private CoffeeServiceImpl coffeeService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping(value = "coffee/order")
    public ResponseEntity<Order> makeOrder(@RequestBody OrderDTO orderDTO) {
        Order order = modelMapper.map(orderDTO, Order.class);
        return ResponseEntity.ok(coffeeService.makeOrder(order));
    }

    @GetMapping(value = "coffee/list")
    public ResponseEntity<List<CoffeeType>> listTypesOfCoffee() {
        return ResponseEntity.ok(Arrays.asList(CoffeeType.values()));
    }
}
