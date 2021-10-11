package lv.alexandragorbule.rocketscience;

public class Engine {

    private String name;
    private String fuelType;
    private String engineSize;
    private double fuelConsumption;

    //Constructors
    public Engine() {
    }

    public Engine(String name, String fuelType, String engineSize, double fuelConsumption) {
        this.name = name;
        this.fuelType = fuelType;
        this.engineSize = engineSize;
        this.fuelConsumption = fuelConsumption;
    }

    //Getters && Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
