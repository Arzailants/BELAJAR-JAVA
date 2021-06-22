/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar8_operator;

/**
 *
 * @author vaio
 */
public class BELAJAR8_OPERATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // OPERATOR ++
    int x,y;
    
    x = 5;
    y = 8 + x++;
    System.out.println("CONTOH 1 = ");
    System.out.println("x = " +x+ " y = " +y);
    
    x = 5;
    y = 8 + ++x;
    System.out.println("CONTOH 2 = ");
    System.out.println("x = " +x+ " y = " +y);
    
    x = 5;
    y = 8 + x--;
    System.out.println("CONTOH 3 = ");
    System.out.println("x = " +x+ " y = " +y);
    
    x = 5;
    y = 8 + --x;
    System.out.println("CONTOH 4 = ");
    System.out.println("x = " +x+ " y = " +y);
    }
    
}
