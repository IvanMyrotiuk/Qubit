package com.java.myrotiuk.qubit.rest.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by Ivan on 20.01.2019. All rights reserved.
 */
@Data
public class Order {
    private Long id;
    private CoffeeType coffeeType;
    private LocalDateTime deliverTime;
    private OrderStatus orderStatus = OrderStatus.IN_PROGRESS;
}
