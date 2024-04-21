package Assignments_and_Quizes.Quiz2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Basit",90000);
        Manager manager = new Manager("Abdul" , 80000,"IT");


        employee.displayInfo();
        manager.displayInfo();


    }
}
