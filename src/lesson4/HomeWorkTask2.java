package lesson4;

public class HomeWorkTask2 {

    public static void main(String[] args) {
        int number1 = 3;
        numbersToRoman(number1);

        int number2 = 9;
        numbersToRoman(number2);

        int number3 = 58;
        numbersToRoman(number3);

        int number4 = 659;
        numbersToRoman(number4);

        int number5 = 1994;
        numbersToRoman(number5);

        int number6 = 3271;
        numbersToRoman(number6);
    }

    public static void numbersToRoman(int number) {
        System.out.println("Input: " + number);
        String roman = "";
        while (number >= 1000) {
            roman += "M";
            number -= 1000;
        }
        while (number >= 900) {
            roman += "CM";
            number -= 900;
        }
        while (number >= 500) {
            roman += "CD";
            number -= 500;
        }
        while (number >= 400) {
            roman += "D";
            number -= 400;
        }
        while (number >= 100) {
            roman += "C";
            number -= 100;
        }
        while (number >= 90) {
            roman += "XC";
            number -= 90;
        }
        while (number >= 50) {
            roman += "L";
            number -= 50;
        }
        while (number >= 40) {
            roman += "XL";
            number -= 40;
        }
        while (number >= 10) {
            roman += "X";
            number -= 10;
        }
        while (number >= 9) {
            roman += "IX";
            number -= 9;
        }
        while (number >= 5) {
            roman += "V";
            number -= 5;
        }
        while (number >= 4) {
            roman += "IV";
            number -= 4;
        }
        while (number >= 1) {
            roman += "I";
            number -= 1;
        }
        System.out.println("Output: " + roman);
        System.out.println();
    }
}