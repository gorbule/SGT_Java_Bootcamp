package lv.alexandragorbule.rocketscience;

import java.util.Scanner;

import static lv.alexandragorbule.rocketscience.Rocket.changeTheWeight;
import static lv.alexandragorbule.rocketscience.Rocket.renameRocket;

public class LaunchPad {

    public static void main(String[] args) {
        Rocket rocket1 = new Rocket();
        System.out.println("There are " + Rocket.countRockets() + " rocket(-s)");
        System.out.println("Name of the rocket: " + rocket1.getName());
        System.out.println("Weight of the rocket: " + rocket1.getWeight());

        Rocket rocket2 = rocket1;
        rocket1.setName("Starship");
        System.out.println("Name of the rocket 1: " + rocket1.getName());
        System.out.println("Name of the rocket 2: " + rocket2.getName());

        renameRocket(rocket1, "Moonshine");
        System.out.println("New rocket 1 name: " + rocket1.getName());

        changeTheWeight(0, 5200);

        Rocket rocket3 = new Rocket("Enterprise", "red", 100, 200, new Engine());
        rocket3.printRocketData();


        //!!! All the references of rocket 3 will be pointed to null
        rocket3 = null;

        Scanner scanner = new Scanner(System.in);
        System.gc(); // System Garbage Collector
        System.out.println("Waiting for rocket to be destroyed..... ZzzZzzz");
        scanner.nextInt();

        Math.pow(2, 2);


    }

    /**
     * Renames the Rocket
     * Changes the original Object
     * @param rocket
     * @param newName
     */
}
