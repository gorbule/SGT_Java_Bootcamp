package lv.alexa.gorbule.junit5.junit5.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    /**
     * Unit Testing
     * The smallest thing what to test
     */
    @Test
    void hello() {
        //instance
        HelloController controller = new HelloController(); //Arrange
        String response = controller.hello("World"); // Act
        assertEquals("Hello, World", response); //Assert

    }
}