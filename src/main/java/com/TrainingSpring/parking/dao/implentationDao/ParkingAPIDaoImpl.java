package com.TrainingSpring.parking.dao.implentationDao;

import com.TrainingSpring.parking.dao.ParkingApiDao;
import com.TrainingSpring.parking.dao.entity.ReponseParkingAPIEntity;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ParkingAPIDaoImpl implements ParkingApiDao {
    @Autowired
    private RestTemplate restTemplate; // permet via spring de faire requete http sur une URL

    private final String url_API_OPEN_DATA = "https://data.nantesmetropole.fr/api/records/1.0/search/?dataset=244400404_parkings-publics-nantes-disponibilites&q=&facet=grp_nom&facet=grp_statut";

    @Override
    public ReponseParkingAPIEntity getlistParkings() {
        // on envoie un requete http get a l'api

        return restTemplate.getForEntity(url_API_OPEN_DATA,ReponseParkingAPIEntity.class).getBody();
    }
}
