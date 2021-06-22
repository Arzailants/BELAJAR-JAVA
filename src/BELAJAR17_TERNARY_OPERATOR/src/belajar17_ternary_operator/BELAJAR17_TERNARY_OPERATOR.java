/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar17_ternary_operator;

import java.util.Scanner;

/**
 *
 * @author vaio
 */
public class BELAJAR17_TERNARY_OPERATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner UserInput = new Scanner(System.in);
    
    System.out.print("Masukkan Nilai = ");
    int Masukkan = UserInput.nextInt();
    
    int x;
    //OPERATOR TERNARY
    // variable x = (ekspresi) ? statement_true : statement_false;
    // OPERATOR TERNARY BIASANYA UNTUK DISKON JIKA MEMENUHI SYARAT
    
    x = (Masukkan == 10) ? (Masukkan*2) : (Masukkan/2);
    System.out.println("Hasilnya adalah = " + x);
    
//        if (Masukkan == 10) {
//            x = (Masukkan+100);
//        }else {
//            x = (Masukkan+50);
//        }
//        System.out.println("Hasilnya adalah = " +x);
    }
    
}
