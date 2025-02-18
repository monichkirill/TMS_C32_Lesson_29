package L.right;

public class PaypalProcessor extends PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Processing paypal payment");
    }

}
