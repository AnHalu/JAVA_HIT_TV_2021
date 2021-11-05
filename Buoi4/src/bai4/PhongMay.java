/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author antsh
 */
public class PhongMay {

    public String Maphong;
    public String Tenphong;
    public int Dientich;
    Quanly x = new Quanly();
    May y[];
    int n;
    Scanner sc = new Scanner(System.in);

    public void Nhap() {
        System.out.print("Nhap ma phong may : ");
        Maphong = sc.nextLine();
        System.out.print("Nhap ten phong : ");
        Tenphong = sc.nextLine();
        System.out.print("Nhap dien tich phong : ");
        Dientich = sc.nextInt();
        sc.nextLine();
        x.Nhap();
        System.out.print("Nhap so may co trong phong : ");
        n = sc.nextInt();
        y = new May[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap may thu " + (i + 1));
            y[i] = new May();
            y[i].Nhap();
        }
    }

    public void Xuat() {
        System.out.println("Ma phong may :" + this.Maphong);
        System.out.println("Ten phong may :" + this.Tenphong);
        System.out.println("Dien tich phong may :" + this.Dientich);
        x.Xuat();
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin may thu " + (i + 1));
            y[i].Xuat();
        }
    }
}
