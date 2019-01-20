package com.java.myrotiuk.qubit.rest.service;


import com.java.myrotiuk.qubit.rest.model.Order;
import com.java.myrotiuk.qubit.rest.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ivan on 20.01.2019. All rights reserved.
 */
@Service
public class CoffeeServiceImpl implements CoffeeService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order makeOrder(Order order) {
        return orderRepository.save(order);
    }
}
