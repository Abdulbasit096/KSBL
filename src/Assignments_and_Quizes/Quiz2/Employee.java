package Assignments_and_Quizes.Quiz2;

public class Employee {
    protected String name;

    protected double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




    public void displayInfo(){
        System.out.println(this.name + "'s salary is " + this.salary);
    }

}
