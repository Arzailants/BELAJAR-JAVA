/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.bilanganprima;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BelajarBilanganPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // BILANGAN PRIMA
    Scanner InputObjek = new Scanner(System.in);
    
        System.out.print("Masukkan Bilangan = ");
        int bil = InputObjek.nextInt();
        
        if (bil < 2) {
            System.out.println("Bilangan harus < 1");
            return;
        }
        
        boolean prima = true;
        
        for (int i = 1; i <= bil / 2; i++) {
            if (bil % i == 0) {
                prima = false;
                break;
               }
                if (prima) 
                    System.out.println("Bilangan Prima");
                 else 
                    System.out.println("Bukan Bilangan Prima");
                
            }
        }
        
    }
    

