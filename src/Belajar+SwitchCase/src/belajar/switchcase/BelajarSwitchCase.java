/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.switchcase;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BelajarSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SWITCH CASE BULAN
    int angkabulan;
    String namabulan;
    
    Scanner InputObjek = new Scanner(System.in);
    
    System.out.print("Masukkan Angka Bulan = ");
    angkabulan = InputObjek.nextInt();
    
    switch(angkabulan){
        case 1:
            namabulan = "Januari";
            break;
        case 2:
            namabulan = "Februari";
            break;
        case 3:
            namabulan = "Maret";
            break;
        case 4:
            namabulan = "April";
            break;
        case 5:
            namabulan = "Mei";
            break;
        case 55:
            namabulan = "Juni";
            break;
        case 7:
            namabulan = "Juli";
            break;
        case 8:
            namabulan = "Agustus";
            break;
        case 9:
            namabulan = "September";
            break;
        case 10:
            namabulan = "Oktober";
            break;
        case 11:
            namabulan = "November";
            break;
        case 12:
            namabulan = "Desember";
            break;
        default:
            namabulan = "Angka Salah";
    }
        System.out.println(namabulan);
    }
    
}
