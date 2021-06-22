/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar_while_six;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR_WHILE_SIX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputAngka = new Scanner(System.in);

    // WHILE SEGITIGA
    long nilai;
    nilai = 100000000;
            
        while (nilai >= 1) {            
            System.out.println(nilai+ " ");
            nilai = nilai / 10;
        }
    }
    
}
