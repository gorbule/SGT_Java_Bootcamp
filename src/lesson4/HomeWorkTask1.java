package lesson4;

public class HomeWorkTask1 {

    public static void main(String[] args) {

        // myAtoi(String s) -  function, which converts a string to an integer

        String str = "ab +12 n-dh78";

        //1. Read in and ignore any leading whitespace.
        String noSpaceStr = str.replaceAll("\\s", "");
        //System.out.println(noSpaceStr);

        //2.Check if result will be positive/negative number
        String numberOnly = noSpaceStr.replaceAll("[^0-9,+,-]", "");
        //System.out.println(numberOnly);

        char[] array = new char[numberOnly.length()];
        for (int i = 0; i < chr.length; i++) {
            if (
        }
        int sLenght = s.length();
        char[] chr = new char[sLenght];
        // Copy character by character into array
        for (int i = 0; i < sLenght; i++) {
            chr[i] = s.charAt(i);
            //System.out.println(chr[i]);
         }


    }

    static void myAtoi(String s) {

    }
}
