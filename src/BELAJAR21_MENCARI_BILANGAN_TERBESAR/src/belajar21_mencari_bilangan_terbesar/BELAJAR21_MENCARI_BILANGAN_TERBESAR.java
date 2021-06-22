/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar21_mencari_bilangan_terbesar;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR21_MENCARI_BILANGAN_TERBESAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputAngka = new Scanner(System.in);

    // MENCARI NILAI TERBESAR
    int x,y,z,terbesar;
    
    System.out.print("Masukkan Nilai x = ");
    x = InputAngka.nextInt();
    System.out.print("Masukkan NIlai y = ");
    y = InputAngka.nextInt();
    System.out.print("Masukkan Nilai z = ");
    z = InputAngka.nextInt();
    
    terbesar = x;
    
        if (terbesar < y) {
            terbesar = y;
        } if (terbesar < z) {
            terbesar = z;
        }
        
        System.out.println("Nilai Terbesar = " +terbesar);
    }
    
}
