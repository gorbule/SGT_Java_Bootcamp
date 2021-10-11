package lv.alexandragorbule.rocketscience;

/**
 * Rocket class for building  spaceships
 */

public class Rocket {

    private String name;
    private String color;
    private int weight;
    private int height;

    //Constructors
    public Rocket() {
    }

    public Rocket(String name, String color, int weight, int height) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    //Getters && Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
