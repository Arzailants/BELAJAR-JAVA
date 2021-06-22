/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar18_jumlah_bulan;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR18_JUMLAH_BULAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputBulan = new Scanner(System.in);

    // MENENTUKAN JUMLAH HARI PADA BULAN
    int kodebulan;
    
    System.out.print("Masukkan Kode Bulan = ");
    kodebulan = InputBulan.nextInt();
    
    
    // SWITCH
    switch (kodebulan) {
            case 2:
                System.out.println("Jumlah Hari 28 dan 29");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Jumlah Hari 31 Hari");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Jumlah Hari pada 30 Hari");
                break;
            default:
                System.out.println("Salah Kode bulan");
                break;
        }
        
        
        
        
        // IF
        if (kodebulan == 2) {
            System.out.println("Jumlah Hari 28 dan 29");
        } else if (kodebulan == 1 || kodebulan == 3 || kodebulan == 5 || kodebulan == 7 || kodebulan == 8 || kodebulan == 10 || kodebulan == 12) {
            System.out.println("Jumlah Hari 31 Hari");
        } else if (kodebulan == 4 || kodebulan == 6 || kodebulan == 9 || kodebulan == 11) {
            System.out.println("Jumlah Hari pada 30 Hari");
        } else {
            System.out.println("Salah Kode bulan");
        }
    }
    
}
