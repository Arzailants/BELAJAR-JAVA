/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar15_nested_if;

/**
 *
 * @author vaio
 */
public class BELAJAR15_NESTED_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // NESTED IF / IF DI DALAM IF
    int a = 10;
    int b = 15;
    
    System.out.println("Ini adalah AWAL PROGRAM");
    
        if (a == 10) {
            if (b == 15) {
            
                System.out.println("Ini adalah a = 10 dan b = 15 ");
            
            } else {
                
                System.out.println("Ini adalah a = 10 dan b = bukan 15");
            
            }
                
            } else {
                
                System.out.println("Ini adalah jika a = salah dan b = bisa salah dan bisa benar");
                
        }
    
        System.out.println("Ini adalah AKHIR PROGRAM");
    }
    
}
