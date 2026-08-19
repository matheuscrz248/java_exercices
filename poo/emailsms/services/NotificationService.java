package poo.emailsms.services;

public interface NotificationService {

    void send(String recipient, String message);

    default String formatMessage(String product, double price) {
        return "Your order for " + product + " has been confirmed! Total: $" + String.format("%.2f", price);
    }

}
