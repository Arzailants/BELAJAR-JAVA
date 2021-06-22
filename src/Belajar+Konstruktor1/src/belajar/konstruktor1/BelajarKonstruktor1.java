/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.konstruktor1;
/**
 *
 * @author vaio
 */
public class BelajarKonstruktor1 {
// MEMBUAT ATRIBUT DI KELAS 
    int x;
    String str;
    boolean bol;
    
    // KONSTRUKTOR
    public BelajarKonstruktor1(int z){
        x = z;
        str = "AliceMyLove";
        bol = true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // MEMANGGIL DENGAN MEMBUAT OBJEK
    BelajarKonstruktor1 myObjek = new BelajarKonstruktor1(10);
        System.out.println("Namanya = " +myObjek.str);
        System.out.println("Umurnya = " +myObjek.x);
        System.out.println("Apakah Benar = " +myObjek.bol);
    }
    
}
