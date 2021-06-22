/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.karakter;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BelajarKarakter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // DERET TURUN KARAKTER
    Scanner InputObjek = new Scanner(System.in);
    
    System.out.print("Masukkan Nama = ");
    String nama = InputObjek.nextLine();
    
    int jumlahKar = nama.length();
    int indeks = 0;
        while (indeks < jumlahKar) {            
            char karakter = nama.charAt(indeks);
            System.out.println(karakter);
            indeks++;
        }
    }
    
}
