package lesson33;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Power {

    public static final Logger log = Logger.getLogger("Power");


    public float pow (float base, int power) {

        //intentional mistake
        float result = 1;

        System.out.println("Initial value is 1. Starting the loop.");
        log.log(Level.FINEST, "Initial value is 1. Starting the loop.");
        for (int i = 0; i < power; i++) {
            result = result * base;
        }

        return result;

    }
}
