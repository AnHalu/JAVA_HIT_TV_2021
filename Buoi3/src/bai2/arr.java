/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;
/**
 *
 * @author antsh
 */
public class arr {
    public int n ; 
    public int [] array ; 
    public Scanner sc = new Scanner(System.in) ; 
    public arr()
    {
        this.n=0;
        this.array=null ; 
    }
    public arr(int n , int []arr)
    {
        this.n = n ;
        this.array = arr ; 
    }
    public void inputData()
    {
       n = sc.nextInt(); 
       array = new int[n];
       for(int i=0;i<n;i++)
       {
           array[i] = sc.nextInt();
       }
    }
    public void Show()
    {
        System.out.print("Mang : ") ; 
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public int Sum()
    {
        int total = 0 ; 
        for(int i=0;i<n;i++)
        {
            total += array[i] ; 
        }
        //System.out.print(total);
        //System.out.println();
        return total;
    }
    public void Filter(boolean flag)
    {
        if(flag)
        {
            System.out.print("mang : ");
            for(int i: array)
            {
                if(i%2==0) System.out.print(i+' ');
            }
            System.out.println();
        }
        else 
        {
            System.out.print("mang : ");
            for(int i: array)
            {
                if(i%2!=0) System.out.print(i+' ');
            }
            System.out.println();
        }
    }
    public void setn(int n)
    {
        this.n = n ; 
    }
    public void setarray(int [] a)
    {
        this.array = a;
    }
    public int getn()
    {
        return n ;
    }
     public int[] getArray()
    {
        return array ;
    }
}
