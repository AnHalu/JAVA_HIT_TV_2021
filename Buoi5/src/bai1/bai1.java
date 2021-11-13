/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;
import java.util.ArrayList ;
import java.util.Scanner ; 
/**
 *
 * @author antsh
 */
public class bai1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int n ; 
        System.out.print("Nhap n : "); 
        Scanner sc = new Scanner(System.in) ; 
        n = sc.nextInt() ; 
        
        ArrayList<dieuhoa> dh = new ArrayList<>(n);
        
        for(int i = 0 ; i<n ;i++){
            dieuhoa a = new dieuhoa() ; 
            a.Nhap();
            dh.add(a) ; 
        }
        int minn = dh.get(0).Giaban;
        System.out.println("Output!");
        for(int i=0;i<n;i++){
            if(dh.get(i).Giaban<minn) 
            {
                minn = dh.get(i).Giaban ; 
            }
            if(dh.get(i).Tenhang=="Electrolux")
            {
                dh.get(i).Xuat();
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(dh.get(i).Giaban == minn) 
            {
                dh.get(i).Xuat(); 
            }
        }
    }
    
}
