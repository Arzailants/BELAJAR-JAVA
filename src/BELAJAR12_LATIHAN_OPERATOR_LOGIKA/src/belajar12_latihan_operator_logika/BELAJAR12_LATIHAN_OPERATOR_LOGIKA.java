/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar12_latihan_operator_logika;

import java.util.Scanner;

/**
 *
 * @author vaio
 */
public class BELAJAR12_LATIHAN_OPERATOR_LOGIKA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Jumlah = new Scanner(System.in);
        
    // 
    int NilaiBenar = 10;
    int Prediksi;
    
    
    
    System.out.print("Masukkan Nilai Prediksi = ");
    Prediksi = Jumlah.nextInt();
    System.out.println("Nilai Prediksi = " +Prediksi);
       
    //OPERATOR LOGIKA
    boolean Hasil = (Prediksi == NilaiBenar);
    System.out.println("Nilai Anda = " + Hasil);
    
    
    //OPERATOR ALJABAR BOOLEAN ( OR / AND)
    System.out.print("Masukkan Nilai antara 1 sampai 9 = ");
    Prediksi = Jumlah.nextInt();
    
    Hasil = (Prediksi >= 1) && (Prediksi <=9);
    System.out.println("Hasil sama dengan = " +Hasil);
    
    }
    
}
