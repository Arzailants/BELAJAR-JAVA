/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar12_if_nilai_terbesar;
import java.util.*;
/**
 *
 * @author vaio
 */
public class BELAJAR12_IF_NILAI_TERBESAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputNilai = new Scanner(System.in);
        
    // IF NILAI TERBESAR
    int x, y, terbesar;
    
    System.out.print("Masukkan Nilai x = ");
    x = InputNilai.nextInt();
    
    System.out.print("Masukkan Nilai y = ");
    y = InputNilai.nextInt();
    
    terbesar = x;
    
        if (terbesar < y) terbesar = y; {
            System.out.println("Nilai Terbesar adalah = " +terbesar);
        }
    }
    
}
