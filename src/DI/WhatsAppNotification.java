package DI;

public class WhatsAppNotification implements NotificationService {

    @Override
    public void send() {
        System.out.println("WhatsApp notification sent....");
    }
}
