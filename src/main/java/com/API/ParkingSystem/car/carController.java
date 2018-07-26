package com.API.ParkingSystem.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class carController {
    @Autowired
    receiptService receiptService;

    @GetMapping("/car/{carId}")
    public receipt parkCAR(@PathVariable String carId){
        return receiptService.parkCar(carId);
    }
    @DeleteMapping("/car/{receipt}")
    public String unParkCar(@PathVariable String receipt){
        return receiptService.unParkCar(receipt);
    }
}
