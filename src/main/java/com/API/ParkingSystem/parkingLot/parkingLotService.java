package com.API.ParkingSystem.parkingLot;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("parkingLotService")
public class parkingLotService {
    public static List<parkingLot> parkingLots=new ArrayList<>();


    public  List<parkingLot> addParkingLot(parkingLot parkingLot) {
        parkingLots.add(parkingLot);
        return parkingLots;
    }

    public static List<parkingLot> selectParkingLot() {
        return parkingLots;
    }

    public List<parkingLot> deleteParkingLot(int id) {
        parkingLots.remove(id-1);
        return parkingLots;
    }

    public List<parkingLot> updateParkingLot(int id, parkingLot parkingLot) {
        parkingLots.set(id-1,parkingLot);
        return parkingLots;
    }
}
