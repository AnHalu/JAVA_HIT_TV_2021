package bai1;

import java.util.Scanner ;

public class Employee extends Person{

    Scanner sc = new Scanner(System.in);

    private int Salary ;

    public Employee() {
    }
    public Employee(String name , String adress , int Salary ) {
        this.setSalary(Salary);
        this.setName(name);
        this.setAdress(adress) ;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public void nhap(){
        System.out.print("Input name employee : ");
        this.setName(sc.nextLine());
        System.out.print("Input adress employee : ");
        this.setAdress(sc.nextLine());
        System.out.print("Input salary : ");
        this.setSalary(sc.nextInt());
    }

    @Override
    public void display() {
        System.out.println("Employee name : " + this.getName());
        System.out.println("Employee address : " + this.getAdress());
        System.out.println("Employee salary : " + this.getSalary());
    }

}
