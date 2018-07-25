package com.API.ParkingSystem.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class receiptController {

    @Autowired
    orderService orderService;
    @PutMapping("/receipt")
    public order createOrder(){
        return orderService.createOrder();
    }


}
