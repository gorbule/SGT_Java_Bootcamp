package lesson19;

import lesson19.Exceptions.DBExceptionClass;
import lesson19.Exceptions.DBPasswordAllCapitalsException;
import lesson19.Exceptions.DBPasswordIncorrectException;

public class Lesson19Main extends Lesson19Exceptions{
    public static void main(String[] args) {
        Lesson19Exceptions exceptions = new Lesson19Exceptions();


        exceptions.divideByNumber(100, 50); //2
        exceptions.divideByNumber(999, 0); //An error will be thrown ---> ArithmeticException

        try {
            exceptions.multipleByTwo(5);
        } catch (ArithmeticException e) {
            System.out.println("Even wrapped exception will be handled");
        }


         try {
             System.out.println("Connecting to DB");
             throw new DBPasswordAllCapitalsException();
         } catch (DBExceptionClass e) {
             //handle this exception
             System.out.println("Our exception has been properly handled");
             //instance of
             if ( e instanceof DBPasswordAllCapitalsException ) {
                 System.out.println("Exception is of type DBPasswordAllCapitalsException");
             } else if (e instanceof DBPasswordIncorrectException) {
                 System.out.println("Password is incorrect");
             }
         }

         try {
             throw  new DBExceptionClass("Some custom message");
         } catch (DBExceptionClass e) {
             System.out.println("There was a DB Exception " + e.getMessage());
         }

         //Exception handling methods
            //printStackTrace - prints execution call stack trace
         try {
             exceptions.multipleByTwo(5);
         } catch (Exception e) {
             e.printStackTrace(); //you can continue operation
         }
        System.out.println("Something after printing StackTrace");

            //getStackTrace - returns call stack trace as array from  StackTraceElements

        //Methods for Throwable object:
            //Implicit toString() — lazy option to get object_class : getMessage()
            //getCause() — returns the cause of the throwable (or null if unknown).
            //getMessage(), getLocalizedMessage() — Returns the message or localized message string of the throwable

        //Assertion
        boolean userAuthentication = false;
        try {
        assert userAuthentication;
        }
        catch (AssertionError e) {
            System.out.println("User is not authenticated");
        }
    }
}
