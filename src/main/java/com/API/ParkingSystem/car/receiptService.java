package com.API.ParkingSystem.car;

import org.springframework.stereotype.Service;

import java.util.*;

import static com.API.ParkingSystem.parkingLot.parkingLotService.parkingLots;

@Service("receiptService")

public class receiptService {
    static Map<String,String> receiptcarMap=new HashMap<>();
    public receipt parkCar(String carId) {
        if(parkingLots.size()!=0){
            receipt receiptId=new receipt();
            receiptcarMap.put(receiptId.receiptId,carId);
            return receiptId;
        }
        return null;
    }

    public String unParkCar(String receipt) {
        String result="";
        for(int i=0;i<parkingLots.size();i++){
           if(parkingLots.get(i).receiptList.containsKey(receipt)){
                result+= parkingLots.get(i).receiptList.remove(receipt);
           }
        }
        return result;
    }
}
