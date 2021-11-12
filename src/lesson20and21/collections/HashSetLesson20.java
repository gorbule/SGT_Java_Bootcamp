package lesson20and21.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetLesson20 {
    public static void main(String[] args) {
        Set<Integer> streetNumbers = new HashSet<Integer>();

        streetNumbers.add(1);
        streetNumbers.add(15);
        streetNumbers.add(3);
        streetNumbers.add(100);
        streetNumbers.add(2);

        System.out.println(streetNumbers);
    }
}
