package lesson20and21.collections;

import java.util.ArrayDeque;
import java.util.Deque;

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


    }
}
