/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar9_masukkan_data_dengan_scanner;

import java.util.Scanner;

public class BELAJAR9_MASUKKAN_DATA_DENGAN_SCANNER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputAngka = new Scanner(System.in);
    //Pemasukkan data dari keyboard bisa dilakukan dengan menggunakan objek berkelas Scanner
    
    //CONTOH LUAS PERSEGI PANJANG
    int panjang, lebar, luas;
    
    System.out.print("Masukkan Panjang = ");
    panjang = InputAngka.nextInt();
    
    System.out.print("Masukkan Lebar = ");
    lebar = InputAngka.nextInt();
    
    luas = panjang * lebar;
    System.out.println("Luas = " +luas);

    }
    
}
