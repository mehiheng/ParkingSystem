package com.API.ParkingSystem.car;

import java.util.UUID;

public class order {
    String orderId;

    public order(){
        orderId=UUID.randomUUID().toString();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}

