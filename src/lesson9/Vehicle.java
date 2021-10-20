package lesson9;

public abstract class Vehicle {

    public abstract double calcFuelEfficiency();

    public double showCurrentSpeed() {
        return Math.random() * 100;
    }
}

class Truck extends Vehicle {

    @Override
    public double calcFuelEfficiency() {
        return 0;
    }
}

class Application {
    public static void main(String[] args) {

        Truck myTruck = new Truck();

        System.out.println(myTruck.calcFuelEfficiency());
        //output = 0,0 - because in ChildClass it returns 0
        System.out.println(myTruck.showCurrentSpeed());


        //SummarY!
        //we can not create an instance of abstract class
        //abstract method should be overridden in children class
        //we can create default methods

    }
}
