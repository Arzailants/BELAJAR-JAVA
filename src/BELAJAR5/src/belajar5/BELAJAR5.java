/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar5;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BELAJAR5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputAngka = new Scanner(System.in);

    // SWITCH CASE SEDERHANA 1
//    switch (expression) {
//        case x :
//            aksi;
//        break;
//        case y :
//            aksi;
//        break;
//        default:
//            aksi;
//      }

    
    int a = 5;
    switch (a) {
        case 1 :
            System.out.println("Senin");
            break;
        case 2 :
            System.out.println("Selasa");
            break;
        case 3 :
            System.out.println("Rabu");
            break;
        case 4 :
            System.out.println("Kamis");
            break;
        case 5 :
            System.out.println("Jumat");
            break;
        case 7 :
            System.out.println("Minggu");
            break;
        default:
            System.out.println("Sabtu");
    }
    
    }
    
}
