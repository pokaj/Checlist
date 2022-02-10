package io.turntabl.principles.Dependency_Inversion;

public class Shop {

    private Card card;

    public Shop(Card card){
        this.card = card;
    }

    public void purchaseGucciBelt(){
        card.makePayment(10000);
    }

}
