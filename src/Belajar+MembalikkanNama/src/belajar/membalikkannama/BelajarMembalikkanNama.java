/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.membalikkannama;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BelajarMembalikkanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    // MEMBUAT NAMA MENJADI TERBALIK
    Scanner InputObjek = new Scanner(System.in);
    
    System.out.print("Masukkan Nama = ");
    String nama = InputObjek.nextLine();
    
    int jumlahKar = nama.length();
    int indeks = jumlahKar - 1;
    
        while (indeks >= 0) {            
            char karakter = nama.charAt(indeks);
            System.out.print(karakter);
            indeks--;
        }
    
    
    }
    
}
