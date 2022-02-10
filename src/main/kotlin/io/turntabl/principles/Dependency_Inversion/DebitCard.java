package io.turntabl.principles.Dependency_Inversion;

public class DebitCard implements Card{

    private int balance;

    public DebitCard(int balance) {
        this.balance = balance;
    }

    public void makePayment(int total){
        System.out.println("This user is using a Debit Card.");
        System.out.println(total > balance ? "User does not have enough funds" : "Item purchased");
    }

}
