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
public class Sanpham {
     public String Masp ;    
     public String Tensp ;    
     public int Soluong ;    
     public int Dongia ;    
     Scanner sc = new Scanner(System.in) ; 
     
     public void InputSp() {
         System.out.print("Nhap ma san pham :"); Masp = sc.nextLine() ;
         System.out.print("Nhap ten san pham :"); Tensp = sc.nextLine() ;
         System.out.print("Nhap so luong san pham :"); Soluong = sc.nextInt() ;
         System.out.print("Nhap don gia san pham :"); Dongia = sc.nextInt() ;
     }
     public void OutputSp() {
         System.out.println("Ma san pham : " + Masp);
         System.out.println("Ten san pham : " + Tensp);
         System.out.println("So luong san pham : " + Soluong);
         System.out.println("Don gia san pham : " + Dongia);
     }
}

