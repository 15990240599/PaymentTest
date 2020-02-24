package com.gupao.payment;

public class WeChatPaymentFactory implements PaymentFactory{
    public Payment create() {
        return new WeChatPayment();
    }
}
