package dev.proyect.solar_system.enums;

public enum PlanetType {
    GASEOUS("Gaseous"),
    TERRESTRIAL("Terrestrial"),
    DWARF("Dwarf");
    
    private final String planetTypeName; 

    PlanetType(String planetTypeName) {
        this.planetTypeName = planetTypeName;
    }

    public String getPlanetType() {
        return this.planetTypeName;
    }
}