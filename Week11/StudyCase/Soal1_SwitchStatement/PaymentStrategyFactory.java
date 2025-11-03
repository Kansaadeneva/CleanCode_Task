public class PaymentStrategyFactory {
    public static PaymentStrategy getStrategy(String type) {
        switch (type) {
            case "CASH":
                return new CashPayment();
            case "CARD":
                return new CardPayment();
            case "EWALLET":
                return new EWalletPayment();
            default:
                throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }
}
