package SOLID.OCP.GoodCode;

public class EmailNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sends message using Email");
    }
}

