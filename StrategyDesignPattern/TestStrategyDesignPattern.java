package StrategyDesignPattern;
//1>Strategy Interface(Menu Card)
interface paymentStrategy {
    //Method()
    public void pay(int amount);
}

//2>Concrete Strategies--1(Credit card)
class CreditCardPayment implements paymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using Credit Card:" );
        System.out.println("Radhe Radhe");
    }
}

//3>Concrete Strategies--2(PayPal)
class PayPalPayment implements paymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using PayPal:" );
        System.out.println("Radhe Radhe");
    }
}
//4>Context class(Waiter)uses strategy to make payment at runtime
class paymentContext{
    //Variables
    private paymentStrategy paymentStrategy;
    //Setter
    //set payment method(choose ur food)
    public void setPaymentStrategy(paymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    //Execute the method(serve the food)
    public void executePayment(int amount){
        paymentStrategy.pay(amount);
    }
}
//Main(ordering ur meal and paying)
public class TestStrategyDesignPattern {
    public static void main(String[] args) {
        paymentContext paymentContext=new paymentContext();
        //choose credit card as payment option
        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.executePayment(51); //output paid 50 using credit card

        //choose using paypal
        paymentContext.setPaymentStrategy(new PayPalPayment());
        paymentContext.executePayment(101);//output paid 101 using paypal
        System.out.println("Radhe Radhe");
        System.out.println("Har Har Mahadev");
        System.out.println("ShivShaktiKaryaShidi");

    }
}
