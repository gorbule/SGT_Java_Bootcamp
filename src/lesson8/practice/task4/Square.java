package lesson8.practice.task4;

public class Square extends Rectangle{

    public Square() {
    }

    public Square(double length, double breadth) {
        super(length, length);
    }

    //two methods to print the area and perimeter of the square respectively
    public void printArea(double length, double breadth) {
        System.out.println("The area of the square is: " + (length*breadth));
    }
    public void printPerimeter(double length, double breadth) {
        System.out.println("The area of the square is: " + (length*4));
    }
}
