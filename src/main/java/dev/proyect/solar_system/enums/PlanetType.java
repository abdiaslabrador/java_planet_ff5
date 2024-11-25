package dev.proyect.solar_system.enums;

public enum PlanetType {
    GASEOSO("Gaseoso"),
    TERRESTRE("Terrestre"),
    ENANO("Enano");
    
    private final String planetTypeName; 

    PlanetType(String planetTypeName) {
        this.planetTypeName = planetTypeName;
    }

    public String getPlanetType() {
        return this.planetTypeName;
    }
}