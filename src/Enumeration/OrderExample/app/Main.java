package Enumeration.OrderExample.app;

import Enumeration.OrderExample.entities.enums.Order;
import Enumeration.OrderExample.entities.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(150, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order1);

        OrderStatus orderStatus = OrderStatus.DELIVERED;

        OrderStatus orderStatus2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(orderStatus);
        System.out.println(orderStatus2);

    }
}
