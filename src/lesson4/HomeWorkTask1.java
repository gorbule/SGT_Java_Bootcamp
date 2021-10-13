package lesson4;

public class HomeWorkTask1 {

    public static void main(String[] args) {

        String str = "999999-99999";
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
                System.out.println("Output is: " + minimalNum);
            } else if (resultInt >= maximalNum) {
                System.out.println("Output is: " + maximalNum);
            } else {
                System.out.println("Output is: " + resultInt);
            }
        } else {
            System.out.println("Sorry! In your string no one digit!");
        }
    }

    /**
     *myAtoi(String s) -  function, method, which converts a string to an integer
     * @param s
     */
    static void myAtoi(String s) {

    }

}
