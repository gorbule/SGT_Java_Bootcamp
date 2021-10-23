package lesson9;

public class Utilities {

    public static class Delete {
        public void delete(String filename) {
            System.out.println("Delete smth...");
        }
    }
    public  static class Create {
        public static void createFile() {
            System.out.println("Created file...");
        }
    }
}


class oneMoreApp {
    public static void main(String[] args) {
        Utilities.Create.createFile();
        Math.random(); // Static method have the same approach like Nested Classes
    }
}
