package FactoryDesignPattern;

public class HiringManager implements Employee{ //subClass-2
    @Override
    public String getFullName() {
        System.out.println("Need fullName for verification for Hiring Manager");
        return "Ram";

    }

    @Override
    public int getSalary() {
        System.out.println("Get the salary details on an Hiring Manager");
        return 151000;
    }
}
