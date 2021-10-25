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
public class baii4 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in) ; 
        String s; 
        System.out.print("Nhap chuoi :") ;
        s = sc.nextLine(); 
        s=s.trim(); 
        while (s.contains("  ")) 
        {
            s=s.replaceAll("  ", " ") ;
        }
        s = s.toLowerCase();
        String[] a = s.split(" ");
        String str = "";
        for(int i = 0; i < a.length; i++) 
        {
            str += a[i].substring(0,1).toUpperCase() + a[i].substring(1) + " ";
        }
        
        System.out.println("Chuoi sau khi chuan hoa :" + str);
        
        
    }
            
}
