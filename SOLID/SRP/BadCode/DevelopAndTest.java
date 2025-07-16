package SOLID.SRP.BadCode;
//SRP Violation(Bad Code):one class handling two responsibilities
public class DevelopAndTest {
 //Methods()
    public void developApp(){
        System.out.println("Developer is  writing code");
    }

    //Methods()_2
    public void testApp(){
        System.out.println("Tester is testing code");
    }
}

