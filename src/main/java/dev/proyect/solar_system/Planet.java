package dev.proyect.solar_system;

import dev.proyect.solar_system.enums.PlanetType;

public class Planet {
    private String name = null;
    private int numbSatellite = 0;
    private double massKlg = 0.00;
    private double volumKm3 = 0.00;
    private int diameterKm = 0;
    private int sunDistance = 0;
    private PlanetType planetType;
    private boolean viewObserv = false;

    public Planet(String name, int numbSatellite, double massKlg, double volumKm3, int diameterKm, int sunDistance,
            PlanetType planetType, boolean viewObserv) {
        this.name = name;
        this.numbSatellite = numbSatellite;
        this.massKlg = massKlg;
        this.volumKm3 = volumKm3;
        this.diameterKm = diameterKm;
        this.sunDistance = sunDistance;
        this.planetType = planetType;
        this.viewObserv = viewObserv;
    }

    

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getNumbSatellite() {
        return numbSatellite;
    }



    public void setNumbSatellite(int numbSatellite) {
        this.numbSatellite = numbSatellite;
    }



    public double getMassKlg() {
        return massKlg;
    }



    public void setMassKlg(double massKlg) {
        this.massKlg = massKlg;
    }



    public double getVolumKm3() {
        return volumKm3;
    }



    public void setVolumKm3(double volumKm3) {
        this.volumKm3 = volumKm3;
    }



    public int getDiameterKm() {
        return diameterKm;
    }



    public void setDiameterKm(int diameterKm) {
        this.diameterKm = diameterKm;
    }



    public int getSunDistance() {
        return sunDistance;
    }



    public void setSunDistance(int sunDistance) {
        this.sunDistance = sunDistance;
    }



    public PlanetType getPlanetType() {
        return planetType;
    }



    public void setPlanetType(PlanetType planetType) {
        this.planetType = planetType;
    }



    public boolean isViewObserv() {
        return viewObserv;
    }



    public void setViewObserv(boolean viewObserv) {
        this.viewObserv = viewObserv;
    }



    @Override
    public String toString() {
        return "name=" + name + ", numbSatellite=" + numbSatellite + ", massKlg=" + massKlg + ", volumKm3="
                + volumKm3 + ", diameterKm=" + diameterKm + ", sunDistance=" + sunDistance + ", planetType="
                + planetType + ", viewObserv=" + viewObserv;
    }

    
}
