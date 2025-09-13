package Inheritance;
public class Order {
    int orderId;
    String orderDate;
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    String getOrderStatus() {
        return "Order placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    String getOrderStatus() {
        return "Order shipped, Tracking: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

class RetailOrder {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(101, "2025-09-01", "TRK12345", "2025-09-05");
        System.out.println(d.getOrderStatus());
    }
}
