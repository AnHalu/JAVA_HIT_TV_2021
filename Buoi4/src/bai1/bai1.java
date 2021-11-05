/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

import java.util.Scanner ;
/**
 *
 * @author antsh
 */
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n ; 
        System.out.print("Nhap n :");
        n = sc.nextInt(); 
        SACH [] A = new SACH[n] ;
        for(int i=0;i<n;i++){
            A[i] = new SACH() ;
            System.out.println("Nhap thong tin sach thu " + i);
            A[i].Nhap();
        }
        for(int i=0;i<n;i++){
            System.out.println("Thong tin sach thu " + i);
            A[i].Xuat();
        }
    }
    
}
