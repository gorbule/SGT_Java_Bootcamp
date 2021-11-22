package lv.alexandra.gorbule.portfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/*
    Service that  will calculate distance between 2 space objects
    As well as forces used there
 */
@Service
public class CalculationService {

    @Autowired
    public CalculationService() {
    }

    //Testing only PUBLIC methods

    /*
    This method should calculate the distance between 2 space objects
    r^2 = dx^2 + dy^2
     */

    public double calculateDistance (Object obj1, Object obj2) {
        double distance = Math.sqrt(obj1.getCordX() - obj2.getCordX(), 2);
    }
}
