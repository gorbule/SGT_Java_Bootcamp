package lesson4;

public class Scopes {

    static final int SOME_CONSTANT = 314; //constant!!!!

    static int globalResult = 0;

    public static void main(String[] args) {

        //int someNumber = 99;
        int someNumber = SOME_CONSTANT;

        //Only thing we can do - to pass the value as an argument
        //to a method
        int someResult = multiplyByFive(someNumber);
        System.out.println(someResult);
        System.out.println(globalResult);


    }

    static int scopeVisible (int someNumber) {
        boolean visibleInsideMethod = true;

        return someNumber * 2;
    }

    static int multiplyByFive (int number) {
        int five = 5;

        globalResult = number * five;
        return  number * five;
    }

    //AVOID Use global variable!

}
