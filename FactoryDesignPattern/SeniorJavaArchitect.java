package FactoryDesignPattern;

public class SeniorJavaArchitect implements Employee{ //subClass-1
    @Override
    public String getFullName() {
        System.out.println("Need fullName for verification for SeniorJavaArchitect");
        return "Om";
    }

    @Override
    public int getSalary() {
        System.out.println("Get the salary details of SeniorJavaArchitect");
        return 121000;
    }
}
