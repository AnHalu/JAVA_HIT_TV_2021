/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author antsh
 */
    public class perSon 
{
    public String name ; 
    public int age ; 
    public String gender ; 
    public String hobby ; 
    
    void perSon()
    {
        this.name="" ; 
        this.age=0 ; 
        this.gender=""; 
        this.hobby="";
    }
    
    void perSon(String name , int age , String gender , String hobby)
    {
        this.name=name ; 
        this.age=age ; 
        this.gender=gender; 
        this.hobby=hobby;
    }
    void setname(String name)
    {
        this.name = name ;
    }
    void setage(int age)
    {
        this.age = age ;
    }
    void setngender(String gender)
    {
        this.gender = gender ;
    }
    void sethobby(String hobby)
    {
        this.hobby = hobby ;
    }
    //
    String getname()
    {
        return name ;
    }
    int getage()
    {
        return age ;
    }
    String getgender()
    {
        return gender ; 
    }
    String gethobby()
    {
        return hobby ; 
    }  
    @Override
    public String toString() {
        return "Person [name = " + name + ", age = " + age + ", gender = " + gender + ", hobby=" + hobby + "]";
    }
    
}

 
 