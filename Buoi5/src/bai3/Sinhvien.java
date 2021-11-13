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
public class Sinhvien extends Nguoi{
    public String Masv ; 
    public String Nganh ; 
    public int khoahoc ; 
    Scanner sc = new Scanner(System.in) ; 

    public Sinhvien() {
    }

    public Sinhvien(String Masv, String Nganh, int khoahoc) {
        this.Masv = Masv;
        this.Nganh = Nganh;
        this.khoahoc = khoahoc;
    }

    public String getMasv() {
        return Masv;
    }

    public String getNganh() {
        return Nganh;
    }

    public int getKhoahoc() {
        return khoahoc;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public String getQuequan() {
        return Quequan;
    }

   

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public void setKhoahoc(int khoahoc) {
        this.khoahoc = khoahoc;
    }
    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public void setQuequan(String Quequan) {
        this.Quequan = Quequan;
    }
    
    public void nhapsv() {
        super.Nhap();
        System.out.print("Nhap ma sv : "); Masv = sc.nextLine() ; 
        System.out.print("Nhap nganh : "); Nganh = sc.nextLine() ; 
        System.out.print("Nhap khoa hoc : "); khoahoc = sc.nextInt() ; 
    }
    public void xuatsv() {
        super.Xuat();
        System.out.println("Ma sv : " + Masv);
        System.out.println("Nganh : " + Nganh);
        System.out.println("Khoa hoc : " + khoahoc);
    }
}
