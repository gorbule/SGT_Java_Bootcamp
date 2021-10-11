package lesson1.helloWorld;

import lesson1.helloWorldLibrary.worldLibrary;
public class helloWorld {


    public static void main(String[] args) {

    worldLibrary theWorld = new worldLibrary();
        theWorld.setPlanetName("Earth");

        System.out.println("Welcome to JAVA2 Course!" + worldLibrary.getName());
        System.out.println("I live on a planet named " + theWorld.getPlanetName());

        theWorld.setPlanetName("Mars");
        System.out.println("But now i decided to go to " + theWorld.getPlanetName());

    LocalLibrary localLibrary = new LocalLibrary();
        System.out.println("I will use schema " + localLibrary.getSchematics());

    }
}
