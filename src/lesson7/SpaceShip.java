package lesson7;

import lv.alexandragorbule.rocketscience.Engine;

public class SpaceShip {

    Engine engine = new Engine();
    String name = "";
    int cargoSpace = 0;

    public SpaceShip() {
    }

    public SpaceShip(Engine engine, String name, int cargoSpace) {
        this.engine = engine;
        this.name = name;
        this.cargoSpace = cargoSpace;
    }

    //getters and setters
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCargoSpace() {
        return cargoSpace;
    }

    public void setCargoSpace(int cargoSpace) {
        this.cargoSpace = cargoSpace;
    }
}
