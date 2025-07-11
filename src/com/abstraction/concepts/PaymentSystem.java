package com.abstraction.concepts;

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentGateway pg = new PayPal();
        pg.pay(1000);

        pg = new Stripe();
        pg.pay(2000);
    }
}
