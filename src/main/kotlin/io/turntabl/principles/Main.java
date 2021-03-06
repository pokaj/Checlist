package io.turntabl.principles;

import io.turntabl.principles.Dependency_Inversion.Card;
import io.turntabl.principles.Dependency_Inversion.CreditCard;
import io.turntabl.principles.Dependency_Inversion.DebitCard;
import io.turntabl.principles.Dependency_Inversion.Shop;
import io.turntabl.principles.SPA.Library.Book;
import io.turntabl.principles.SPA.Library.Invoice;
import io.turntabl.principles.SPA.Library.InvoicePrinter;
import io.turntabl.principles.SPA.TextManipulation.TextManipulator;
import io.turntabl.principles.SPA.TextManipulation.TextPrinter;

public class Main {

    public static void main(String[] args){
        // Single Responsibility Principle
//        Example 1
        TextManipulator manipulator = new TextManipulator("This is the initial text");
        manipulator.appendText("This is the second text");
        TextPrinter printer = new TextPrinter(manipulator);
        printer.printText();
        printer.printOutEachWordOfText();

//        Example 2
        Book book = new Book("Red Riding Hood", "Philip", 2022, 200, "isbn1");
        Invoice invoice = new Invoice(book, 3);
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.print();

        // Dependency Inversion
        Card debitCard = new DebitCard(20000);
        Card creditCard = new CreditCard(1000);

        Shop adidas =  new Shop(debitCard);
        Shop nike =  new Shop(creditCard);

        adidas.purchaseGucciBelt();
        nike.purchaseGucciBelt();
    }
}
