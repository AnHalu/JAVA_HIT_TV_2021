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
public class Date {
    public int D ; 
    public int M ; 
    public int Y ;
    Scanner sc = new Scanner(System.in) ;
    public void Nhap(){
        System.out.print("Nhap ngay : ") ; D = sc.nextInt(); 
        System.out.print("Nhap thang : ") ; M = sc.nextInt(); 
        System.out.print("Nhap nam : ") ; Y = sc.nextInt(); 
    }
    public void Xuat(){
        System.out.println("Ngay : " + D); 
        System.out.println("Thang : " + M); 
        System.out.println("Nam : " + Y);
    }
}
