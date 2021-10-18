package lesson8.practice.task4and5;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 12);
        System.out.println("Rectangles length: " + rectangle1.getLength() + " Rectangles breadth: " + rectangle1.getBreadth());
        rectangle1.printArea();
        rectangle1.printPerimeter();
        System.out.println();

        Square square1 = new Square(5);
        System.out.println("Squares side: " + square1.getSide());
        square1.printArea();
        square1.printPerimeter();
        System.out.println();

        //Task 5 - not finished
        //int[] arrayOfSides = {4, 6, 3, 9, 10, 6, 11, 1, 0, 2};

    }
}
