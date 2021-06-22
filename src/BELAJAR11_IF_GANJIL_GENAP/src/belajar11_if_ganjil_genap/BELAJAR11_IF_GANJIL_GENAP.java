/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar11_if_ganjil_genap;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR11_IF_GANJIL_GENAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputScanner = new Scanner(System.in);
        
    // PROGRAM IF ELSE GANJIL GENAP
    int angka;
    
    System.out.print("Masukkan Angka = ");
    angka = InputScanner.nextInt();
    
        if (angka % 2 == 0) {
            System.out.println(angka+ " adalah angka genap");
        } else {
            System.out.println(angka+ " adalah angka ganjil");
        }
    }
    
}
