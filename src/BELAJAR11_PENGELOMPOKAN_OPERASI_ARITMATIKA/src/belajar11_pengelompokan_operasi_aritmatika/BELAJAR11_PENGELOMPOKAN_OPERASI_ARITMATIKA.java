/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar11_pengelompokan_operasi_aritmatika;

import java.util.Scanner;

/**
 *
 * @author vaio
 */
public class BELAJAR11_PENGELOMPOKAN_OPERASI_ARITMATIKA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int hasil;
    System.out.println("PERKALIAN DAN PEMBAGIAN AKAN DILAKUKAN TERLEBIH DAHULU");
    
    hasil = 10 + 5;
    System.out.println(hasil);
    
    hasil = 10 + 5 * 2 / 2;
    System.out.println(hasil);
    
        Scanner Jumlah = new Scanner(System.in);
    System.out.print("nilai x = ");
    int x = Jumlah.nextInt();
    System.out.print("nilai y = ");
    int y = Jumlah.nextInt();
    System.out.print("nilai o = ");
    int o = Jumlah.nextInt();
    int hasilJumlah = x*y*o;
    System.out.print("nilai Jumlah = ");
    System.out.println(hasilJumlah);
    
    
    
    
    }
    
}
