package Week11.StudyCase.Soal3_TemporaryFields;

public class InvoiceCalculation {
    private final double price;
    private final double tax;
    private final double total;
    
    public InvoiceCalculation(double price) {
        this.price = price;
        this.tax = price * 0.1;
        this.total = price + tax;
    }
    
    public double getPrice() { return price; }
    public double getTax() { return tax; }
    public double getTotal() { return total; }
    
    @Override
    public String toString() {
        return String.format("Price: %.2f, Tax: %.2f, Total: %.2f", 
                           price, tax, total);
    }
}
