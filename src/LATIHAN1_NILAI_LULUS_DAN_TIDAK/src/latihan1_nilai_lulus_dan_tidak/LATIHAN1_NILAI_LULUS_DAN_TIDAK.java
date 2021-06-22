/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1_nilai_lulus_dan_tidak;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class LATIHAN1_NILAI_LULUS_DAN_TIDAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputNilai = new Scanner(System.in);

    // KETERANGAN LULUS = 70 DAN TIDAK LULUS = DIBAWAH 70
    int nilai;
    
    System.out.print("Masukkan Nilai = ");
    nilai = InputNilai.nextInt();
    
        if (nilai >= 0 && nilai < 70) {
            System.out.println("Anda Tidak Lulus");
        } else if (nilai >= 70 && nilai <= 100) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Nilai Tidak Valid");
        }
    }
    
}
