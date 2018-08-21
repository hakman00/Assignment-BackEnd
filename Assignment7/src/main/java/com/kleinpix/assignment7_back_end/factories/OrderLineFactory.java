/*
package com.kleinpix.assignment7_back_end.factories;

import com.kleinpix.assignment7_back_end.model.OrderLine;
import com.kleinpix.assignment7_back_end.model.Packages;

import java.util.Map;

public class OrderLineFactory {

    public static OrderLine getOrderLine(Map<String, Object> values, Packages packages)
    {
        OrderLine orderLine = new OrderLine.Builder()
                .id((String) values.get("id"))
                .quantity((String) values.get("quantity"))
                .packages(packages)
                .build();
        return orderLine;
    }


}
*/