/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author antsh
 */
//weaponName, ammoNumber.

public class Guns {
    public String weaponName ; 
    public int ammoNumber ; 
    public Guns()
    {
        this.ammoNumber=0;
        this.weaponName=""; 
    }
    public Guns(int am , String wea )
    {
        this.ammoNumber=am;
        this.weaponName=wea; 
    }
    public void load(int x)
    {
        this.ammoNumber += x; 
    }
    public void shoot(int x)
    {
        this.ammoNumber -= x; 
    }
    public void setamm (int n)
    {
        this.ammoNumber = n ; 
    }
    public void setwea (String s)
    {
        this.weaponName = s ; 
    }
    public int getammo()
    {
        return this.ammoNumber ;
    }
    public String getwea()
    {
        return this.weaponName ;
    }

    @Override
    public String toString() {
        return "Guns{" + "weaponName=" + weaponName + ", ammoNumber=" + ammoNumber + '}';
    }
    
}
