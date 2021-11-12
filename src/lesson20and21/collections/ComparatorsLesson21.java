package lesson20and21.collections;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorsLesson21 {

    public static void main(String[] args) {

        Set students = new TreeSet();

        Student student1 = new Student(1, "aaa");
        Student student2 = new Student(2, "zzz");
        Student student3 = new Student(3, "asd");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);



    }
}

class Student implements Comparable<Student> {
    int id;
    String name;

    //Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //toString()
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //comparing by second letter in name
    @Override
    public int compareTo(Student student) {
        if (student.name.charAt(1) < this.name.charAt(1)) {
            return 1;
        } else if (student.name.charAt(1) > this.name.charAt(1)) {
            return -1;
        } else {
            return 0;
        }
    }
}
