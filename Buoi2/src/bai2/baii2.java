/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Arrays;
import java.util.Scanner ; 
/**
 *
 * @author antsh
 */
public class baii2 {
    
    static Scanner sc = new Scanner(System.in); 
    static int n =0 ; 
    static int [] a ; 
    
    public static void main(String [] args)
    {
        int chon ; 
        do {
        System.out.println("1. Tạo và nhập mảng với n só nguyên.");
        System.out.println("2. Hiển thị mảng vừa tạo.");
        System.out.println("3. Thêm một phần tử vào vị trí k bất kỳ.");
        System.out.println("4. Xóa một phần tử tại vị trí k bất kỳ.");
        System.out.println("5. Đảo ngược mảng.");
        System.out.println("6. Hiển thị phần tử a[1] và các số chia hết cho a[1].");
        System.out.println("7. Xuất ra màn hình tổng các số nguyên tố có trong mảng.");
        System.out.println("8. Thoát.");        
        System.out.print("Nhap lua chon : ") ; 
        chon = sc.nextInt(); 
        switch ( chon )
        {
                case 1 :
                    nhap();
                    break;
                case 2:
                    in();
                    break;
                case 3:
                    chen();
                    break;
                case 4:
                    xoa();
                    break;
                case 5:
                    daonghuoc();
                    break;
                case 6:
                    hienthi();
                    break;
                case 7:
                    nguyento();
                    break;
                case 8:
                    System.out.println("Chương trình kết thúc");
                    break;
        }
        } while (chon !=8 ) ; 
    }
    public static void nhap()
    {
        System.out.print("Nhap n : ") ; 
        int n ; 
        n = sc.nextInt() ; 
        a = new int[n] ; 
        for(int i=0;i<n;i++)
        {
            System.out.print("nhap a[" + i + "] : ") ; 
            a[i] = sc.nextInt(); 
            
        }
    }
    public static void in()
    {
        System.out.print("mang a : ") ; 
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void chen(){
        int pos , val ; 
        System.out.print("nhap vi tri : ") ; 
        pos = sc.nextInt() ; 
        System.out.print("nhap gia tri muon chen : ") ; 
        val = sc.nextInt() ; 
        a = Arrays.copyOf(a, n+1) ; 
        for(int i=n;i>=pos ; i--) {
            a[i]=a[i-1];
        }
        a[pos-1] = val ; 
        n++ ;   
        in() ; 
    }
    public static void xoa() {
        int pos ; 
        System.out.print("Vi tri muon xoa :");
        pos = sc.nextInt(); 
        for(int i=pos;i<n-1;i++)
        {
            a[i] = a[i+1];
        }
        a = Arrays.copyOf(a, n-1) ; 
        n-- ; 
        in();
    }
    public static void daonghuoc()
    {
        System.out.print("mang dao nghuoc : ") ; 
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(a[i] + ' ' ) ; 
        }
        System.out.println();
    }
    public static void hienthi() {
        System.out.print("Phan tu a[1] : " + a[1] );
        System.out.print("Cac phan tu chia het cho a[1] : ");
        for(int i=0;i<n;i++)
        {
            if(a[i]%a[1]==0 && i!=1) 
            {
                System.out.print(a[i]+' ' );
            }
        }
    }
    public static void nguyento() {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==1) {
            } 
            else 
            {
                if(a[i]==2) sum+=a[i] ; 
                else 
                {
                    int kt=1;
                    for(int j=2;j*j<a[i];j++)
                    {
                        if(a[i]%j==0)
                        {
                            kt=0;
                            break;
                        }
                            
                    }
                    if(kt==1) sum+=a[i] ; 
                    
                }
            }
            
        }
        System.out.print("Tổng các số nguyên tố: " + sum);
    }
}

