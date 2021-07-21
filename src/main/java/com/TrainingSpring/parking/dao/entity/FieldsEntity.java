package com.TrainingSpring.parking.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldsEntity {

    @JsonProperty(value = "idobj")
    private String idObjet;

    @JsonProperty(value = "grp_nom")
    private  String grpnom;

    @JsonProperty(value = "grp_exploitation")
    private int grpExploitation;

    @JsonProperty(value = "grp_disponible")
    private int grpDisponible;

    @JsonProperty(value = "grp_statut")
    private String grpStatut;

    @JsonProperty(value = "grp_horodatage")
    private String grpHorodatage;


    public String getIdObjet() {
        return idObjet;
    }

    public void setIdObjet(String idObjet) {
        this.idObjet = idObjet;
    }

    public String getGrpnom() {
        return grpnom;
    }

    public void setGrpnom(String grpnom) {
        this.grpnom = grpnom;
    }

    public int getGrpExploitation() {
        return grpExploitation;
    }

    public void setGrpExploitation(int grpExploitation) {
        this.grpExploitation = grpExploitation;
    }

    public int getGrpDisponible() {
        return grpDisponible;
    }

    public void setGrpDisponible(int grpDisponible) {
        this.grpDisponible = grpDisponible;
    }

    public String getGrpStatut() {
        return grpStatut;
    }

    public void setGrpStatut(String grpStatut) {
        this.grpStatut = grpStatut;
    }

    public String getGrpHorodatage() {
        return grpHorodatage;
    }

    public void setGrpHorodatage(String grpHorodatage) {
        this.grpHorodatage = grpHorodatage;
    }
}
