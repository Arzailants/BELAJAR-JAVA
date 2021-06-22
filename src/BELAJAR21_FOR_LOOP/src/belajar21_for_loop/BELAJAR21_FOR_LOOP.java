/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar21_for_loop;

/**
 *
 * @author vaio
 */
public class BELAJAR21_FOR_LOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // PERULANGAN FOR LOOP
    // for (nilai awal; kondisi; increment / decrement){
    //      aksi
    // }
    
        System.out.println("PERULANGAN 1");    
    for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        
        System.out.println("PERULANGAN 2");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        System.out.println("PERULANGAN 3");
        int x = 5;
        for (; x < 10;) {
            System.out.println("Alice" +x);
            x++;
        }
    }
    
}
