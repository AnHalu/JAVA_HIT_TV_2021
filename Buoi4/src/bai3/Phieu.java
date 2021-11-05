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
public class Phieu {
    public String Maphieu ; 
    Scanner sc = new Scanner(System.in) ; 
    int n ; 
    Hang x[] ; 
    public void Nhap() {
        System.out.print("Nhap ma phieu :"); Maphieu = sc.nextLine() ;
        System.out.print("Nhap n :"); n = sc.nextInt(); 
        x = new Hang[n] ; 
        for(int i=0;i<n;i++)
        {
            x[i] = new Hang() ;
            x[i].Nhap();
        }
    }
    public void Xuat(){
        System.out.println("Ma phieu : " + this.Maphieu) ; 
        for(int i=0;i<n;i++){
            System.out.println("Hang thu " + (i+1));
            x[i].Xuat();
        }
    }
}
