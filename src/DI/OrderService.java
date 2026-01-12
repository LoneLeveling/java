package DI;

public class OrderService //service class - business logic
{
private NotificationService notificationService;

OrderService(NotificationService notificationService)
{
    this.notificationService=notificationService;
}

void getNotificationService()
{
    notificationService.send();
}
}
