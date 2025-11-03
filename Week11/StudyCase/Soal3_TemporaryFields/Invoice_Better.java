package Week11.StudyCase.Soal3_TemporaryFields;

public class Invoice_Better {
    
    public InvoiceCalculation calculate(double price) {
        return new InvoiceCalculation(price);
    }
    
    public void printInvoice(double price) {
        InvoiceCalculation calc = calculate(price);
        System.out.println("Total invoice: " + calc.getTotal());
    }
}