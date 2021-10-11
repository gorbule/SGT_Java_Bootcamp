package lv.alexandragorbule.rocketscience;

/**
 * Rocket class for building  spaceships
 */

public class Rocket {

    private String name;
    private String color;
    private int weight;
    private int height;
    private Engine engine;
    private static int rocketCounter;

    //Constructors
    public Rocket() {
        addRocket();
    }

    /**
     *
     * @param name
     * @param color
     * @param weight
     * @param height
     * @param engine
     */

    public Rocket(String name, String color, int weight, int height, Engine engine) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.engine = engine;
        addRocket();
    }

    //static method countRockets
    static int countRockets() {
        return rocketCounter;
    }

    //static method - will increase rocketCounter + 1
    static void addRocket() {
        rocketCounter++;
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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
