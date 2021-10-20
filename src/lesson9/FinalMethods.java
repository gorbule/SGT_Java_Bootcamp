package lesson9;

public class FinalMethods {

    //Initialized during declaration
    final int CONSTANT_PI = 3;

    //Non initialized during declaration
    //has to be initialized in all constructors
    final int CONSTANT_NOINIT;
    public FinalMethods() {
        CONSTANT_NOINIT = 5;
    }

    public final void printHello() {
        System.out.println("Hello!");
    }
}

class ExtendedFinalMethod extends FinalMethods {

    //Final methods can not be overriden!!!
    //@Override
    //public void printHello() {
        //System.out.println("Bye!");}
}