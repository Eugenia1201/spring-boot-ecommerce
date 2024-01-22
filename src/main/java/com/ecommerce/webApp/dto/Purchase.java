package com.ecommerce.webApp.dto;

import com.ecommerce.webApp.entity.Address;
import com.ecommerce.webApp.entity.Customer;
import com.ecommerce.webApp.entity.Order;
import com.ecommerce.webApp.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
