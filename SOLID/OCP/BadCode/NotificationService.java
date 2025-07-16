package SOLID.OCP.BadCode;

import SOLID.OCP.GoodCode.WhatsAppNotification;

public class NotificationService {
    //Methods()
    public void sendNotifications(String type){
        //Conditions
        if (type.equals("Email")){
            System.out.println("Send message using Email");
        } else if (type.equals("Phone")) {
            System.out.println("Sends message using Phone");
        }else if (type.equals("WhatsApp")){
            System.out.println("Sends message using WhatsApp");
        }
    }
}
