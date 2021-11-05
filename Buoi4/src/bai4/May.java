/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.Scanner;
/**
 *
 * @author antsh
 */
public class May {
    public String maMay ; 
    public String kieuMay ; 
    public String tinhTrang ; 
    Scanner sc = new Scanner(System.in) ;
    public void Nhap(){
        System.out.print("Nhap ma may : "); this.maMay = sc.nextLine();
        System.out.print("Nhap kieu may : "); this.kieuMay = sc.nextLine();
        System.out.print("Nhap tinh trang: "); this.tinhTrang = sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Ma may : " + this.maMay); 
        System.out.println("Kieu may : " + this.kieuMay); 
        System.out.println("Tinh trang : " + this.tinhTrang); 
    }
}
