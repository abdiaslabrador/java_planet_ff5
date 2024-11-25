package dev.proyect.solar_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import dev.proyect.solar_system.enums.PlanetType;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PlanetTest {

    Planet earth;
    String name = "Earth";
    int numbSatellite = 1;
    double massKlg = 597217 * (Math.pow(10, 24));
    double volumKm3 = 108321 * (Math.pow(10, 12));
    int diameterKm = 12756;
    int sunDistance = 150_000_000;
    PlanetType planetType = PlanetType.TERRESTRIAL;
    boolean isObserv = false;
    float yearsOrbitalPeriod = 1;
    double daysOrbitalPeriod = 365;

    @BeforeEach
    public void setUp() {
        earth = new Planet(name, numbSatellite, massKlg, volumKm3, diameterKm, sunDistance, planetType, isObserv, yearsOrbitalPeriod, daysOrbitalPeriod);
    }

    @Test
    @DisplayName("Test if the density is calculated well")
    void testGetDensity() {
        double result =  massKlg / volumKm3;
        assertThat(result, is( earth.getDensity()));
    }

    @Test
    void testGetDiameterKm() {
        assertThat(diameterKm, is( earth.getDiameterKm()));
    }

    @Test
    void testGetMassKlg() {
        assertThat(massKlg, is( earth.getMassKlg()));
    }

    @Test
    void testGetName() {
        assertThat(name, is( earth.getName()));
    }

    @Test
    void testGetNumbSatellite() {
        assertThat(numbSatellite, is( earth.getNumbSatellite()));
    }

    @Test
    void testGetPlanetType() {
        assertThat(planetType, is( earth.getPlanetType()));
    }

    @Test
    void testGetSunDistance() {
        assertThat(sunDistance, is( earth.getSunDistance()));
    }

    @Test
    void testGetVolumKm3() {
        assertThat(volumKm3, is( earth.getVolumKm3()));
    }

    @Test
    void testIsObserv() {
        assertThat(isObserv, is( earth.isObserv()));
    }

    @Test
    void testIsOuter() {
        boolean isOuter = false;
        if(sunDistance > 508632760){
            isOuter = true;
        }
        isOuter = false;
        assertThat(isOuter, is( earth.isOuter()));
    }

    @Test
    @DisplayName("Test if the setDiameterKm function correctly assigns the new value")
    void testSetDiameterKm() {
        int newDiameterKm = 12757;
        earth.setDiameterKm(newDiameterKm);
        assertThat(newDiameterKm, is( earth.getDiameterKm()));
    }

    @Test
    @DisplayName("Test if the setMassKlg function correctly assigns the new value")
    void testSetMassKlg() {
        double newMassKlg = 597218 * (Math.pow(10, 24));
        earth.setMassKlg(newMassKlg);
        assertThat(newMassKlg, is( earth.getMassKlg()));
    }

    @Test
    @DisplayName("Test if the setName function correctly assigns the new value")
    void testSetName() {
        String newName = "Jupiter";
        earth.setName(newName);
        assertThat(newName, is( earth.getName()));
    }

    @Test
    @DisplayName("Test if the setNumbSatellite function correctly assigns the new value")
    void testSetNumbSatellite() {
        int newNumbSatellite = 19;
        earth.setNumbSatellite(newNumbSatellite);
        assertThat(newNumbSatellite, is( earth.getNumbSatellite()));
    }

    @Test
    @DisplayName("Test if the setPlanetType function correctly assigns the new value")
    void testSetPlanetType() {
        earth.setPlanetType(PlanetType.GASEOUS);
        assertThat(PlanetType.GASEOUS, is( earth.getPlanetType()));
    }

    @Test
    @DisplayName("Test if the setSunDistance function correctly assigns the new value")
    void testSetSunDistance() {
        int newSunDistance = 151_000_000;
        earth.setSunDistance(newSunDistance);
        assertThat(newSunDistance, is( earth.getSunDistance()));
    }

    @Test
    @DisplayName("Test if the setVolumKm3 function correctly assigns the new value")
    void testSetVolumKm3() {
        double newVolumKm3 = 108322 * (Math.pow(10, 12));;
        earth.setVolumKm3(newVolumKm3);
        assertThat(newVolumKm3, is( earth.getVolumKm3()));
    }

    @Test
    @DisplayName("Test if the setSunDistance function correctly assigns the new value")
    void testSetisObserv() {
        boolean newObserv = true;
        earth.setisObserv(newObserv);
        assertThat(newObserv, is( earth.isObserv()));
    }
}
