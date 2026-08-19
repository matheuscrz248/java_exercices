package poo.emailsms.services;

import poo.emailsms.entities.Order;

public class OrderService {

    private NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder(Order order) {
        String message = notificationService.formatMessage(order.getProduct(), order.getPrice());
        notificationService.send(order.getCostumer(), message);

    }
}
