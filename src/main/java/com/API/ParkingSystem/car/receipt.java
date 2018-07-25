package com.API.ParkingSystem.car;

import java.util.UUID;

public class receipt {
    String receiptId;
    public receipt (){
        receiptId=UUID.randomUUID().toString();
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }
}
