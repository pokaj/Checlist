package io.turntabl.principles.SPA.Library;

public class Invoice {

    public Book book;
    public int quantity;
    public double total;

    public Invoice(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
        this.total = this.calculateTotal();
    }

    //todo: calculate the total cost of books being purchased
    public double calculateTotal() {
        return book.price * this.quantity;
    }

    //todo: print an invoice for the purchased books
    public void printInvoice() {
        System.out.println(quantity + "x " + book.name + " " + book.price + "$");
        System.out.println("Total: " + total);
    }

    //todo: write the invoice to the file
    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }

    /* todo: This class is performing 3 different actions
        1. Calculating the total price.
        2. Printing the invoice of the purchase
        3. Writing the invoice to a file
        The SPA is violated by 1. and 2. which contain the methods for printing the invoice
        and writing it to a file respectively. It presents 3 different reason why we would
        need to change this method. This can be resolved by creating a separate class
        for both methods.
     */
}
