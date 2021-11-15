package lesson22;

import java.util.ArrayList;
import java.util.List;

public class RunTimeCompilationErrors {
    public static void main(String[] args) {

        //Compilation Error
        float var1 = 1.45f;
        String varString = "ABCde";
            //This will call the compilation Error
            // float var2 = var1 + varString;


        //RunTime Error
        List myList = new ArrayList();
        myList.add("Some text");
        myList.add(new Float(1.45f));

        //trying to cast
        float var3 = (float) (myList.get(0));
            //compiler does not show any error but there is runtime compilation error.
            //it is impossible to cast text to float !!!

        List<String> myList2 = new ArrayList<>();
        myList2.add("Something");
        //myList2.add(40); ---> data type error

        //impossible to cast STring to INT! Compilation error
        //int someInt = (int) myList2.get(0);


    }
}
