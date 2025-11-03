class Main {
    public static void main(String[] args) {
        PaymentProcessor processor1 = new PaymentProcessor(new CashPayment());
        processor1.processPayment(100000);
        
        processor1.setStrategy(new CardPayment());
        processor1.processPayment(200000);
        
        processor1.setStrategy(new EWalletPayment());
        processor1.processPayment(50000);
        
        System.out.println("\n--- Menggunakan Factory ---");
        
        PaymentProcessor processor2 = new PaymentProcessor(
            PaymentStrategyFactory.getStrategy("CASH")
        );
        processor2.processPayment(100000);
        
        processor2.setStrategy(PaymentStrategyFactory.getStrategy("CARD"));
        processor2.processPayment(200000);
        
        processor2.setStrategy(PaymentStrategyFactory.getStrategy("EWALLET"));
        processor2.processPayment(50000);
    }
}