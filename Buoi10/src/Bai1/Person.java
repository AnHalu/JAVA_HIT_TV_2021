package Bai1;
import java.util.Scanner ;

public class Person implements Comparable<Person> {
    private int id ;
    private String name ;
    private String address ;
    Scanner sc = new Scanner(System.in) ;
    public Person() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void Input(){
        System.out.print("Nhap id : "); id = sc.nextInt() ; sc.nextLine() ;
        System.out.print("Nhap name : "); name = sc.nextLine() ;
        System.out.print("Nhap address : "); address = sc.nextLine() ;

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if(name.compareTo(o.name)==0){
            return address.compareTo(o.address);
        }
        return name.compareTo(o.name) ;
    }
}
