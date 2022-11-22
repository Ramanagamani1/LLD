package designpatterns.structural.adapter;

public class Flipkart {

    private PaymentGateway paymentGateway;

    public Flipkart(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void makePayment(String cardNumber,int cvv, int expiryMonth,int expiryYear) {

          Long transactioId = paymentGateway.payViaCC(
                  cardNumber,
                  cvv,
                  expiryMonth,
                  expiryYear
          );

          while (!paymentGateway.getStatus(transactioId).equals(PaymentStatus.SUCCESS)) {
              System.out.println("Waiting!");
          }
    }
}
