package com.API.ParkingSystem.car;

import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("orderService")
public class orderService {

    public static Map<String,String> orderList=new HashMap<>();

    public order createOrder() {
        if(!receiptService.receiptcarMap.isEmpty()){
            order orders=new order();
            orderList=receiptService.receiptcarMap;
            return orders;
        }else{
            return null;
        }
    }
}
