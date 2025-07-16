package SOLID.OCP.BadCode;

public class BadDemo {
    public static void main(String[] args) {
        NotificationService notificationService=new NotificationService();
        notificationService.sendNotifications("Email");
        notificationService.sendNotifications("Phone");
        notificationService.sendNotifications("WhatsApp");
    }
}
