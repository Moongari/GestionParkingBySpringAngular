package com.TrainingSpring.parking.dao;

import com.TrainingSpring.parking.dao.entity.ReponseParkingAPIEntity;

public interface ParkingApiDao  {

    //reflete le json que nous renvoi l'api
    public ReponseParkingAPIEntity getlistParkings();

}
