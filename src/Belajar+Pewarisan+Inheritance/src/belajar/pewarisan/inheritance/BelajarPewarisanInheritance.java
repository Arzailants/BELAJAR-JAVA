/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pewarisan.inheritance;

/**
 *
 * @author vaio
 */
public class BelajarPewarisanInheritance {
    public String nama = "AliceMyLove";
    public void myMethod(){
        System.out.println("Metode Ini adalah Metode yang sudah terjamin");
    }
}
    
    /**
     * @param args the command line arguments
     */
   class Belajar extends BelajarPewarisanInheritance {
       public int umur = 30;
    public static void main(String[] args) {
    // MEMBUAT SEBUAH OBJEK dengan nama myObjek
    Belajar myObjek = new Belajar();
    
    // MEMANGGIL METHOD dengan objek myObjek
    myObjek.myMethod();
    
    // MEMANGGIL ATTRIBUT class 1 dan class 2
        System.out.println("Namanya = " +myObjek.nama+ "Umurnya = "+myObjek.umur);
    }
}
