package lesson9;

public class Penguin implements WalkableInterface {

    @Override
    public void walk(int speed) {
        System.out.println("I am walking with speed " + speed + "m/h");
    }
}
