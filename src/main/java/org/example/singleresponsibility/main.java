package org.example.singleresponsibility;

public class main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Product A " + "price  "+ 100 );
        InvoicePrinter invoicePrinter= new InvoicePrinter();
        invoicePrinter.printInvoice(invoice);
        InvoiceEmailer invoiceEmailer = new InvoiceEmailer();
        invoiceEmailer.emailInvoice(invoice,"gohar@gmaim.com");
    }
}
