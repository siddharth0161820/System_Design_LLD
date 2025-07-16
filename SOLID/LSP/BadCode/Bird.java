package SOLID.LSP.BadCode;

public class Bird {
    //Method()
    public void fly(){
        System.out.println("Bird Is flying");
    }
}

class Ostrich extends Bird{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }

}

class BadLSP{
    public static void main(String[] args) {
        Bird b=new Ostrich();
        b.fly();
    }
}