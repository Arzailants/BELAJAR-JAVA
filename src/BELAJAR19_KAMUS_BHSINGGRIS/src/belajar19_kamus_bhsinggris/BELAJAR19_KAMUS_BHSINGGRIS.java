/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar19_kamus_bhsinggris;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR19_KAMUS_BHSINGGRIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner  InputScanner = new Scanner(System.in);

    // KAMUS BHS INGGRIS    
    String bhsinggris;
    
    System.out.print("Input Vocabulary = ");
    bhsinggris = InputScanner.nextLine();
    
        //SWITCH
        switch (bhsinggris) {
            case "one":
                System.out.println(bhsinggris+ "  Adalah Satu");
                break;
            case "two":
                System.out.println(bhsinggris+ "  Adalah Dua");
                break;
            case "three":
                System.out.println(bhsinggris+ " Adalah Tiga");
                break;
            default:
                System.out.println("Tidak Tahu");
                break;
        }
        
        
        
        // IF
        if (bhsinggris.equals("one")) {
            System.out.println(bhsinggris+ "  Adalah Satu");
        } else if (bhsinggris.equals("two")) {
            System.out.println(bhsinggris+ "  Adalah Dua");
        } else if (bhsinggris.equals("three")) {
            System.out.println(bhsinggris+ " Adalah Tiga");
        } else {
            System.out.println("Tidak Tahu");
        }
    }
    
}
