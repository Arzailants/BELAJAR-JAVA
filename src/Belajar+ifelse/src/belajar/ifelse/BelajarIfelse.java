/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.ifelse;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BelajarIfelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // IF ELSE BULAN
    int angkabulan;
    String namabulan;
    
    Scanner InputObjek = new Scanner(System.in);
    
    System.out.print("Masukkan Angka Bulan = ");
    angkabulan = InputObjek.nextInt();
    
        if (angkabulan == 2) {
           namabulan = "Jumlah Hari antara 28 dan 29";
        } else if (angkabulan == 1 || angkabulan == 3 || angkabulan == 5 || angkabulan == 7 || angkabulan == 8 || angkabulan 10 || angkabulan == 12) {
           namabulan = "Jumlah Hari adalah 31"; 
        } else if (angkabulan ==  4 || angkabulan == 9 || angkabulan == 11 ) {
           namabulan = "Jumlah Hari adalah 30";
        } else {
                System.out.println("angka bulan salah");
                }
    }
    
}
