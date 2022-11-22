package designpatterns.structural.adapter;

import designpatterns.structural.adapter.payu.PayUPaymentStatus;

public interface PaymentGateway {

    Long payViaCC(String cardNumber,int cvv, int expiryMonth,int expiryYear);

    PaymentStatus getStatus(Long id);
}
