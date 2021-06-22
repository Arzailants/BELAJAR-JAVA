/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar15;

/**
 *
 * @author vaio
 */
public class BELAJAR15 {
static int myInt(int x, int y){
    return x + y;
}
static double myDouble(double x, double y){
    return x + y;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // METHODE OVERLOADING
    int myIntNilai = myInt(10, 10);
    double myDoubleNilai = myDouble(20.25, 20.25);
    System.out.println("Hasilnya = " +myIntNilai);
    System.out.println("Hasilnya = " +myDoubleNilai);
}
}
