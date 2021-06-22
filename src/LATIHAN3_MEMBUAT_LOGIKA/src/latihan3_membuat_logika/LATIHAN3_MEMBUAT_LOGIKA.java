/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3_membuat_logika;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class LATIHAN3_MEMBUAT_LOGIKA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputNilai = new Scanner(System.in);

    // MEMBUAT < 0 = NEGATIF, = 0 = NOL, > 0 = POSITIF
    int nilai;
    
    System.out.print("Masukkan Nilai = ");
    nilai = InputNilai.nextInt();
    
        if (nilai < 0) {
            System.out.println("Nilai Negatif");
        } else if (nilai > 0) {
            System.out.println("Nilai Positif");
        } else {
            System.out.println(" Nilai NOL ");
        }
    }
    
}
