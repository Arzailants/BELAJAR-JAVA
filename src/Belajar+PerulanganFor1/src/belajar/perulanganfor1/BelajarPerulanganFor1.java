/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.perulanganfor1;

/**
 *
 * @author vaio
 */
public class BelajarPerulanganFor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // PERULANGAN YANG TIDAK HABIS DIBAGI 5
        for (int bil = 1; bil <= 25 ; bil += 2) {
            if (bil % 5 != 0) {
                System.out.println(bil+ " ");
            }
        }
    }
    
}
