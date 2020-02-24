package com.gupao.payment;

public class OtherChinaPaymentFactory implements PaymentFactory{
    public Payment create() {
        return new OtherChinaPayment();
    }
}
