/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;
import java.util.Random ; 

/**
 *
 * @author antsh
 */
public class bai3 {
    public static void main(String [] args)
    {
        Guns DiepBeDe = new Guns(100,"AK") ;
        Guns DoanXinhGai = new Guns(100,"M4A1") ;
        Random Rd = new Random() ;
        
        while(DiepBeDe.ammoNumber != 0 && DoanXinhGai.ammoNumber!=0)
        {
            int x = Rd.nextInt(10) + 1; 
            DiepBeDe.shoot(x);
            DoanXinhGai.shoot(x);
        }
        if(DiepBeDe.ammoNumber<=0) 
        {
            System.out.print("DiepBeDe het dan !") ; 
        }
        if(DoanXinhGai.ammoNumber<=0) 
        {
            System.out.print("DoanXinhGai het dan !") ; 
        }
    }
}
