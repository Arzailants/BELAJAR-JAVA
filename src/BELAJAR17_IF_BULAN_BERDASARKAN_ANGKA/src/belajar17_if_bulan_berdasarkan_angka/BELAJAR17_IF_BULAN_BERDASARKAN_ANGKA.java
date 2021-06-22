/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar17_if_bulan_berdasarkan_angka;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR17_IF_BULAN_BERDASARKAN_ANGKA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputAngka = new Scanner(System.in);

    // IF TANGGAL BERDASARKAN ANGKA
    int angkabulan;
    String namabulan;
    
    System.out.print("Masukkan Angka Tanggal = ");
    angkabulan = InputAngka.nextInt();
    
        switch (angkabulan) {
            case 1:
                namabulan = "January";
                break;
            case 2:
                namabulan = "February";
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
            case 6:
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
                namabulan = "December";
                break;
            default:
                namabulan = "Bukan Sebuah Angka Tanggal";
                break;
        }
    
        System.out.println("Bulan " +namabulan+ " Adalah bulan ke " +angkabulan);
        
        
        
        // IF 
        if (angkabulan == 1) {
            namabulan = "January";
        } else if (angkabulan == 2) {
            namabulan = "February";
        } else if (angkabulan == 3) {
            namabulan = "Maret";
        } else if (angkabulan == 4) {
            namabulan = "April";
        } else if (angkabulan == 5) {
            namabulan = "Mei";
        } else if (angkabulan == 6) {
            namabulan = "Juni";
        } else if (angkabulan == 7) {
            namabulan = "Juli";
        } else if (angkabulan == 8) {
            namabulan = "Agustus";
        } else if (angkabulan == 9) {
            namabulan = "September";
        } else if (angkabulan == 10) {
            namabulan = "Oktober";
        } else if (angkabulan == 11) {
            namabulan = "November";
        } else if (angkabulan == 12) {
            namabulan = "December";
        } else {
            namabulan = "Bukan Sebuah Angka Tanggal";
        }
    
        System.out.println("Bulan " +namabulan+ " Adalah bulan ke " +angkabulan);
    
    }
    
}
