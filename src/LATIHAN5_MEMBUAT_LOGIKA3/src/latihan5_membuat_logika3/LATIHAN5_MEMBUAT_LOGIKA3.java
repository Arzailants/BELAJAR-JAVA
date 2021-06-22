/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5_membuat_logika3;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class LATIHAN5_MEMBUAT_LOGIKA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputNilai = new Scanner(System.in);

    // MEMBUAT DATA
    System.out.print("Masukkan Ketinggian = ");
    int tinggi = InputNilai.nextInt();
    
        if (tinggi >= 0 && tinggi <=10) {
            System.out.println(tinggi+ "KM Ini adalah Lapisan Troposfer");
        } else if (tinggi >= 10 && tinggi <= 40) {
            System.out.println(tinggi+ "KM Ini adalah Lapisan Stratosfer");
        } else if (tinggi >= 40 && tinggi <= 70) {
            System.out.println(tinggi+ "KM Ini adalah Lapisan Mesosfer");
        } else if (tinggi >= 70 && tinggi <= 400) {
            System.out.println(tinggi+ "KM Ini adalah Lapisan Termosfer");
        } else if (tinggi >= 400) {
            System.out.println(tinggi+ "KM Ini adalah Lapisan Eksosfer");
        }
    }
    
}
