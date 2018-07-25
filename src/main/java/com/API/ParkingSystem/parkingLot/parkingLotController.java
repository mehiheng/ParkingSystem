package com.API.ParkingSystem.parkingLot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class parkingLotController {
    @Autowired
    parkingLotService parkingLotService;
    @PostMapping("/parkingLots")
    public List<parkingLot> addParkingLot(@RequestBody parkingLot parkingLots){
        return parkingLotService.addParkingLot(parkingLots);
    }
    @GetMapping("/parkingLots")
    public  List<parkingLot> selectParkingLot(){
        return parkingLotService.selectParkingLot();
    }
    @DeleteMapping("/parkingLots/{id}")
    public List<parkingLot> deleteParkingLot(@PathVariable int id){
        return parkingLotService.deleteParkingLot(id);
    }
    @PutMapping("/parkingLots/{id}")
    public List<parkingLot> updateParkingLot(@PathVariable int id,@RequestBody parkingLot parkingLot){
        return parkingLotService.updateParkingLot(id,parkingLot);
    }
}
