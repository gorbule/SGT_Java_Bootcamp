package lesson4;

public class Arrays {

    public static void main(String[] args) {
        //Define an Array
        int[] arrayOfIntegers;

        //Initialize an arrayOfIntegers
        arrayOfIntegers = new int[5];

        //Definition and initialization in one line
        int[] anotherArray = new int[10];

        //Print an alphabet
        System.out.println(initAlphabet());

        //Define the array and initialize using shorthand notation
        String[] cities = {
                "Riga",
                "London",
                "Paris",
        };


        //This is equals to ...
        String[] cities2 = new String[3];
        cities2[0] = "Riga";
        cities2[1] = "London";
        cities2[2] = "Paris";

        //Printing out cities2 array elements
        for (String city :
                cities2) {
            System.out.println(city + ", ");
        }

        //Two Dimensional arrays
        int[][] points = new int[10][10]; //RIGHT
        // int[][] point = new int[10][0]; //RIGHT
        // int[][] point = new int[0][10]; //WRONG

        points[0][0] = 99;
        points[0][1] = 5;

        //System.out.println(points);

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.println(points[i][j] + " ");
            }
        }

        //ARRAY RESIZING
        /** After setting array size, it is not changeable
         Array can be "resized", by assigning variable to newly initialized array */

        System.out.println();

        //Array Copying
        String[] newCities = new String[3];
        System.arraycopy(cities2, 0, newCities, 0, cities.length);

        for (String newCity :
                newCities) {
            System.out.println(newCity);
        }
    }

    static char[] initAlphabet() {

        char[] alphabet = new char[26];
        //char in () - it is casting from int to char
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        return alphabet;
    }


}
