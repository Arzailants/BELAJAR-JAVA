/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar16_switch_case;

import java.util.Scanner;

/**
 *
 * @author vaio
 */
public class BELAJAR16_SWITCH_CASE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Masukkan = new Scanner(System.in);
        
    System.out.print("Masukkan Nama = ");
    String input = Masukkan.next();
    
    switch(input){
        case "alicx":
            System.out.println("Saya adalah alicx, dan saya hadir");
            break;
        case "andre":
            System.out.println("Saya adalah andre, dan saya hadir");
            break;
        case "rizaldi":
            System.out.println("Saya adalah rizaldi, dan saya hadir");
            break;
        default:
            System.out.println("Anda bukan murid");
    }
    }
    
}
