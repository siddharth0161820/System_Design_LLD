package SOLID.SRP.GoodCode;

import SOLID.SRP.BadCode.DevelopAndTest;

public class SRPDemo {
    //Implementation
    public static void main(String[] args) {
        System.out.println("\n SRP FOLLOWED");
        Developer developer=new Developer();
        developer.developApp();
        Tester tester=new Tester();
        tester.testApp();
        System.out.println("\n SRP Violation");
        DevelopAndTest developAndTest =new DevelopAndTest();
        developAndTest.developApp();
        developAndTest.testApp();
    }
}
