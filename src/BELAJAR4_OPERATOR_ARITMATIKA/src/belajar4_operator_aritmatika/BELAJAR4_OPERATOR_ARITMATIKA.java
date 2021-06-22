/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar4_operator_aritmatika;

import java.io.PrintStream;

/**
 *
 * @author vaio
 */
public class BELAJAR4_OPERATOR_ARITMATIKA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // OPERATOR ARITMATIKA
    int variabel1 = 10;
    int variabel2 = 5;
    
    int hasil;
    
    
    //PENJUMLAHAN
    hasil = variabel1 + variabel2;
        System.out.println(variabel1 +" + "+ variabel2 + " = " + hasil);
        
        
    //PENGURANGAN
    hasil = variabel1 - variabel2;
    System.out.printf("%d - %d = %d \n", variabel1,variabel2,hasil);
    
    
    //PERKALIAN
    hasil = variabel1 * variabel2;
    System.out.printf("%d x %d = %d \n", variabel1,variabel2,hasil);
    
    
    //PEMBAGIAN
    hasil = variabel1 / variabel2;
    System.out.printf("%d / %d = %d \n", variabel1,variabel2,hasil);
    
    float a = 5;
    float b = 4;
    float hasilFloat = a/b;
     System.out.println(a +" / "+ b + " = " + hasilFloat);
    
     
    //MODULUS
    int variabel3 = 9;
    int variabel4 = 8;
    int hasil2;
    
    hasil2 = variabel3 % variabel4;
    System.out.printf("%d %% %d = %d", variabel3,variabel4,hasil2);
    
    }
   
}
