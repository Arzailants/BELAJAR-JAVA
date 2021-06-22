/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.bilanganpembagi;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BelajarBilanganPembagi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // MENCARI PEMBAGI SUATU BILANGAN
    Scanner InputObjek = new Scanner(System.in);
    
        System.out.print("Masukkan Bilangan = ");
        int bil = InputObjek.nextInt();
        
        for (int i = 1; i <= bil; i++) {
            if (bil % i == 0) {
                System.out.println(i);
            }
        }
    }
    
}
