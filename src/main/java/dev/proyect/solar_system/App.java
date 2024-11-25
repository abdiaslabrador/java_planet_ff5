package dev.proyect.solar_system;

import dev.proyect.solar_system.enums.PlanetType;

public final class App {

    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 1, 597217 * (Math.pow(10, 24)), 108321 * (Math.pow(10, 12)), 12756, 150_000_000, PlanetType.TERRESTRE, false);
        Planet Jupiter = new Planet("Jupiter", 95, 1899 * (Math.pow(10, 27)), 14313 * (Math.pow(10, 15)), 139820, 750000000, PlanetType.GASEOSO, true);
        System.out.println(earth.toString());
        System.out.println(Jupiter.toString());
    }
}
