/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar_for_3;

/**
 *
 * @author vaio
 */
public class BELAJAR_FOR_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    // MENCARI BILANGAN YANG TIDAK HABIS DIBAGI 5
    int bil;
    
        for (bil = 1; bil <= 50; bil += 2) {
            if (bil % 2 != 0) {
                System.out.print( bil+ " ");
            }
        }
    }
    
}
