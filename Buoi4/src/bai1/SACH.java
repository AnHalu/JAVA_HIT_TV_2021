/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner ; 
/**
 *
 * @author antsh
 */
public class SACH {

    public String Masach;
    public String Tensach;
    public String Nsb;
    public int Sotrang;
    public int Giatien;

    Scanner sc = new Scanner(System.in) ;
    public void Nhap() {
        System.out.print("Nhap ma sach : "); this.Masach = sc.nextLine(); 
        System.out.print("Nhap ten sach : "); this.Tensach = sc.nextLine(); 
        System.out.print("Nhap ten nsb : "); this.Nsb = sc.nextLine();
        System.out.print("Nhap so trang : "); this.Sotrang = sc.nextInt(); 
        System.out.print("Nhap gia tien : "); this.Giatien = sc.nextInt(); 
    }
    public void Xuat(){
        System.out.println("Ma sach la : " + this.Masach) ; 
        System.out.println("Ten sach la : " + this.Tensach) ; 
        System.out.println("Ten Nsb la : " + this.Nsb) ; 
        System.out.println("So trang : " + this.Sotrang) ; 
        System.out.println("Gia tien : " + this.Giatien) ; 
    }
}
