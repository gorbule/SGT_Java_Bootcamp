package lv.alexandragorbule.rocketscience;

public class LaunchPad {

    public static void main(String[] args) {
        Rocket rocket1 = new Rocket();
        System.out.println("There are " + Rocket.countRockets() + " rocket(-s)");
        System.out.println("Name of the rocket: " + rocket1.getName());
        System.out.println("Weight of the rocket: " + rocket1.getWeight());

        Rocket rocket2 = rocket1;
        rocket1.setName("Starship");
        System.out.println("Name of the rocket 1: " + rocket1.getName());
        System.out.println("Name of the rocket 2: " + rocket2.getName());



    }
}
