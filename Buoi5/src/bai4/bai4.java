/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author antsh
 */
public class bai4 {
    public static void main(String [] args ) {
        sum<Integer> SI = new sum(10,20);
        sum<Long> SL = new sum(10L,20L) ; 
        sum<Float> SF = new sum(1.5f , 2.5f) ; 
        sum<Double> SD = new sum(10.23,32.15) ; 
        
        System.out.println("Sum integer : "+ ( SI.getSoa() + SI.getSob() ));
        System.out.println("Sum long : " +(SL.getSoa() + SI.getSob()));
        System.out.println("Sum flaot : " +(SF.getSoa() + SF.getSob()));
        System.out.println("Sum double : " +(SD.getSoa() + SD.getSob()));
    }
}
