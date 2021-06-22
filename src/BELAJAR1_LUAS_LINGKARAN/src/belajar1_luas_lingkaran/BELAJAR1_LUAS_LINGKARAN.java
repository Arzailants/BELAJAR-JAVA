/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar1_luas_lingkaran;

import java.util.Scanner;

/**
 *
 * @author vaio
 */
public class BELAJAR1_LUAS_LINGKARAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputAngka = new Scanner(System.in);
    
    // LUAS LINGKARAN
    int jari2;
    double luas;
    
    System.out.print("Masukkan jari2 = ");
    jari2 = InputAngka.nextInt();
    
    luas = 3.14 * jari2;
    
    System.out.println("LUAS = " +luas);
    
    }
    
}
