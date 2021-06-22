/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar20_kamus_bhsinggris_2;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR20_KAMUS_BHSINGGRIS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputScanner = new Scanner(System.in);

    // KAMUS BAHASA INGGRIS 2
    String kamus;
    
    System.out.print("Input Vocabulary = ");
    kamus = InputScanner.nextLine();
    
    // MERUBAH HURUF KAPITAL MENJADI HURUF KECIL
    kamus = kamus.toLowerCase();
    
        switch (kamus) {
            case "one" :
                System.out.println("Satu");
                break;
            case "two" :
                System.out.println("Dua");
                break;
            case "three" :
                System.out.println("Three");
                break;
            case "four" :
                System.out.println("Four");
                break;
            default :
                System.out.println("Ini bukan bahasa Inggris");
        }
        
        
        // IF KAMUS
        if (kamus.equals("one")) {
            System.out.println("Satu");
        } else if (kamus.equals("two")) {
            System.out.println("Dua");
        } else if (kamus.equals("three")) {
            System.out.println("Tiga");
        } else if (kamus.equals("Four")) {
            System.out.println("Empat");
        } else {
            System.out.println("Ini bukan bahasa Inggris");
        }
    }
    
}
