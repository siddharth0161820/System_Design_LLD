package SOLID.OCP.GoodCode;

public class PhoneNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sends message using Phone");
    }
}
