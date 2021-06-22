/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar3;

/**
 *
 * @author vaio
 */
public class BELAJAR3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    // MENGGUNAKAN METHOD MATH MAX
    System.out.println(Math.max(100, 200));
    
    
    // MENGGUNAKAN METHOD MATH MIN
    System.out.println(Math.min(1000, 100));
    
    
    // MENGGUNAKA METHOD SQRT / AKAR KUADRAT
    System.out.println(Math.sqrt(80));
    
    
    // MENGGUNAKAN METHOD ABS / MENGEMBALIKAN NILAI ABSOLUT MENJADI POSITIF +
    System.out.println(Math.abs(-20.00));
    
    
    // MENGGUNAKAN METHOD MATH RANDOM / UNTUK MENCARI NILAI RANDOM
    System.out.println(Math.random());
        
    
    // MENGGUNAKAN METHOD MATH RANDOM / UNTUK MENCARI NILAI RANDOM ANTARA 1 SAMPAI 100
    int random = (int) (Math.random() * 101);
    System.out.println(random);
    }
    
}
