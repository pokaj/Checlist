package io.turntabl.principles.Dependency_Inversion;

public class CreditCard implements Card{

    private int balance;
    public CreditCard(int balance){
        this.balance = balance;
    }

    public void makePayment(int total){
        System.out.println("This user is using a Credit Card.");
        System.out.println(total > balance ? "User does not have enough funds" : "Item purchased");
    }
}
