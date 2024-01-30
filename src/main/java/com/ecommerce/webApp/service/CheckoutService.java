package com.ecommerce.webApp.service;

import com.ecommerce.webApp.dto.PaymentInfo;
import com.ecommerce.webApp.dto.Purchase;
import com.ecommerce.webApp.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
