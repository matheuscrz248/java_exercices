package poo.emailsms.services;

public class SmsService implements NotificationService {

    @Override
    public void send(String recipient, String message) {
        System.out.println("Sms to " + recipient + ": " + message);
    }
}
