/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import java.util.Scanner ; 
/**
 *
 * @author antsh
 */
public class Document {
    private String id ; 
    private String name ; 
    private String publisher ; 
    private double price ; 
    Scanner sc = new Scanner(System.in) ;
    public Document() {
    }

    public Document(String id, String name, String publisher, double price) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void inputDo() {
        System.out.print("Nhap id sach : "); this.id = sc.nextLine() ;
        System.out.print("Nhap ten sach : "); this.name = sc.nextLine() ;
        System.out.print("Nhap NSB sach : "); this.publisher = sc.nextLine() ;
        System.out.print("Nhap gia sach : "); this.price = sc.nextInt() ;
    }
    
    public void outputDO() {
        System.out.println("Id sach : " + id); 
        System.out.println("Ten sach : " + name); 
        System.out.println("NSB sach : " + publisher); 
        System.out.println("Gia sach : " + price); 
        
    }
    
    
    
}
