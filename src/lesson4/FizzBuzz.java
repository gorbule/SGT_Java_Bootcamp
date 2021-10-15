package lesson4;

import java.util.Scanner;

public class FizzBuzz {

    /**FizzBuzz task solution.
     * It is a short program that prints each number from 1 to inputted number.
     * For each multiple of 3, program will print "Fizz" instead of the number.
     * For each multiple of 5, program will print "Buzz".
     * For numbers which are multiples of both 3 and 5, program will print "FizzBuzz".
     * @param args
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the MAX number: ");
        int maxNumber = scan.nextInt();

        for (int i = 1; i <= maxNumber; i++) {
            if (i%3 == 0 && i%5 ==0) {
                System.out.println("FizzBuzz");
            } else if (i%3 ==0) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
