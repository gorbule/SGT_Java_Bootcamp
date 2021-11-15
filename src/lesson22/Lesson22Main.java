package lesson22;

import java.util.Date;

public class Lesson22Main {
    public static void main(String[] args) {
        GenericClass<String> firstDate = new GenericClass<String>();
        firstDate.setBirthDate("1999-04-18");
        System.out.println(firstDate.getBirthDate());

        GenericClass<Date> secondDate = new GenericClass<>();
        secondDate.setBirthDate(new Date());
        System.out.println(secondDate.getBirthDate());

    }
}
