/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author antsh
 */
import java.util.Scanner ; 
public class dieuhoa extends sanpham{
    public int Congsuat;
    public int Giaban;
    Scanner sc = new Scanner(System.in) ;
    public void Nhap(){
        super.nhap();
        System.out.print("Nhap Cong suat : "); Congsuat = sc.nextInt() ; 
        System.out.print("Nhap Gia ban : "); Giaban = sc.nextInt() ; 
    }
    public void Xuat(){
        super.xuat();
        System.out.println("Cong suat : " + Congsuat); 
        System.out.println("Gia ban  : " + Giaban); 
    }
}
