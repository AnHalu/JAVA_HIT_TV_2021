/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner ; 
import java.util.ArrayList ;
/**
 *
 * @author antsh
 */
public class Phieu {
    public String Maphieu ; 
    public String Tenphieu ;
    private Datetime a ; 
    private ArrayList<Sanpham> sp = new ArrayList<>() ; 
    int n ; 
    
    Scanner sc = new Scanner(System.in) ; 
    public void InputPhieu(){
        System.out.print("Nhap ma phieu : "); Maphieu = sc.nextLine() ; 
        System.out.print("Nhap ten phieu : "); Tenphieu = sc.nextLine() ; 
        System.out.println("Nhap date ! ") ;
        a = new Datetime() ;
        a.inputDate();
        System.out.print("Nhap so luong san pham : "); n = sc.nextInt() ; 
        for(int i=0;i<n;i++)
        {
            Sanpham x = new Sanpham() ; 
            x.InputSp();
            sp.add(x) ; 
        }
    }
    public void outputPhieu() {
        System.out.println("Output !");
        System.out.println("Ma phieu : " + Maphieu );
        System.out.println("Ten phieu : " + Tenphieu );
        a.outputDate(); 
        for(int i=0 ;i<n ; i++){
            sp.get(i).OutputSp(); 
            System.out.println("Thanh tien :" + sp.get(i).Soluong * sp.get(i).Dongia );
        }
    }
}
