package lesson20and21.collections;

import java.io.*;
import java.util.Scanner;

public class Streams {
    public static void main(String[] args) {
        //STDOUT
        System.out.println("This is a System STDOUT");

        //STDIN
        //
        System.out.println("Please enter some character in... ");
        Scanner scan = new Scanner(System.in);
        String sysInt = scan.next();

        //STDERR
        //throw new Exception("Throwing exception intp STDERR stream");


        //Java File
        File newFile = new File("myOutput.txt");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
            writer.append("This is new line to append to the file!");
            writer.close();
        } catch ( IOException e) {
            System.out.println("File does not exist");
        }

    }
}
