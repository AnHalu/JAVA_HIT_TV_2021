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
public class sanpham {
    public String Masp ;
    public String Tensp ;
    public String Tenhang ;
    public String Ngaynhap ;

    Scanner sc = new Scanner(System.in) ;
    public sanpham() {
    }

    public sanpham(String Masp, String Tensp, String Tenhang, String Ngaynhap) {
        this.Masp = Masp;
        this.Tensp = Tensp;
        this.Tenhang = Tenhang;
        this.Ngaynhap = Ngaynhap;
    }
    public void nhap() {
        System.out.print("Nhap ma san pham : "); Masp = sc.nextLine(); 
        System.out.print("Nhap ten san pham : "); Tensp = sc.nextLine(); 
        System.out.print("Nhap ten hang : "); Tenhang= sc.nextLine(); 
        System.out.print("Nhap ngay nhap : "); Ngaynhap = sc.nextLine(); 
    }
    public void xuat(){
        System.out.println("Ma san phamv :" + Masp);
        System.out.println("Ten san pham :" + Tensp);
        System.out.println("Ten hang :" + Tenhang);
        System.out.println("Ngay nhap : " + Ngaynhap);
    }
}
