package org.example.singleresponsibility;

class InvoicePrinter {
    public void printInvoice(Invoice invoice) {
        System.out.println("Printing Invoice: " + invoice.getInvoiceDetails());
    }
}
