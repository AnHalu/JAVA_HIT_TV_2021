/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author antsh
 */
public class bai2 {
    public static void main(String [] args)
    {
        arr  A = new arr() ; 
        arr  B = new arr() ; 
        A.inputData();
        B.inputData();
        float a =(float)(A.Sum()/A.n) ; 
        float b =(float)(B.Sum()/B.n);
        if(a == b) 
        {
            System.out.print("Bye") ; 
        }
        else 
        {
            if(a>b) System.out.print("TBC cua A lon hon .") ; 
            else System.out.print("TBC cua B lon hon .") ; 
        }
    }
}
