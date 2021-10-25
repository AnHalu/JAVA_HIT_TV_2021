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
public class main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("Nhap chuoi : ") ; 
        String s; 
        s = sc.nextLine(); 
        int sum=0, cnt=0; 
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i))) 
            {
                sum += Integer.parseInt(String.valueOf(s.charAt(i))) ; 
                cnt++ ; 
            }
        }
        if(cnt==0) 
        {
            System.out.println("False"); 
        }
        else 
        {
            System.out.println("True") ; 
            System.out.println("Trung binh cong : " + (float) sum/cnt) ;  ; 
            
        }
    }
}
