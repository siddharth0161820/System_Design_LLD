package FactoryDesignPattern;

public class ClientFinalTest {
    public static void main(String[] args) {
    Employee emp1=EmployeeFactory.getEmployee("HiringManager");
        System.out.println("Name: "+emp1.getFullName());
        System.out.println("Salary: "+emp1.getSalary());
        System.out.println("Radhe Radhe");

        Employee emp2=EmployeeFactory.getEmployee("SeniorJavaArchitect");
        System.out.println("Name: "+emp2.getFullName());
        System.out.println("Salary: "+emp2.getSalary());
        System.out.println("Radhe Radhe");




    }


}

