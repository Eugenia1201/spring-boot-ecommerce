package com.ecommerce.webApp.service;

import com.ecommerce.webApp.dto.Purchase;
import com.ecommerce.webApp.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
