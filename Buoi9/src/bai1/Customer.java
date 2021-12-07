package bai1;

import java.util.Scanner ;

public class Customer extends Person {
    private int balance ;

    Scanner sc = new Scanner(System.in) ;
    public Customer() {
    }

    public Customer(String name ,String adress, int balance) {
        this.setName(name);
        this.setAdress(adress);
        this.setBalance(balance);
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void nhap(){
        System.out.print("Input customer name : ");
        this.setName(sc.nextLine());
        System.out.print("Input customer address : ");
        this.setAdress(sc.nextLine());
        System.out.print("Input customer balance : ") ;
        this.setBalance(sc.nextInt());
    }

    @Override
    public void display() {
        System.out.println("Customer name : " + this.getName());
        System.out.println("Customer address : " + this.getAdress());
        System.out.println("Customer salary : " + this.getBalance());
    }
}
