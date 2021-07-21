package com.TrainingSpring.parking.services.ImplementService;

import com.TrainingSpring.parking.models.Parking;
import com.TrainingSpring.parking.services.IParkingService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingServiceImpl implements IParkingService {
    @Override
    public List<Parking> getListParking() {

        List<Parking> parkingList = new ArrayList<>();

        parkingList.add(new Parking("Dole",120,100,"ouvert","12h30"));
        parkingList.add(new Parking("Tavaux",50,30,"ouvert","19h30"));
        parkingList.add(new Parking("Paris",300,80,"ouvert","22h30"));

        return parkingList;
    }
}
