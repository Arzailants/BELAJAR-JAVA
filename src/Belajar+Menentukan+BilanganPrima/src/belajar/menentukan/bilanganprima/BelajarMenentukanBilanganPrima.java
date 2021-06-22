/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.menentukan.bilanganprima;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BelajarMenentukanBilanganPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputObjek = new Scanner(System.in);
    // MENENTUKAN TERMASUK BILANGAN PRIMA ATAU BUKAN
    System.out.print("Masukkan Bilangan = ");
    int bilangan = InputObjek.nextInt();
    
    int jum = 0;
    
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                jum++;
                
                // PERIKSA ISI JUM
                if (jum == 2) {
                    System.out.println("Bilangan Prima");
                } else {
                    System.out.println("Bukan Bilangan Prima");
                }
            }
        }
    }
    
}
