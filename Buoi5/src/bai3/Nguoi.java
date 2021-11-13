/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner ; 
/**
 *
 * @author antsh
 */
public class Nguoi {
    public String Hoten ;
    public String Ngaysinh ; 
    public String Quequan ; 
    Scanner sc = new Scanner (System.in) ; 
    
    public void Nhap() {
        System.out.print("Nhap ho ten : "); Hoten = sc.nextLine(); 
        System.out.print("Nhap ngay sinh : "); Ngaysinh = sc.nextLine(); 
        System.out.print("Nhap que quan : "); Quequan = sc.nextLine(); 
    } 
    public void Xuat() {
        System.out.println("Ho va ten : " + Hoten); 
        System.out.println("Ngay sinh : " + Ngaysinh); 
        System.out.println("Que quan : " + Quequan); 
    }
}
