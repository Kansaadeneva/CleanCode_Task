package Week11.StudyCase.Soal3_TemporaryFields;

public class InvoiceItem {
    private final String description;
    private final double price;
    
    public InvoiceItem(String description, double price) {
        this.description = description;
        this.price = price;
    }
    
    public String getDescription() { return description; }
    public double getPrice() { return price; }
}
