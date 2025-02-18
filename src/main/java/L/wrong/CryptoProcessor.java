package L.wrong;

import L.right.PaymentProcessor;

public class CryptoProcessor extends PaymentProcessor {
    @Override
    public void processPayment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
