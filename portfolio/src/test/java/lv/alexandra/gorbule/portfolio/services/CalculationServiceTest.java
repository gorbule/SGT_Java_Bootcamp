package lv.alexandra.gorbule.portfolio.services;

import lv.alexandra.gorbule.portfolio.models.SpaceObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class CalculationServiceTest {

    //Regular test. It's a Service. Don't use MVC

    @Autowired
    CalculationService calculationService;

    @Test
    void calculateDistance() {

        SpaceObject so1 = new SpaceObject();
        SpaceObject so2 = new SpaceObject();

        so1.setCordX(1);
        so1.setCordY(1);

        so2.setCordX(1);
        so2.setCordY(2);

        assert {
                calculationService.calculateDistance(so1, so2) == 1;
        }

    }
}