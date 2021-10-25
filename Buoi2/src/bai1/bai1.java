/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner ;
import java.lang.Math ;  
/**
 *
 * @author antsh
 */
public class bai1 {
    public static void main(String [] args)
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in) ; 
        a = sc.nextInt() ; 
        b = sc.nextInt() ; 
        c = sc.nextInt() ; 
        System.out.print(max(a,b,c));
    }
    public static int max (int a , int b , int c)
    {
        return Math.max(a,Math.max(b,c)) ; 
    }
}
