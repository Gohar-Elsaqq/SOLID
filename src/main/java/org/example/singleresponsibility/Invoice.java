package org.example.singleresponsibility;

class Invoice {
    private String invoiceDetails;

    public Invoice(String details) {
        this.invoiceDetails = details;
    }

    public String getInvoiceDetails() {
        return invoiceDetails;
    }
}