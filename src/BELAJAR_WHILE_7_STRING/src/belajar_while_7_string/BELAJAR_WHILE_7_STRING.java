/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar_while_7_string;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR_WHILE_7_STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputNama = new Scanner(System.in);
    
    // MERUBAH STRING MENJADI CHAR
    String Nama;
    int indeks, jumlahKarakter;
    char karakter;
    
    System.out.print("Masukkan Nama = ");
    Nama = InputNama.nextLine();
    
    jumlahKarakter = Nama.length();
    indeks = 0;
    
        while (indeks < jumlahKarakter) {            
            karakter = Nama.charAt(indeks);
            System.out.print(karakter);
            indeks++;
        }
        
    }
    
}
