/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner ; 
/**
 *
 * @author antsh
 */
public class Datetime {
    public String Ngay ;
    public String Thang ;
    public String Nam;
    Scanner sc = new Scanner (System.in) ;
    public void inputDate() {
        System.out.print("Nhap ngay : "); Ngay = sc.nextLine() ;
        System.out.print("Nhap thang : "); Thang = sc.nextLine() ;
        System.out.print("Nhap nam : "); Nam = sc.nextLine() ;
    }
    public void outputDate() {
        System.out.println("Ngay : " + Ngay); 
        System.out.println("Thang : " + Thang); 
        System.out.println("Nam : " + Nam); 
    }
}
