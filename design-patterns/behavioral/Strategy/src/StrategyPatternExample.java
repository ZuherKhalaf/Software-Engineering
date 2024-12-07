package src;

public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay with Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.executePayment(500);

        // Pay with PayPal
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.executePayment(300);
    }
}
