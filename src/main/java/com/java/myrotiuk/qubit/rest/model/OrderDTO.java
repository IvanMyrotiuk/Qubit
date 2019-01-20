package com.java.myrotiuk.qubit.rest.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by Ivan on 20.01.2019. All rights reserved.
 */
@Data
@NoArgsConstructor
public class OrderDTO {
    private CoffeeType coffeeType;
    private LocalDateTime deliverTime;
}
