/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar17;

/**
 *
 * @author vaio
 */
public class BELAJAR17 {
static int myMethod(int x, int y){
    return x + y;
}
static double myMethod(double x, double y){
    return x + y;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // 
    int myInt = myMethod(10, 10);
    double myDouble = myMethod(20.10, 20.40);
        System.out.println("Nilai Int = " +myInt);
        System.out.println("Nilai Double = " +myDouble);
    }
    
}
