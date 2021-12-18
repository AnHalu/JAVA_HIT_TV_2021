package Bai1;

import java.util.*;


public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Person> List = new ArrayList<Person>();

    public static void main(String[] args) {
        int n = 0;
        try {
            System.out.println("Nhap n :");
            n = sc.nextInt() ;
        }catch (Exception ex) {
            System.out.println("Loi roi nhap lai di ! :v " + ex.getMessage());
        }

        for (int i=0 ;i<n;i++) {
            Person A = new Person() ;
            boolean check = true;
            try {
                A.Input();
            }catch (Exception exc1) {
                check = false;
                System.out.println("Loi " + exc1.getMessage());
            }

            if(check) {
                List.add(A);
            }
        }

        System.out.println("Sap xep theo ten :");
        Collections.sort(List);

        for (Person A : List) {
            System.out.println(A.toString());
        }

        System.out.println("Sap xep theo id:");
        Collections.sort(List, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId() - o2.getId() ;
            }
        });
        for (Person A : List) {
            System.out.println(A.toString());
        }
    }
}
