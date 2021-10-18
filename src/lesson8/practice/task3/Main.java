package lesson8.practice.task3;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("John", 30, "25253036", "Rigas 24", 1002.89);

        Manager manager = new Manager("Ilze", 25, "23236599", "Aejas 45a - 18", 600.07);

        employee.printSalary();
        manager.printSalary();



    }
}
