package designpatterns.structural.adapter;

import designpatterns.structural.adapter.payu.PayUGateway;
import designpatterns.structural.adapter.payu.PayUPaymentStatus;

public class PayUPaymentGatewayAdapter implements PaymentGateway{

    private PayUGateway payUGateway = new PayUGateway();

    @Override
    public Long payViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
       Long cardNo = Long.parseLong(cardNumber);
       Long expiry = Long.valueOf(expiryMonth) + Long.valueOf(expiryYear)*12;
       Long cvvlong = Long.valueOf(cvv);
       String answer = payUGateway.makeCCPayment(cardNo,cvvlong,expiry);

       return Long.parseLong(answer);
    }

    @Override
    public PaymentStatus getStatus(Long id) {
        String transId = String.valueOf(id);
        if(payUGateway.checkPaymentStatus(transId)== PayUPaymentStatus.SUCCESS)
              return PaymentStatus.SUCCESS;
        else
            return PaymentStatus.FAILURE;

    }
}
