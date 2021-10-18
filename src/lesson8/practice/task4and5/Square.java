package lesson8.practice.task4and5;

public class Square extends Rectangle{

    private int side;

    public Square() {
    }

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    //two methods to print the area and perimeter of the square respectively
    public void printArea() {
        System.out.println("The area of the square is: " + (side*2));
    }
    public void printPerimeter(double length, double breadth) {
        System.out.println("The parameter of the square is: " + (side*4));
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
