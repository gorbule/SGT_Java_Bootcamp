package lesson33;

public class Lesson33 {
    public static void main(String[] args) {

        //Instances to use the methods latter
        Adder adder = new Adder();
        Multiplier multiplier = new Multiplier();
        Power power = new Power();

        // y = x^2 + 2x + 4

        float x = 2f;
        float p1 = power.pow(x, 2);
        float p2 = multiplier.multiply(x, 2);
        float p3 = adder.add(p1, p2);
        float p4 = adder.add(p3, 4);

        System.out.println("Results: " + p4);
    }
}
