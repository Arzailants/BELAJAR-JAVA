/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4_membuat_logika2;
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;
/**
 *
 * @author vaio
 */
public class LATIHAN4_MEMBUAT_LOGIKA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputAngka = new Scanner(System.in);

    // MEMBUAT MENAMPILKAN DATA
    /*
    1 = TVRI    4 = ANTV
    2 = RCTI    5 = INDOSIAR
    3 = SCTV    6 = METRO
    */
    
    int angkatv;
    
    System.out.print("Masukkan Angka TV = ");
    angkatv = InputAngka.nextInt();
    
        if (angkatv == 1) {
            System.out.println("TVRI");
        } else if (angkatv == 2) {
            System.out.println("RCTI");
        } else if (angkatv == 3) {
            System.out.println("SCTV");
        } else if (angkatv == 4) {
            System.out.println("ANTV");
        } else if (angkatv == 5) {
            System.out.println("INDOSIAR");
        } else if (angkatv == 6) {
            System.out.println("METRO");
        } else {
            System.out.println("Bukan TV");
        }
    }
    
}
