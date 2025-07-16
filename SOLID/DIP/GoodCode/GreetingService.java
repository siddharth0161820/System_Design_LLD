//GOOD CODE – DIP Applied (Interface + Loose Coupling)
package SOLID.DIP.GoodCode;

public interface GreetingService {
    //Method()
    void greet();
}

class EnglishGreeting implements GreetingService{

    @Override
    public void greet() {
        System.out.println("Hello");
    }
}
class HindiGreeting implements GreetingService{

    @Override
    public void greet() {
        System.out.println("Namaste");
    }
}

class GreetingApp{
    private GreetingService greetingService;

    //DIP via constructor injection

    public GreetingApp(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sendGreeting(){
        greetingService.greet();
    }
}

class GoodDIPDemo{
    public static void main(String[] args) {
        GreetingService hindi = new HindiGreeting();
        GreetingApp greetingApp=new GreetingApp(hindi);
        greetingApp.sendGreeting();

        GreetingService english=new EnglishGreeting();
        GreetingApp greetingApp1=new GreetingApp(english);
        greetingApp1.sendGreeting();
    }
}