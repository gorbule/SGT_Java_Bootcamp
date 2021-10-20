package lesson9;

public class Parrot implements WalkableInterface, FlyableInterface{
    @Override
    public void fly(int height) {
        System.out.println("I am flying so height " + height + " metres");
    }

    @Override
    public void walk(int speed) {
        System.out.println("I am walking with speed " + speed + "m/h");
    }
}
