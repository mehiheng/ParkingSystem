package com.API.ParkingSystem.parkingBoy;

import com.API.ParkingSystem.parkingLot.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class parkingBoy {
    int id;
    List<parkingLot> parkingLotList=new ArrayList<>();
    public parkingBoy(int a){
        this.id=a;
    }
    public parkingBoy(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<parkingLot> getParkingLotList() {
        return parkingLotList;
    }

    public void setParkingLotList(List<parkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }
}
