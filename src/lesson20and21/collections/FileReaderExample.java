package lesson20and21.collections;


import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderExample {
    public static void main(String[] args) {
        Path myPath = Paths.get("C:\\Users\\User\\IdeaProjects\\SGT_Java_Bootcamp\\out\\production\\SGT_Java_Bootcamp");
        int count = myPath.getNameCount();
        System.out.println(count);

        while (myPath.iterator().hasNext()) {
            System.out.println(myPath.iterator().next().getName());
        }
    }
}
