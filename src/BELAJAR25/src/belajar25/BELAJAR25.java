/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar25;

/**
 *
 * @author vaio
 */
public class BELAJAR25 {
// MEMBUAT STATIC METHOD
    static void staticMethod(){
        System.out.println("STATIC METHOD");
    }
    
// MEMBUAT PUBLIK METHOD
    public void publicMethod(){
        System.out.println("PUBLIC METHOD");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // MENAMPILKAN STATIC METHOD
    staticMethod();
    
    // MENAMPILKAN PUBLIC METHOD + HARUS MEMBUAT OBJEK DAHULU / INPUT MASUKKAN
    BELAJAR25 objekPublic = new BELAJAR25();
    objekPublic.publicMethod();
    
    }
    
}
