package com.API.ParkingSystem.parkingBoy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkingBoyController {
    @Autowired
    parkingBoyService parkingBoyService;

    @PostMapping("/parkingBoys")
    public List<parkingBoy> addParkingBoy(@RequestBody parkingBoy parkingBoys){
        return parkingBoyService.addParkingBoy(parkingBoys);
    }
    @PutMapping("/parkingBoys/{parkingBoyId}/parkingLots/{parkingLotId}")
    public List<parkingBoy> addParkingLotToParkingBoy(@PathVariable int parkingBoyId,@PathVariable int parkingLotId){
        return parkingBoyService.addParkingLotToParkingBoy(parkingBoyId,parkingLotId);
    }
    @GetMapping("/parkingBoys")
    public List<parkingBoy> selectParkingBoy(){
        return parkingBoyService.selectParkingBoy();
    }
    @DeleteMapping("/parkingBoys/{id}")
    public List<parkingBoy> deleteParkingLot(@PathVariable int id){
        return parkingBoyService.deleteParkingLot(id);
    }
    @PutMapping("/parkingBoys/{id}")
    public List<parkingBoy> updateParkingBoy(@PathVariable int id,@RequestBody parkingBoy parkingBoy){
        return parkingBoyService.updateParkingBoy(id,parkingBoy);
    }
    @PutMapping("/parkingBoys/car")
    public List<parkingBoy> parkCar(){
        return parkingBoyService.parkCar();
    }


}
