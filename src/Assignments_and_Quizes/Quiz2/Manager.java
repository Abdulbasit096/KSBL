package Assignments_and_Quizes.Quiz2;

public class Manager extends Employee{

    private String department;
    public Manager(String name, double salary,String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



    @Override
    public void displayInfo(){
        System.out.println(this.name + " works in " + this.department + " department and has " + this.salary + " salary.");
    }



}
