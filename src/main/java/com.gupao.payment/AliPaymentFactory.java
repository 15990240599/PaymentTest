package com.gupao.payment;
public class AliPaymentFactory implements PaymentFactory{
    public Payment create() {
        return new AliPayment();
    }
}
