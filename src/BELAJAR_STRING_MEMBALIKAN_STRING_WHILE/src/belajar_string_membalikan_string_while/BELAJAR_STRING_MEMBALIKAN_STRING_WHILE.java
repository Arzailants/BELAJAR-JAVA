/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar_string_membalikan_string_while;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR_STRING_MEMBALIKAN_STRING_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputNama = new Scanner(System.in);

    // BELAJAR MEMBALIKKAN STRING DENGAN WHILE
    String Nama;
    int indeks, jumlahKar;
    char karakter;
    
    System.out.print("Masukkan Nama = ");
    Nama = InputNama.nextLine();
    
    jumlahKar = Nama.length();
    indeks = jumlahKar - 1;
    
        while (indeks >= 0) {            
            karakter = Nama.charAt(indeks);
            System.out.println(karakter);
            indeks--;
        }
    }
    
}
