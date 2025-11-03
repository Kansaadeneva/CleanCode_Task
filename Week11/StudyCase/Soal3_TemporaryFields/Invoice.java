package Week11.StudyCase.Soal3_TemporaryFields;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private final String invoiceNumber;
    private final List<InvoiceItem> items;
    private static final double TAX_RATE = 0.1;
    
    public Invoice(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        this.items = new ArrayList<>();
    }
    
    public void addItem(InvoiceItem item) {
        items.add(item);
    }
    
    public double calculateSubtotal() {
        return items.stream()
                   .mapToDouble(InvoiceItem::getPrice)
                   .sum();
    }
    
    public double calculateTax() {
        return calculateSubtotal() * TAX_RATE;
    }
    
    public double calculateTotal() {
        return calculateSubtotal() + calculateTax();
    }
    
    public void print() {
        System.out.println("Invoice #" + invoiceNumber);
        System.out.println("-------------------");
        
        for (InvoiceItem item : items) {
            System.out.printf("%s: Rp %.2f%n", 
                            item.getDescription(), item.getPrice());
        }
        
        System.out.println("-------------------");
        System.out.printf("Subtotal: Rp %.2f%n", calculateSubtotal());
        System.out.printf("Tax (10%%): Rp %.2f%n", calculateTax());
        System.out.printf("TOTAL: Rp %.2f%n", calculateTotal());
    }
}
