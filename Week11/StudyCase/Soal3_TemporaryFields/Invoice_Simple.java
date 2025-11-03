package Week11.StudyCase.Soal3_TemporaryFields;

public class Invoice_Simple {
    
    public void printInvoice(double price) {
        double tax = price * 0.1;
        double total = price + tax;
        System.out.println("Total invoice: " + total);
    }
}