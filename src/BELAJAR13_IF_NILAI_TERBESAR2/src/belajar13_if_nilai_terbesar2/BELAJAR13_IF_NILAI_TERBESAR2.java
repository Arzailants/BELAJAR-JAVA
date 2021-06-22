/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar13_if_nilai_terbesar2;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR13_IF_NILAI_TERBESAR2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputNilai = new Scanner(System.in);
        
    // IF ELSE NILAI TERBESAR
    int x, y;
    
    System.out.print("Masukkan x = ");
    x = InputNilai.nextInt();
    
    System.out.print("Masukkan y = ");
    y = InputNilai.nextInt();
    
        if (x > y) {
            System.out.println("Nilai Terbesar adalah = " +x);
        } else {
            System.out.println("Nilai Terbesar adalah = " +y);
        }
    }
    
}
