package SOLID.OCP.GoodCode;

public class WhatsAppNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sends message using WhatsApp");
    }
}
