/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1;

import java.util.Scanner ;
/**
 *
 * @author antsh
 */
public class bai1 {
   public static void main(String[] args) {
       // anhalu 
        String str ;
        System.out.print("Nhap chuoi : ");
        Scanner sc = new Scanner(System.in) ; 
        
        str = sc.nextLine() ; 
        int cnt = 0 ; 
        int ans = 1 ; 
        for (int i=0 ; i<str.length();i++)
        {
            if(str.charAt(i) >='0' && str.charAt(i)<='9') 
            {
                cnt++ ;
                ans = ans*(str.charAt(i)-'0') ;
            }
        }
          System.out.println("co " + cnt + "ky tu so !");
          System.out.println("Tich ban : " + ans );
    }
}
