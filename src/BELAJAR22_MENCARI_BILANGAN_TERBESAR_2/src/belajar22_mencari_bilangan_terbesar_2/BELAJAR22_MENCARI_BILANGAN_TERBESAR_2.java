/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar22_mencari_bilangan_terbesar_2;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR22_MENCARI_BILANGAN_TERBESAR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputAngka = new Scanner(System.in);

    // MENCARI BILANGAN TERBESAR 2
    int x,y,z,terbesar;
    
    System.out.print("Masukkan Nilai x = ");
    x = InputAngka.nextInt();
    System.out.print("Masukkan NIlai y = ");
    y = InputAngka.nextInt();
    System.out.print("Masukkan Nilai z = ");
    z = InputAngka.nextInt();
    
    
        if (x > y && x > z) {
            terbesar = x;
        } else if (y > x && y > z) {
            terbesar = y;
        } else {
            terbesar = z;
        }
    
        System.out.println("Nilai Terbesar = " +terbesar);
        
    
    }
    
}
