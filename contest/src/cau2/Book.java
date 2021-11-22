/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import java.util.Scanner;
/**
 *
 * @author antsh
 */
public class Book extends Document {
    private String numberOfPage ; 
    private String author ; 
    Scanner sc = new Scanner (System.in) ;
    public Book() {
    }

    public Book(String numberOfPage, String author) {
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public String getNumberOfPage() {
        return numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setNumberOfPage(String numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void input() {
        super.inputDo();
        System.out.print("Nhap so trang sach : "); this.numberOfPage = sc.nextLine();
        System.out.print("Nhap ten tac gia : "); this.author = sc.nextLine();
    }
    
    public void output(){
        super.outputDO();
        System.out.println("So trang sach : " +numberOfPage);
        System.out.println("Ten tac gia sach : " +author);
    }

}
