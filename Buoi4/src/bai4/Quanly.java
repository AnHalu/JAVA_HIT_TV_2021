/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.Scanner ; 
/**
 *
 * @author antsh
 */
public class Quanly {
    public String Maql ;
    public String Hoten ;
    Scanner sc = new Scanner(System.in) ;
    public void Nhap(){
        System.out.print("Nhap ma quan ly : "); this.Maql = sc.nextLine() ; 
        System.out.print("Nhap ho ten : "); this.Hoten = sc.nextLine() ; 
    }
    public void Xuat(){
        System.out.println("Ma quan ly : " + this.Maql );
        System.out.println("Ho va ten : " + this.Hoten );
    }
}
