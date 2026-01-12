package DI;

import javax.management.Notification;

public class Main {
    public static void main(String[] args) {
       NotificationService notificationService= new EmailService();
        NotificationService notificationService1 = new SMSService();
      OrderService orderService = new OrderService(notificationService);
      orderService.getNotificationService();
      OrderService orderService1 = new OrderService(notificationService1);
      orderService1.getNotificationService();
    }
}
