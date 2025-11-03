public class EWalletPayment implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Processing e-wallet: " + amount);
    }
}
