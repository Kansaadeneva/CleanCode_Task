public class CardPayment implements PaymentStrategy{
    @Override
    public void process(double amount) {
        System.out.println("Processing credit card: " + amount);
    }    
}
