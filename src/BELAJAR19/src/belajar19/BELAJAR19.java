/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar19;

/**
 *
 * @author vaio
 */
public class BELAJAR19 {
static void myMethod(int x){
    if (x < 20) {
        System.out.println("Anda kurang umur");
    } else if (x == 20){
        System.out.println("Anda Cukup");
    } else {
        System.out.println("Anda Sangat Berumur");
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //
        myMethod(18);
        myMethod(20);
        myMethod(21);
    }
    
}
