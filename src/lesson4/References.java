package lesson4;

public class References {

    public static void main(String[] args) {

        //This will point to NULL
        String someString;

        //This 2 lines are identical
        someString = "Something";
        someString = new String("Something");

        Point point1 = new Point(7, 11);
        System.out.println("Coordinates Point1: " + point1.getX() + " - " + point1.getY());

        Point point2 = point1;
        Point point3 = new Point();
        point3.setX(point1.getX());
        point3.setY(point1.getY());
        System.out.println("Coordinates Point3: " + point3.getX() + " - " + point3.getY());

        System.out.println("Coordinates Point2: " + point2.getX() + " - " + point2.getY());

        point2.setX(100);
        System.out.println("Coordinates Point2: " + point2.getX() + " - " + point2.getY());
        System.out.println("Coordinates Point1: " + point1.getX() + " - " + point1.getY());
        System.out.println("Coordinates Point3: " + point3.getX() + " - " + point3.getY());

        //the same value for Point1 & Point2 - it is not a copy, it is reference! Line 18
    }

    static class Point {
        //Coordinates
        private int x;
        private int y;

        public Point() {
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }



    }
}
