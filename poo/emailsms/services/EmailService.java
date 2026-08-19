package poo.emailsms.services;

public class EmailService implements NotificationService {

    @Override
    public void send(String recipient, String message) {
        System.out.println("Email to " + recipient + ": " + message);
    }
}
