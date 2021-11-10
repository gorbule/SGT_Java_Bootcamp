package lesson20.collections;

import java.util.*;

public class IteratorsLesson20 {
    public static void main(String[] args) {

        //Ex1
        List<String> planets = new ArrayList<String>();

        planets.add("Earth");
        planets.add("Mars");
        planets.add("Venus");

        Iterator planetsIterator = planets.iterator();

        while (planetsIterator.hasNext()) {
            System.out.println(planetsIterator.next());
        }

        System.out.println();

        //Ex2
        Set<String> birds = new TreeSet<String>();
        birds.add("Parrot");
        birds.add("Eagle");
        birds.add("Sparrow");

        Iterator birdsIterator = birds.iterator();

        while (birdsIterator.hasNext()) {
            System.out.println(birdsIterator.next());
        }

        System.out.println();

        //Ex3 - Queue
        Queue<String> lidl = new LinkedList<>();

        lidl.add("A");
        lidl.add("B");
        lidl.add("C");
        System.out.println(lidl);

        Iterator lidlIterator = lidl.iterator();

            //sort first
            while (lidlIterator.hasNext()) {
                System.out.println(lidlIterator.next());
            }


    }
}
