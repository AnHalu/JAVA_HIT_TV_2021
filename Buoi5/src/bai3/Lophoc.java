/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner ; 
import java.util.ArrayList ; 
/**
 *
 * @author antsh
 */
public class Lophoc {
    public String Malh ; 
    public String tenlh ; 
    public String Ngaymo ; 
    public String Giaovien ; 
    
    Scanner sc = new Scanner(System.in) ;
    ArrayList<Sinhvien> sv = new ArrayList<>() ; 
    public int n; 

    public Lophoc() {
    }

    public Lophoc(String Malh, String tenlh, String Ngaymo, String Giaovien, int n) {
        this.Malh = Malh;
        this.tenlh = tenlh;
        this.Ngaymo = Ngaymo;
        this.Giaovien = Giaovien;
        this.n = n;
    }

    public String getMalh() {
        return Malh;
    }

    public String getTenlh() {
        return tenlh;
    }

    public String getNgaymo() {
        return Ngaymo;
    }

    public String getGiaovien() {
        return Giaovien;
    }

    public ArrayList<Sinhvien> getSv() {
        return sv;
    }

    public int getN() {
        return n;
    }

    public void setMalh(String Malh) {
        this.Malh = Malh;
    }

    public void setTenlh(String tenlh) {
        this.tenlh = tenlh;
    }

    public void setNgaymo(String Ngaymo) {
        this.Ngaymo = Ngaymo;
    }

    public void setGiaovien(String Giaovien) {
        this.Giaovien = Giaovien;
    }

    public void setSv(ArrayList<Sinhvien> sv) {
        this.sv = sv;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void Nhaplh() {
        System.out.print("Nhap ma lop hoc : "); Malh = sc.nextLine() ;
        System.out.print("Nhap ten lop hoc : "); tenlh = sc.nextLine() ;
        System.out.print("Nhap ngay mo lop : "); Ngaymo = sc.nextLine() ;
        System.out.print("Nhap ten giao vien : "); Giaovien = sc.nextLine() ;
        System.out.print("Nhap so luong sinh vien : "); n = sc.nextInt() ; 
        
        for(int i=0;i<n;i++){
            Sinhvien x = new Sinhvien(); 
            x.nhapsv() ; 
            sv.add(x) ; 
        }
    }
    public void Xuatlh() {
        System.out.println("Output!");
        System.out.println("Ma lop hoc :" + Malh);
        System.out.println("Ten lop hoc :" +  tenlh);
        System.out.println("Ngay mo lop hoc :" + Ngaymo);
        System.out.println("Giao vien :" + Giaovien);
        int maxx =0 ;
        for(int i =0 ;i<n;i++)
        {
            sv.get(i).xuatsv(); 
            if( sv.get(i).khoahoc ==15) {
                maxx ++ ;
            }
        }
        System.out.println("Lop co " + maxx + " sinh vien k15 !");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1 ; j<n;j++) 
            {
                if(sv.get(i).khoahoc > sv.get(j).khoahoc) 
                {
                    int swap = sv.get(i).khoahoc ;
                    sv.get(i).khoahoc = sv.get(j).khoahoc ; 
                    sv.get(j).khoahoc = swap ; 
                }
            }
        }
        for(int i =0 ;i<n;i++)
        {
            sv.get(i).xuatsv(); 
            
        }
        
    }
}
