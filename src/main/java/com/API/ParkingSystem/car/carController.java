package com.API.ParkingSystem.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class carController {
    @Autowired
    receiptService receiptService;

    @PostMapping("/car")
    public receipt parkCAR(@PathVariable String carId){
        return receiptService.parkCar(carId);
    }
    @DeleteMapping("/car/{receipt}")
    public String unParkCar(@PathVariable String receipt){
        return receiptService.unParkCar(receipt);
    }
}
