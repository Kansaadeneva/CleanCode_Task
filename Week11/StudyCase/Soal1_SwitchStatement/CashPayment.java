public class CashPayment implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Processing cash: " + amount);
    }
}
