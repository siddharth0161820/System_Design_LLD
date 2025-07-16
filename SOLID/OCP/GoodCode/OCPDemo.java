package SOLID.OCP.GoodCode;

import java.util.Arrays;
import java.util.List;

public class OCPDemo {
    public static void main(String[] args) {
        List<Notification>list= Arrays.asList(
                new PhoneNotification(),
                new WhatsAppNotification(),
                new EmailNotification()
        );
        //Apply for -Loop
        for (Notification notification:list){
            notification.send();
        }
    }
}

//NOTE:
//Line 8-12
//We are creating a list of Notification objects.
//All objects inside the list are implementations of the Notification interface:
//EmailNotification
// SMSNotification
//WhatsAppNotification

//Think of it like:
//I have a list of different message senders, all follow the same rule:
// “I must have a send() method” (that’s what the interface ensures).

//FOR EACH LOOP

//It's a for-each loop.
//It goes through each object in the list (EmailNotification, SMSNotification, etc.).
//For each object, it calls the send() method.
//So first, it sends email,
//then sends SMS,
//then sends WhatsApp message — all using the same notification.send() call.