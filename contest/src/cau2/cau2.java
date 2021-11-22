/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

import java.util.ArrayList ;
import java.util.Scanner ; 
import java.util.Collection;
import java.util.Collections;
/**
 *
 * @author antsh
 */
public class cau2 {
    
    public static Scanner sc = new Scanner(System.in) ;
    public static ArrayList<Book> bk = new ArrayList<>() ;
    public static void main(String [] args) {
        int x;
        //Scanner sc = new Scanner(System.in) ;
        do 
        {
            System.out.println("============================MENU=====================");
            System.out.println("Book management program!!");
            System.out.println("1 : Add book ");
            System.out.println("2 : Edit book by id");
            System.out.println("3 : Delete book by id");
            System.out.println("4 : Sort books by name (ascending)");
            System.out.println("5 : Sort books by price (descending)");
            System.out.println("6 : Show all books");
            System.out.println("7 : Exit !");
            System.out.print("Nhap x : "); 
            x = sc.nextInt() ;
            switch (x) { 
                    case 1 : 
                    {
                        addbook() ; 
                        break;
                    }
                   
                    
            }
        }
        while(x!=7) ;
        
    }
    
    public static void addbook() {
        Book A = new Book() ;
        A.input();
       // A.output();
       bk.add(A) ;
       
    }
    public static void editbook() {
        System.out.print("Nhap id can edit : ");
        int id ;
        id = sc.nextInt();
        
    }
}

/*
Add book
+) Edit book by id
+) Delete book by id
+) Sort books by name (ascending)
+) Sort books by price (descending)
+) Show all books
		+) Exit.

*/