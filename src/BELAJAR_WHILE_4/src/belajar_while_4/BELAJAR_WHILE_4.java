/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar_while_4;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR_WHILE_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputScanner = new Scanner(System.in);

    // WHILE 4    
    int n, jum, pencacah;
    
    System.out.print("Masukkan n = ");
    n = InputScanner.nextInt();
    
    jum = 0;
    pencacah = 1;
        while (pencacah <= n) {           
            jum = jum + pencacah;  
            pencacah++;
        }
        
        System.out.println("Jumlah = " +jum);
    }
    
}
