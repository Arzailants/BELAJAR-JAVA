/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pkgclass.abstrak;

/**
 *
 * @author vaio
 */
public class BelajarClassAbstrak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // MEMBUAT OBJEK UNTUK MENAMPILKAN DATA DARI CLASS PERSON
    Student myObjek = new Student();
    
        System.out.println("Nama = " + myObjek.fname);
        System.out.println("Umur = " + myObjek.umur);
        System.out.println("Hasil = " +myObjek.hasilBelajar);
        myObjek.belajar();
    }
    
}
