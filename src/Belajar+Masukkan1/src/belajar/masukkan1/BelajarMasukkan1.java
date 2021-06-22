/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.masukkan1;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BelajarMasukkan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // MEMBUAT OBJEK DARI KELAS SCANNER
    Scanner myObjek = new Scanner(System.in);
    
    System.out.println("Masukkan Nama, Umur = ");
    // MEMBUAT INPUT UNTUK NAMA DAN UMUR
    String nama = myObjek.nextLine();
    int umur = myObjek.nextInt();
    
        System.out.println("Namanya = " +nama);
        System.out.println("Umurnya = " +umur);
    }
    
}
