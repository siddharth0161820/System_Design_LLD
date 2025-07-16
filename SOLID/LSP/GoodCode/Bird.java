package SOLID.LSP.GoodCode;

public interface Bird {
    //Method()
    void makeSound();
}

interface FlyingBird extends Bird{
    //Method()
    void fly();
}

class Sparrow implements FlyingBird{

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird makes sound");
    }
}

class Ostrich implements Bird{

    @Override
    public void makeSound() {
        System.out.println("Boom boom");
    }
}

class LSPDemo{
    public static void main(String[] args) {
       FlyingBird flyingBird=new Sparrow();
       flyingBird.makeSound();
       flyingBird.fly();
        Bird bird1=new Ostrich();
        bird1.makeSound();
    }
}