package com.API.ParkingSystem.parkingBoy;

import com.API.ParkingSystem.car.orderService;
import com.API.ParkingSystem.parkingLot.parkingLotService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("parkingBoyService")
public class parkingBoyService {

    private static List<parkingBoy> parkingBoyList=new ArrayList<>();

    public  List<parkingBoy> addParkingBoy(parkingBoy parkingBoys) {
        parkingBoyList.add(parkingBoys);
        return parkingBoyList;
    }

    public List<parkingBoy> addParkingLotToParkingBoy(int parkingBoyId, int parkingLotId) {
        parkingBoyList.get(parkingBoyId-1).id=parkingBoyId;
        parkingBoyList.get(parkingBoyId-1).parkingLotList.add(parkingLotService.selectParkingLot().get(parkingLotId-1));
        return parkingBoyList;
    }

    public List<parkingBoy> updateParkingBoy(int id, parkingBoy parkingBoy) {
        parkingBoyList.set(id-1,parkingBoy);
        return parkingBoyList;
    }

    public List<parkingBoy> selectParkingBoy() {
        return parkingBoyList;
    }

    public List<parkingBoy> deleteParkingLot(int id) {
        parkingBoyList.remove(id-1);
        return parkingBoyList;
    }
    public List<parkingBoy> parkCar() {
        if(orderService.orderList.size()!=0)
        for(int i=0;i<parkingBoyList.size();i++){
            for(int n=0;n<parkingBoyList.get(i).parkingLotList.size();n++)
            if(parkingBoyList.get(i).parkingLotList.get(n).getSize()!=0){
                parkingBoyList.get(i).parkingLotList.get(n).setSize(parkingBoyList.get(i).parkingLotList.get(n).getSize()-1);
                parkingBoyList.get(i).parkingLotList.get(n).receiptList.put(orderService.orderList.remove(0),orderService.orderList.remove(0));
                parkingBoyList.get(i).parkingLotList.get(n).receiptList=(orderService.orderList);
                orderService.orderList.remove(0);
            }
        }
        return parkingBoyList;
    }
}
