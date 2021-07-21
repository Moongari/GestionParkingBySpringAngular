package com.TrainingSpring.parking.controllers;


import com.TrainingSpring.parking.GestionExceptions.CtrlExceptions;
import com.TrainingSpring.parking.dao.ParkingApiDao;
import com.TrainingSpring.parking.dao.entity.RecordEntity;
import com.TrainingSpring.parking.dao.entity.ReponseParkingAPIEntity;
import com.TrainingSpring.parking.models.Parking;
import com.TrainingSpring.parking.services.IParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ParkingController {

    @Autowired
    private IParkingService parkingService;


    @CrossOrigin("http://localhost:4200")
    @RequestMapping(path = "/api/parkings")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Parking> getListParkings(){

     /*   if(parkingService.getListParking().size() == 0){
            throw  new CtrlExceptions("La liste des parkings est vide !!");
        }*/
      
       return parkingService.getListParking();
    }



}
