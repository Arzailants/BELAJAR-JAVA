/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.bungabank;

/**
 *
 * @author vaio
 */
public class BelajarBungaBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // BELAJAR BUNGA BANK
    int pokok = 2000000;
    
        for (int tahun = 1; tahun < 10; tahun++) {
            int bunga = pokok * 10 / 100;
            System.out.println(
                    String.format("%2d %10d %10d", tahun, pokok, bunga));
            pokok = pokok + bunga;
        }
    }
    
}
