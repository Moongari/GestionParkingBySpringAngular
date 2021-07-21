package com.TrainingSpring.parking.models;

public class Parking {

    private String nom;
    private int nbPlaceTotal;
    private int nbPlaceDisponible;
    private String statut;
    private String heureMaj;

    public Parking(String nom, int nbPlaceTotal, int nbPlaceDisponible, String statut, String heureMaj) {
        this.nom = nom;
        this.nbPlaceTotal = nbPlaceTotal;
        this.nbPlaceDisponible = nbPlaceDisponible;
        this.statut = statut;
        this.heureMaj = heureMaj;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbPlaceTotal() {
        return nbPlaceTotal;
    }

    public void setNbPlaceTotal(int nbPlaceTotal) {
        this.nbPlaceTotal = nbPlaceTotal;
    }

    public int getNbPlaceDisponible() {
        return nbPlaceDisponible;
    }

    public void setNbPlaceDisponible(int nbPlaceDisponible) {
        this.nbPlaceDisponible = nbPlaceDisponible;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getHeureMaj() {
        return heureMaj;
    }

    public void setHeureMaj(String heureMaj) {
        this.heureMaj = heureMaj;
    }
}
