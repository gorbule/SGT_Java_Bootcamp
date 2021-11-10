package lesson20.collections;

import java.util.ArrayList;
import java.util.List;


public class Lists {
    public static void main(String[] args) {

        List<String> streets = new ArrayList<String>();

        streets.add("Mihoelsa"); //index 0

        streets.get(0); //Mihoelsa

        streets.add("Arhitektu"); //index 1

        streets.set(0, "Rigas");

        streets.addAll(streets);// duplicates elements in the List

        System.out.println(streets);






    }
}
