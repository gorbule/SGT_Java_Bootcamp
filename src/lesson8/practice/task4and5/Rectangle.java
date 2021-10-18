package lesson8.practice.task4and5;

public class Rectangle {

    private double length;
    private double breadth;

    //two methods to print the area and perimeter of the rectangle respectively

    public void printArea() {
        System.out.println("The area of the rectangle is: " + (length*breadth));
    }
    public void printPerimeter() {
        System.out.println("The area of the rectangle is: " + (length+breadth)*2);
    }

    //constructors
    public Rectangle() {
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    //getters and setters

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

}
