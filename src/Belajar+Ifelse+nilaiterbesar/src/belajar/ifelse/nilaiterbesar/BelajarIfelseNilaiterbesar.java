/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.ifelse.nilaiterbesar;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BelajarIfelseNilaiterbesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // IF ELSE NILAI TERBESAR
    Scanner InputObjek = new Scanner(System.in);
    
    System.out.print("Masukkan Nilai x = ");
    int x = InputObjek.nextInt();
    
    System.out.print("Masukkan Nilai y = ");
    int y = InputObjek.nextInt();
    
    System.out.print("Masukkan Nilai z = ");
    int z = InputObjek.nextInt();
    
        if ( x>y && x>z) {
            System.out.println("Nilai Terbesar = " +x);
        } else if ( y>x && y>z) {
            System.out.println("Nilai Terbesar = " +y);
        } else {
            System.out.println("Nilai Terbesar = " +z);
        }
    }
    
}
