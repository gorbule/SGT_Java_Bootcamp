package lesson4;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        //Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int amountOfNumbersInArray = scan.nextInt();

        int[] array = new int[amountOfNumbersInArray];

        for (int i = 0; i < amountOfNumbersInArray; i++) {
            System.out.println("Input a " + i+1  + " number");
            int number = scan.nextInt();
            array[i] = number;
        }

        //Loops to find the 1st, 2nd and 3rd max number
        int first = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > first) {
                first = array[i];
            }
        }

        int second = Integer.MIN_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > second && array[i] < first) {
                second = array[i];
            }
        }

        int third = Integer.MIN_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > third && array[i] < second) {
                third = array[i];
            }
        }

        //Result output
        if (third == Integer.MIN_VALUE) {
            System.out.println("The third maximum does not exist, returned maximum is: " + first);
        } else {
            System.out.printf("The third distinct maximum number  " + third);
        }

    }
}
