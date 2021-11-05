/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;
/**
 *
 * @author antsh
 */
public class Hang {
    public String Mahang ; 
    public String Tenhang ; 
    public int Dongia ; 
    Scanner sc = new Scanner(System.in) ;
    public void Nhap(){
        System.out.print("Nhap ma hang :"); this.Mahang = sc.nextLine() ; 
        System.out.print("Nhap ten hang :"); this.Tenhang = sc.nextLine() ; 
        System.out.print("Nhap don gia :"); this.Dongia = sc.nextInt() ; 
    }
    public void Xuat(){
        System.out.println("Ma hang :" + this.Mahang);
        System.out.println("Ten hang :" + this.Tenhang);
        System.out.println("Don gia :" + this.Dongia);
    }
}
