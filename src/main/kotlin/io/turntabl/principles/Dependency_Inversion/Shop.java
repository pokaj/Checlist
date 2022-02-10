package io.turntabl.principles.Dependency_Inversion;

public class Shop {

    private Card card;

    public Shop(Card card){
        this.card = card;
    }

    public void purchaseGucciBelt(){
        card.makePayment(10000);
    }

    public static void main(String[] args) {
        Card debitCard = new DebitCard(20000);
        Card creditCard = new CreditCard(1000);

        Shop adidas =  new Shop(debitCard);
        Shop nike =  new Shop(creditCard);

        adidas.purchaseGucciBelt();
        nike.purchaseGucciBelt();
    }

}
