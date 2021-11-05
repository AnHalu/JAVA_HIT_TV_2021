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
public class NhanSu {
    public String maNhanSu ; 
    public String hoTen ; 
    Scanner sc = new Scanner(System.in) ;
    Date NS = new Date(); 
    public void Nhap(){
        System.out.print("Nhap ma nhan su : "); this.maNhanSu = sc.nextLine() ; 
        System.out.print("Nhap ho ten :"); this.hoTen = sc.nextLine() ; 
        NS.Nhap();
    }
    public void Xuat(){
        System.out.println("Ma nhan su :" + this.maNhanSu );
        System.out.println("Ho ten :" + this.hoTen);
        NS.Xuat();
    }
}
