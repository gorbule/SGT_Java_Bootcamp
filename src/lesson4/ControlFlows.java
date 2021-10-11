package lesson4;

public class ControlFlows {

    //Branching
    public static void main(String[] args) {
        int myAge = 31;

        //Simple IF statement
        if (myAge > 64) {
            System.out.println("Retirement Time");
        } else if (myAge < 7) {
            System.out.println("Kindergarden Time");
        } else {
            System.out.println("Work Time");
        }

        //SWITCH statement
        switch (myAge) {
            case 5:
                System.out.println("5 y.o.");
                break;
            case 31:
                System.out.println("31 y.o.");
                break;
            case 55:
                System.out.println("55 y.o.");
                break;
            default:
                System.out.println("Some other non-mentioned age");
        }

        //Simple FOL LOOP
        for (int i = 0; i < 10; i++) {
            System.out.println("Are you finished yet? " + i);
        }
        System.out.println("Finally");

        //Simple FOREACH example
        String[] students = new String[5];
        students[0] = "Laura";
        students[1] = "Maija";
        students[2] = "Arturs";
        students[3] = "Ingemars";
        //students[4] = "Alexa";
        // ---> In this case the last element in this Array will be NULL!!!

        for (String studentName :
                students) {
            System.out.println(studentName);
        }

        //Simple WHILE LOOP
        int i = 0;
        while (i < 5) {
            System.out.println("Loop is still running! --> " + i);
            i++;
        }
        System.out.println("Loop is Done! Great!");
        System.out.println();

        int k = 0;
        while (k > -3) {
            System.out.println("Loop is still running! --> " + k);
            k--;
        }
        System.out.println("Loop is Done! Great!");
        System.out.println();

        //DO WHILE LOOP - running at least once!!!
        do {
            System.out.println("This should be executed at least once!");
        } while (i < 0);

        //Infinite LOOP with BREAK
        //we will stop the LOOP when breakCondition it > 10
        int breakCondition = 8;
        do {
            if (breakCondition > 10) {
                break;
            }
            breakCondition++;
            System.out.println("breakCondition: " + breakCondition);
        } while (true);
        System.out.println("We are out of infinite loop!");
        System.out.println();

        //a LOOP where we scip elements from 3 to 7
        for (int j = 0; j < 10; j++) {
            if (j > 3 && j < 7) {
                continue;
            }
            System.out.println("Some element is not between 3 and 7 not be included: " + j);
        }
    }
}
