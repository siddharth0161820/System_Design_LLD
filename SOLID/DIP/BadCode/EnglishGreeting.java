//We want to greet users in different
// languages (English, Hindi, etc.)
package SOLID.DIP.BadCode;

public class EnglishGreeting {
    //Method()
    public void greet(){
        System.out.println("Hello");
    }

}

class GreetingApp {
    EnglishGreeting englishGreeting = new EnglishGreeting();//Tightly coupled

    //Method()
    public void sendGreeting() {
        englishGreeting.greet();
    }

}
    class BadDIPDemo{
        public static void main(String[] args) {
            GreetingApp greetingApp=new GreetingApp();
            greetingApp.sendGreeting();
        }
    }


    //🔴 Problem:
   // GreetingApp is locked to EnglishGreeting
//❌ If you want Hindi, you must change this class



