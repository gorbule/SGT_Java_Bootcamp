package lesson7;

import lv.alexandragorbule.rocketscience.Engine;

import java.util.ArrayList;

public class Lesson7App {

    public static void main(String[] args) {

        SpaceShip spaceShip = new SpaceShip(new Engine(), "Escape Plan", 100);

        //If you woud like to add people already in constructor
        ArrayList<String> people = new ArrayList<>();
        people.add("Bezos");
        people.add("Musk");
        people.add("Bezos");

        PeopleSpaceShip peopleSpaceShip = new PeopleSpaceShip(new Engine(), "Elon",
                100, 3, new ArrayList<String>());

        //How to send Bezos, Musk and Brenson - ????
            //It's a reference to array list namesOfPeople
        peopleSpaceShip.getNamesOfPeople().add("Bezos");
        peopleSpaceShip.getNamesOfPeople().add("Musk");
        peopleSpaceShip.getNamesOfPeople().add("Brenson");

        //Add some Cargo
        peopleSpaceShip.addCargo();
        //Should return Integer
        peopleSpaceShip.addCargo(200);

        //Example of overloading the methods
        System.out.println(100);
        System.out.println("String");
        System.out.println(peopleSpaceShip);

        printInfoAboutSpaceShip(spaceShip);
        printInfoAboutSpaceShip(peopleSpaceShip); //SpaceShip + People

    }


    /**printInfoAboutSpaceShip ---> Example of Polymorphism
     * Polymorphism - opportunity to use one method for children abd paren classes
     * @param spaceShip
     */
    public static void printInfoAboutSpaceShip(SpaceShip spaceShip) {

        System.out.println("I have a SpaceShip: " + spaceShip);

    }
}
