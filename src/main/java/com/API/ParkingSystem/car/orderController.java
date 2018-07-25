package com.API.ParkingSystem.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class orderController {
    @Autowired
    orderService orderService;

}
