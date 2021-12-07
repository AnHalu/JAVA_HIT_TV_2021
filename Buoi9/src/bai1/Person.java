package bai1;

public abstract class Person {
    private String name ;
    private String adress ;

    public Person() {
    }

    public Person(String name,String adress) {
        this.name = name;
        this.adress = adress ;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public String getName() {
        return name;
    }
    public abstract void display() ;

}
