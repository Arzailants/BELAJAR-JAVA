/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.fungsirekursif1;

/**
 *
 * @author vaio
 */
public class BelajarFungsiRekursif1 {

    public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
     return 0;
    }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int result = sum(5);
    
        System.out.println(result);
        
    }
    
}
