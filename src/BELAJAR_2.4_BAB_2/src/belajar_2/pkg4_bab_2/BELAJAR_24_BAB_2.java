/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar_2.pkg4_bab_2;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR_24_BAB_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputAngka = new Scanner(System.in);

    // MENCARI BILANGAN TERBESAR
    int x,y,terbesar;
    
    System.out.print("Masukkan Nilai x = ");
    x = InputAngka.nextInt();
    System.out.print("Masukkan Nilai y = ");
    y = InputAngka.nextInt();
    
    
        if (x < y) {
            terbesar = y;
        } else {
            terbesar = x;
        }
        
        System.out.println("Nilai Terbesar = " +terbesar);
    }
    
}
