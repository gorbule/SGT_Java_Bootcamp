package lesson4;

public class HomeWorkTask1 {

    /**
     * Main method to check myAtoi function work with different examples
     * @param args
     */

    public static void main(String[] args) {

        String str = "01+ anhsj8741";
        myAtoi(str);

        String str2 = "-548+ad-002378549521425";
        myAtoi(str2);

        String str3 = "Hello there!";
        myAtoi(str3);

        String str4 = "999999-99999";
        myAtoi(str4);

        String str5 = "lk+12547-32   548 kjd1254d7*";
        myAtoi(str5);

    }

    /**
     * myAtoi(String s) -  function, method, which converts a string to an integer
     * @param str - String (can consist of letters, numbers, spaces, special characters)
     */

        public static void myAtoi(String str) {

        System.out.println("Input: " + str);

        if (str.matches(".*\\d.*")){

            //Reading in and ignoring any leading whitespace.
            String noSpaceStr = str.replaceAll("\\s", "");

            //Checking if result will be positive/negative number
            String numberOnly = noSpaceStr.replaceAll("[^0-9,+,-]", "");
            char[] array = new char[numberOnly.length()];
            for (int k = 0; k < numberOnly.length(); k++) {
                array[k] = numberOnly.charAt(k);
            }
            char sign = ' ';
            for (int j = 0; j < array.length; j++) {
                if (array[j] == '+') {
                    sign = '+';
                } else if (array[j] == '-'){
                    sign = '-';
                } else {
                continue;
                }
                break;
            }
            //Parsing String to Integer
            String resultStr = noSpaceStr.replaceAll("[^0-9]", "");
            //int resultInt = Integer.parseInt(resultStr);
            Long resultInt = Long.parseLong(resultStr);

            if (sign == '-') {
                resultInt = resultInt*-1;
            } else {}

            //Mathematical comparing & Result output
            int minimalNum = Integer.MIN_VALUE;
            int maximalNum = Integer.MAX_VALUE;

            if (resultInt <= minimalNum) {
                System.out.println("Output: " + minimalNum);
            } else if (resultInt >= maximalNum) {
                System.out.println("Output: " + maximalNum);
            } else {
                System.out.println("Output: " + resultInt);
            }
        } else {
            System.out.println("Sorry! There is no one digit!");
        }
            System.out.println();
    }
}
