package lesson9;

public class NestedClasses {

    public static class InnerClass {
        public String printInnerClass() {
            System.out.println("This is Inner class!");
            return "Some string returned!";
        }
    }

        public String printSmthFromNestedClass() {
            InnerClass inner = new InnerClass();
            return inner.printInnerClass();
        }
}

class MainApp {
    public static void main(String[] args) {
        NestedClasses.InnerClass inner = new NestedClasses.InnerClass();

    }
}

