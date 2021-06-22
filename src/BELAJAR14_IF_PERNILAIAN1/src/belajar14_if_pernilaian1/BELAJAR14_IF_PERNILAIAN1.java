/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar14_if_pernilaian1;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR14_IF_PERNILAIAN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputNilai = new Scanner(System.in);
    
    // TODO code application logic here
    int nilai;
    
    System.out.print("Masukkan Nilai = ");
    nilai = InputNilai.nextInt();
    
        if (nilai >= 0 && nilai <= 100) {
            System.out.println(nilai+ " Nilai Absah");
        } else {
            System.out.println(nilai+ " Nilai Tidak Absah");
        }
    }
    
}
