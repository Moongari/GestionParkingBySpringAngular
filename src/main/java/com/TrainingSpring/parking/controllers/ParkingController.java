package com.TrainingSpring.parking.controllers;


import com.TrainingSpring.parking.models.Parking;
import com.TrainingSpring.parking.services.IParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ParkingController {


    @Autowired
    private IParkingService parkingService;



    //obtenir la liste des parking
    @RequestMapping(path = "/api/parkings", method = RequestMethod.GET)
    @ResponseStatus(code = HttpStatus.OK)
    public List<Parking> getListParkings(){

/*        List<Parking>  parkingList = new ArrayList<>();
        parkingList.add(new Parking("Dole",200,"Ouvert","12H15",50));
        parkingList.add(new Parking("Tavaux",120,"Ouvert","13H20",100));*/

        
        return  parkingService.getListParkings();
    }


}
