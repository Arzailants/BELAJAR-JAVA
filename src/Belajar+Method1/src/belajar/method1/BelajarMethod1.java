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
    public static int MyMethod(int x, int y){
        return x + y + 10;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // METHOD NILAI KEMBALIAN
        int z = MyMethod(10, 10);
        System.out.println(z);
    }
    
}
