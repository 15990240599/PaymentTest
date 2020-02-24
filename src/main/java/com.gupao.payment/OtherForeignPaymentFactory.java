package com.gupao.payment;

public class OtherForeignPaymentFactory implements PaymentFactory{
    public Payment create() {
        return new OtherForeignPayement();
    }
}
