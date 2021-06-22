/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar10_latihan1_aritmatika;

import java.util.Scanner;

/**
 *
 * @author vaio
 */
public class BELAJAR10_LATIHAN1_ARITMATIKA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Jumlah = new Scanner(System.in);
        
    System.out.println("MENGHITUNG LUAS");
    System.out.print("panjang = ");
    int panjang = Jumlah.nextInt();
    
    System.out.print("lebar = ");
    int lebar = Jumlah.nextInt();
    
    int luas = panjang * lebar;
    System.out.println("luas = " +luas);
    
    System.out.println("MENGHITUNG VOLUME");
    System.out.print("tinggi = ");
    int tinggi = Jumlah.nextInt();
    
    int volume = luas * tinggi;
    System.out.println("Volume = " +volume);
    
    
    }
    
}
