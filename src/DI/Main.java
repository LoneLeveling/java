package DI;

import javax.management.Notification;

public class Main {
    public static void main(String[] args) {
       NotificationService notificationService= new EmailService();
       OrderService orderService = new OrderService(notificationService);
       orderService.getNotificationService();
    }
}
