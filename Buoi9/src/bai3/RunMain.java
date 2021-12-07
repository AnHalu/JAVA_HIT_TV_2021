package bai3;

import java.util.Scanner ;
import java.util.ArrayList ;
public class RunMain {
    public static ArrayList<News> List = new ArrayList<>() ;
    public static Scanner sc = new Scanner(System.in) ;
    public static void main(String[] args) {

        int x ;
        do {
            System.out.println("1 : Insert news ");
            System.out.println("2 : View list news ");
            System.out.println("3 : Average news ");
            System.out.println("4 : Exit ");
            do {
                System.out.println("Nhap tuy chon !");
                x = sc.nextInt();
                switch (x) {
                    case 1: {
                        Insertnew() ;
                        break;
                    }
                    case 2: {
                        ViewList() ;
                        break;
                    }
                    case 3: {
                        AverageNew() ;
                        break;
                    }
                }
            }while(x<1 || x>4) ;
        }while(x!=4) ;
    }
    public static void Insertnew() {
        News x = new News();
        sc.nextLine() ;
        System.out.print("Input title : ");
        x.setTitle(sc.nextLine()) ;
        System.out.print("Input publishdate : ");
        x.setPublishDate(sc.nextLine());
        System.out.print("Input author  : ");
        x.setAuthor(sc.nextLine());
        System.out.print("Input content : ");
        x.setContent(sc.nextLine());
        x.InputCal();
        List.add(x) ;
    }
    public static void ViewList() {
        for (int i = 0 ; i < List.size();i++) {
            List.get(i).display() ;
        }
    }
    public static void AverageNew() {
        for (int i = 0 ; i < List.size();i++) {
            List.get(i).Calculate();
            List.get(i).display() ;
        }
    }

}
