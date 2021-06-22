/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar19_while_loop;

/**
 *
 * @author vaio
 */
public class BELAJAR19_WHILE_LOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // WHILE LOOP
    int a = 1;
    boolean keadaan = true;
    
        while (keadaan) {            
            System.out.println("Ulangan = "+a);
            a++;
            
        if (a >= 10){
            keadaan = false;
        }
    }
    
}
}