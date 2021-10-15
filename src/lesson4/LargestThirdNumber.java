package lesson4;

import java.util.Arrays;

public class LargestThirdNumber {

    /**
     * Main method to test largestThirdOrReturnMax function.
     * It is also possible to use Scanner to create personalized array for test.
     * If you want to use Scanner - just delete lines 18 and 36.
     * @param args
     */

    public static void main(String[] args) {

        int arraySize = 0;

        /**
        //Scanner
        //If user wants it is possible to use also Scanner to create personalized array

        Scanner scan = new Scanner(System.in);
        System.out.println("Lets create personalized array. Please, in input use only numbers!");
        System.out.println("Enter the size of Array: ");
        int amountOfNumbersInArray = scan.nextInt();

        int[] array5 = new int[amountOfNumbersInArray];

        for (int i = 0; i < amountOfNumbersInArray; i++) {
            System.out.println("Input a " + (i+1) + " number");
            int number = scan.nextInt();
            array5[i] = number;
        }
        int arraySize = amountOfNumbersInArray;
        largestThirdOrReturnMax(array5, arraySize);
        */


        int array[] = {12, 13, 1, 10, 34, 16};
        arraySize = array.length;
        largestThirdOrReturnMax(array, arraySize);

        int array1[] = {1, 2, -4, 3};
        arraySize = array1.length;
        largestThirdOrReturnMax(array1, arraySize);


        int array2[] = {-3, 2};
        arraySize = array2.length;
        largestThirdOrReturnMax(array2, arraySize);


        int array3[] = {};
        arraySize = array3.length;
        largestThirdOrReturnMax(array3, arraySize);


        int array4[] = {100000, 25458796, 333214, 12446, 21448};
        arraySize = array4.length;
        largestThirdOrReturnMax(array4, arraySize);

        int array6[] = {-125, -23658, -58, -3698745, -42};
        arraySize = array6.length;
        largestThirdOrReturnMax(array6, arraySize);
    }

    /**
     * Function to check numbers in array.
     * Program returns the 3rd distinct maximum number in this array.
     * If the 3rd maximum does not exist, return the maximum number.
     * @param array
     * @param arraySize
     */
    static void largestThirdOrReturnMax(int array[], int arraySize) {

        // There should be at least one element in array
        if (arraySize < 1) {
            System.out.println("Sorry! There should be at least one element in the array!");
            System.out.println();
            return;
        }


        //Loops to find the 1st, 2nd and 3rd max number
        int first = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > first) {
                first = array[i];
            }
        }

        int second = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > second && array[i] < first) {
                second = array[i];
            }
        }

        int third = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > third && array[i] < second) {
                third = array[i];
            }
        }

        //Result output
        System.out.println(Arrays.toString(array));

        if (third == Integer.MIN_VALUE) {
            System.out.println("The third maximum does not exist, returned maximum is: " + first);
        } else {
            System.out.println("The third distinct maximum number in the array is: " + third);
        }
        System.out.println();
    }
}

