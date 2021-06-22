/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar10;

/**
 *
 * @author vaio
 */
public class BELAJAR10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    // MEMANGGIL ARRAY DENGAN INDEX STRING
    String[] mobil = {"Mobil1","Mobil2","Mobil3","Mobil4"};
        for (int i = 0; i < mobil.length; i++) {
    System.out.println(mobil[i]);   
    
    
            System.out.println("");
    
    // MEMANGGIL ARRAY DENGAN INDEX STRING
    String [] motor = {"Motor1","Motor2","Motor3","Motor4"};
            for (String x : motor) {
                System.out.println(x);
            }
        }
    }
    
}
