package DI;

import javax.management.Notification;

public class Main //Controller class
{
    public static void main(String[] args) {
       NotificationService notificationService= new EmailService();
        NotificationService notificationService1 = new SMSService();
        NotificationService notificationService2= new WhatsAppNotification();

      OrderService orderService = new OrderService(notificationService);
      orderService.getNotificationService();

      OrderService orderService1 = new OrderService(notificationService1);
      orderService1.getNotificationService();

      OrderService orderService2=new OrderService(notificationService2);
      orderService2.getNotificationService();
    }
}
