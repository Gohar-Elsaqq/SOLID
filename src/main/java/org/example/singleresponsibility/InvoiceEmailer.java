package org.example.singleresponsibility;

public class InvoiceEmailer {
    public void emailInvoice(Invoice invoice, String emailAddress) {
        System.out.println("Emailing Invoice to " + emailAddress + ": " + invoice.getInvoiceDetails());
    }
}