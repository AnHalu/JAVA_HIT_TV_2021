/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author antsh
 * boolean isPrime(int n);
boolean isPrime(long n);
boolean isPrime(float n);
boolean isPrime(double n);

 */
public class isPrime {
    public boolean isPrime(int n){
        if(n<2) return false ;
        for(int i = 2 ;i*i<n;i++){
            if(n%i==0) return false ;
        }
        return true ;
    }
    public boolean isPrime(long n){
        if(n<2) return false ;
        for(int i = 2 ;i*i<n;i++){
            if(n%i==0) return false ;
        }
        return true ;
    } 
    public boolean isPrime(float n){
        return false ;
    }
    public boolean isPrime(double n){
        return false ;
    }
    
}
