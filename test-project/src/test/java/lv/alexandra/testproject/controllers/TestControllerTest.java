package lv.alexandra.testproject.controllers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestControllerTest {

    //@Autowired ---> Dependency injection - we don't need to create an object by ourselves,
    // it will be created automatically and will be deleted after test
    private TestController controller = new TestController();

    @BeforeEach
    void setUp() {
        System.out.println("Test is starting!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("The test has finished!");
    }

    @Test
    void getTest() {
        assert(controller.getTest()).equals("This is TEST!");
    }

    @Test
    void getAnotherString() {
        assert(controller.getAnotherString()).contains("response");
    }

    @Test
    void calculate() {
        assert(controller.calculate(99)) == 621.72;
    }
}