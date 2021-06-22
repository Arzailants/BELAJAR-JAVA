/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar_while_5;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR_WHILE_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputAngka = new Scanner(System.in);

    // WHILE
    int n, pencacah, nilai;
    
    System.out.print("Masukkan Nilai = ");
    n = InputAngka.nextInt();
    
    pencacah = 1;
    nilai = 1;
    
        while (nilai <= n) {            
            System.out.print(nilai+ " ");
            nilai = nilai + pencacah;
            pencacah++;
        }
        System.out.println();
    
    
    }
    
}
