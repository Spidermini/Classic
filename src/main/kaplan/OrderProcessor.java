package main.kaplan;

import java.util.List;
import java.util.ArrayList;

public class OrderProcessor {

    public List<Order> processOrders(List<Order> orders) {
        List<Order> processedOrders = new ArrayList<>();
        for (Order order : orders) {
            // Check if order is valid
            if (order.getItems().size() > 0 && order.getTotalAmount() > 0) {
                // Apply discount if applicable
                if (order.getTotalAmount() > 100) {
                    order.setTotalAmount(order.getTotalAmount() * 0.9);
                }
                processedOrders.add(order);
            }
        }
        return processedOrders;
    }

    class Order {
        private List<Item> items;
        private double totalAmount;

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }

        public double getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "items=" + items +
                    ", totalAmount=" + totalAmount +
                    '}';
        }
    }

    class Item {
        private String name;
        private double price;

        // Getters and Setters
    }
}

