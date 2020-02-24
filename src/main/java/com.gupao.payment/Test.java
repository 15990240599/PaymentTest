package com.gupao.payment;


public class Test {

    public static void main(String[] args) {
        PaymentFactory paymentFactory = new AliPaymentFactory();
        Payment payment = paymentFactory.create();
        payment.todo();
    }
}
