package com.kleinpix.assignment7_back_end.factories;

import com.kleinpix.assignment7_back_end.model.Order;

import java.util.Date;
import java.util.Map;

public class OrderFactory {

    public static Order getOrder(Map<String,Date> values) {
        Order order = new Order.Builder()
                .orderDate(values.get("orderDate"))
                .build();
        return order;
    }
}
