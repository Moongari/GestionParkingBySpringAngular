package com.TrainingSpring.parking.services.ImplementService;

import com.TrainingSpring.parking.dao.ParkingApiDao;
import com.TrainingSpring.parking.dao.entity.RecordEntity;
import com.TrainingSpring.parking.dao.entity.ReponseParkingAPIEntity;
import com.TrainingSpring.parking.models.Parking;
import com.TrainingSpring.parking.services.IParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingServiceImpl implements IParkingService {

    @Autowired
    public ParkingApiDao parkingApiDao;

    @Override
    public List<Parking> getListParking() {

    /*    List<Parking> parkingList = new ArrayList<>();

        parkingList.add(new Parking("Dole",120,100,"ouvert","12h30"));
        parkingList.add(new Parking("Tavaux",50,30,"ouvert","19h30"));
        parkingList.add(new Parking("Paris",300,80,"ouvert","22h30"));

        return parkingList;*/

        ReponseParkingAPIEntity reponse = parkingApiDao.getlistParkings();
        return transformEntityToModel(reponse);

    }


    private List<Parking> transformEntityToModel(ReponseParkingAPIEntity reponse) {

        List<Parking> resultat = new ArrayList<>();

        for (RecordEntity record : reponse.getRecords()){
            Parking parking = new Parking();
            parking.setNom(record.getFields().getGrpnom());
            parking.setStatut(record.getFields().getGrpStatut());
            parking.setNbPlaceDisponible(record.getFields().getGrpDisponible());
            parking.setNbPlaceDisponible(record.getFields().getGrpDisponible());
            parking.setHeureMaj(record.getFields().getGrpHorodatage());

            resultat.add(parking);
        }

        return resultat;
    }
}
