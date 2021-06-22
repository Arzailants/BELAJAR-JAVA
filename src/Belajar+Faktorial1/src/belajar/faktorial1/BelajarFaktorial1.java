/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.faktorial1;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BelajarFaktorial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // BELAJAR FAKTORIAL
    Scanner InputObjek = new Scanner(System.in);
    
    int bil;
    
        System.out.print("Masukkan Nilai n = ");
        int nilai = InputObjek.nextInt();
        
        long hasil = 1;
        
        for (bil = nilai; bil >= 1; bil--) {
            hasil = hasil * bil;
            
            System.out.println(nilai + "! = " +hasil);
        }
    }
    
}
