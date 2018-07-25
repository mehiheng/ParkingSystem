package com.API.ParkingSystem.parkingLot;

import java.util.HashMap;
import java.util.Map;

public class parkingLot {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    int id;
    int size;
    public Map<String, String> receiptList=new HashMap<String, String>();
    public parkingLot(){}
    public parkingLot(int a,int b){
        this.size=a;
        this.id=b;
    }
}
