/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar18;

/**
 *
 * @author vaio
 */
public class BELAJAR18 {
static int myInt(int x){
    return 10 + x;
}
static int myInt(int x, int y){
    return 10 + x + 10 + y;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    // 
        System.out.println("Hasil 1 int = " +myInt(10));
        System.out.println("Hasil 2 int = " +myInt(10, 10));
    }
    
}
