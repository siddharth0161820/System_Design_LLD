package FactoryDesignPattern;

public class EmployeeFactory {


    //1>Get employee-so create a method()
    public static Employee getEmployee(String empType){
     if(empType==null){
         throw new IllegalArgumentException("Employee type must not be null");
     }else {
      empType=empType.trim(); //trailing white spaces from the input string (empType) before we compare it

     }if (empType.equalsIgnoreCase("HiringManager")){
           return new HiringManager();
        } else if (empType.equalsIgnoreCase("SeniorJavaArchitect")) {
         return new SeniorJavaArchitect();

        }else {
         throw new IllegalArgumentException("Unknown employee type: "+empType);
        }
    }
}
