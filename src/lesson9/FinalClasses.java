package lesson9;

public final class FinalClasses {

    private int someInt;

    /**
     *
     * @param anotherInt
     * @return
     */

    public int multipleBySomeInt (int anotherInt) {
        return someInt*anotherInt;
    }
}
/**
class ExtendedFinalClasses extends FinalClasses {
    //Final Class can not be extended!!!
}
 */