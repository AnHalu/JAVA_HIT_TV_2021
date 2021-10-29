/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;



public class bai1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        perSon a = new perSon() ;
        a.perSon("Hoang Minh ", 19, "nam", "ngủ");
        System.out.println(a.toString());
        perSon b = new perSon();
        b.setname("Ha phong");
        b.setage(20);
        b.setngender("nam");
        b.sethobby("game :v");
        System.out.print(b.toString());
    }
    
}
