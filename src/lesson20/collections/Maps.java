package lesson20.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<String, Integer>();

        students.put("Alexandra", 22);
        students.get("Alexandra"); //will return 22
        students.containsKey("Alexandra"); //will return TRUE - such key exists
        students.containsKey(22); //TRUE - such value exists

        students.put("Artjoms", 23);

    }
}
