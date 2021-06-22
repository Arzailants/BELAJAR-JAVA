/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.method1;

/**
 *
 * @author vaio
 */
public class BelajarMethod1 {
static int myMethod(int x, int y, int z){
    return x + y + z;
}
static double myMethod(double x, double y, double z){
    return x + y + z;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // MEMBUAT METHOD DAN MEMANGGILNYA
    int nilai1 = myMethod(10, 10, 10);
    double nilai2 = myMethod(20.20, 20.20, 20.20);
        System.out.println("Hasil dari Nilai 1 = " +nilai1);
        System.out.println("Hasil dari Nilai 2 = " +nilai2);
    }
    
}
