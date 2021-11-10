package lesson20.collections;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {

        List myList = new ArrayList();
        myList.add("SomeText");

        //Don't forget casting (..)
        String someText = (String) myList.get(0);


        //Equal to =
            //In this case don't think about casting. Generics provide all the info for compiler
                //<Generics> !!!

        List<String> myList2= new ArrayList<String>();

        String someText2 = myList2.get(0);
    }
}
