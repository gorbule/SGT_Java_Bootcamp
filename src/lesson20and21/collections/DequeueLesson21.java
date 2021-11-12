package lesson20and21.collections;

import java.util.*;

public class DequeueLesson21 {

    public static void main(String[] args) {
        Deque<String> myDeque = new ArrayDeque<String>();
        myDeque.addFirst("1");
        myDeque.addFirst("2");
        myDeque.addFirst("3");

        String removedElement = myDeque.removeFirst(); //will return 3
        System.out.println(removedElement);

        removedElement = myDeque.removeFirst(); //will return 2
        System.out.println(removedElement);

        //new element on top
        myDeque.addFirst("4");

        removedElement = myDeque.removeLast(); //to get 1
        System.out.println(removedElement);

        //test - output all elements from dequeue
        myDeque.addFirst("5");
        System.out.println(myDeque);

        //Example of equals() and hasCode() implementation
        List<CustomObject> myList = new ArrayList<>();

        CustomObject co1 = new CustomObject();
        co1.id = 001;

        CustomObject co2 = new CustomObject();
        co2.id = 002;

        myList.add(co1);
        myList.add(co2);

        Iterator mlIterator = myList.iterator();

        while (mlIterator.hasNext()) {
            System.out.println(mlIterator.next());
        }

                //equals? example
                String pet1 = "parrot";
                String pet2 = "penguin";

                if (pet1 == pet2) {
                    //do something
                }
                //the same as
                if (pet1.equals(pet2)) {
                    //do something
                }

                /**
        if (pet1 == "parrot") {
            System.out.println("I was wrong");
        }
                 */

    }
}

//equals () and hashCode() ---> Generate automatically
class CustomObject {
    String customField;
    int customInt;
    int id;

    public CustomObject() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomObject)) return false;
        CustomObject that = (CustomObject) o;
        return customInt == that.customInt && id == that.id && Objects.equals(customField, that.customField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customField, customInt, id);
    }
}
