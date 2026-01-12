package DI;

public class SMSService implements NotificationService{
    @Override
    public void send() {
        System.out.println("Sms sent...");
    }
}
