package Strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy; // references the PaymentStrategy interface

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(int amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set");
        }
    }
}
