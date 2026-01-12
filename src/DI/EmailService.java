package DI;

public class EmailService implements  NotificationService{

    @Override
    public void send() {
        System.out.println("Email msg sent....");
    }
}
