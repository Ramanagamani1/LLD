package designpatterns.structural.adapter;

public class Client {

    Flipkart flipkart = new Flipkart(new RazorpayPaymentGatewayAdapter());
}
