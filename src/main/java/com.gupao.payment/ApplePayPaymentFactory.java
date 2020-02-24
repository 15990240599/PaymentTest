package com.gupao.payment;

public class ApplePayPaymentFactory implements PaymentFactory{
    public Payment create() {
        return new ApplePayment();
    }
}
