package lesson8.practice.task1and2;

public class Main {
    /**
     * Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
     * 1 - method of parent class by object of parent class
     * 2 - method of child class by object of child class
     * 3 - method of parent class by object of child class
     * @param args
     */

    public static void main(String[] args) {

        //--->1 method of parent class by object of parent class
        ParentClass parentClass = new ParentClass();
        parentClass.printParent();

        //--->2 method of child class by object of child class
        ChildClass childClass = new ChildClass();
        childClass.printChild();

        //--->3 method of parent class by object of child class
        childClass.printParent();

        //--->4 We can not use private method without another method or constructor
        //parentClass.printSmthPrivate();
        //childClass.printSmthPrivate();

    }
}
