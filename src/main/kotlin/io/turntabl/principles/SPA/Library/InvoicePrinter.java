package io.turntabl.principles.SPA.Library;

public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print() {
        System.out.println(invoice.quantity + "x " + invoice.book.name + " "  + invoice.book.price);
        System.out.println("Total: " + "$" + invoice.total);
    }

}
