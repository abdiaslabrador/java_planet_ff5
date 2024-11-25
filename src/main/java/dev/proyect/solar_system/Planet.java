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
    private boolean isObserv = false;
    private float yearsOrbitalPeriod = 0;
    private double daysOrbitalPeriod =  0;

    public float getYearsOrbitalPeriod() {
        return yearsOrbitalPeriod;
    }

    public void setYearsOrbitalPeriod(float yearsOrbitalPeriod) {
        this.yearsOrbitalPeriod = yearsOrbitalPeriod;
    }

    public double getDaysOrbitalPeriod() {
        return daysOrbitalPeriod;
    }

    public void setDaysOrbitalPeriod(double daysOrbitalPeriod) {
        this.daysOrbitalPeriod = daysOrbitalPeriod;
    }

    public Planet(String name, int numbSatellite, double massKlg, double volumKm3, int diameterKm, int sunDistance,
            PlanetType planetType, boolean isObserv, float yearsOrbitalPeriod, double daysOrbitalPeriod) {
        this.name = name;
        this.numbSatellite = numbSatellite;
        this.massKlg = massKlg;
        this.volumKm3 = volumKm3;
        this.diameterKm = diameterKm;
        this.sunDistance = sunDistance;
        this.planetType = planetType;
        this.isObserv = isObserv;
        this.yearsOrbitalPeriod = yearsOrbitalPeriod;
        this.daysOrbitalPeriod = daysOrbitalPeriod;
    }

    public boolean isOuter(){
        // mayor que 3.4 UA
        if(this.sunDistance > 508632760){
            return true;
        }
        return false;
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



    public boolean isObserv() {
        return isObserv;
    }



    public void setisObserv(boolean isObserv) {
        this.isObserv = isObserv;
    }

    public double getDensity(){
        return (this.massKlg/this.volumKm3);
    }

    @Override
    public String toString() {
        String isOuter = isOuter() ? "si" : "no";
        String isObserv = isObserv() ? "si" : "no";
        
        return "\nname: " + name + "\nNumber of Satellite: " + numbSatellite + "\nMass in Kilograms: " + massKlg + 
               "\nvolumKm3: " + volumKm3 + "\nDiameters (Km): " + diameterKm + "\nDistance from the sun: " + sunDistance + 
               "\nPlanet type: " + planetType.getPlanetType() + "\nIs Observable: " + isObserv + "\nDensity: " + getDensity() + 
               "\nIs outer: " + isOuter + "\nYears orbital period: " + yearsOrbitalPeriod + "\nDays orbital period: " + daysOrbitalPeriod;
    }

    public void setObserv(boolean isObserv) {
        this.isObserv = isObserv;
    }

    
}
