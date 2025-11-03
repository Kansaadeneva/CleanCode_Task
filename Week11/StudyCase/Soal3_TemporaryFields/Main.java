package Week11.StudyCase.Soal3_TemporaryFields;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SOLUSI 1: Simple ===");
        Invoice_Simple simple = new Invoice_Simple();
        simple.printInvoice(200000);
        
        System.out.println("\n=== SOLUSI 2: Better ===");
        Invoice_Better better = new Invoice_Better();
        better.printInvoice(200000);
        
        InvoiceCalculation calc = better.calculate(200000);
        System.out.println("Breakdown: " + calc);
        
        System.out.println("\n=== SOLUSI 3: Production ===");
        Invoice invoice = new Invoice("INV-001");
        invoice.addItem(new InvoiceItem("Product A", 100000));
        invoice.addItem(new InvoiceItem("Product B", 100000));
        invoice.print();
        
        System.out.println("\nTotal yang harus dibayar: Rp " + invoice.calculateTotal());
    }
}
