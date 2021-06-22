/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar15_if_char_kapital;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR15_IF_CHAR_KAPITAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputKarakter = new Scanner(System.in);

    // IF ELSE CHAR HURUF KAPITAL
    char karakter;
    
    System.out.print("Masukkan Huruf = ");
    karakter = InputKarakter.nextLine().charAt(0);
    
        if (karakter >= 'A' && karakter <= 'Z') {
            System.out.println(karakter+ " Ini adalah huruf Kapital");
        } else {
            System.out.println(karakter+ " Ini adalah bukan huruf Kapital");
        }
    
    }
    
}
