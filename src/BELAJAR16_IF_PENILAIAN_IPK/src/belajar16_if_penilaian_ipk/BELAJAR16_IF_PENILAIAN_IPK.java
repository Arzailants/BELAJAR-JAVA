/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar16_if_penilaian_ipk;
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;
/**
 *
 * @author vaio
 */
public class BELAJAR16_IF_PENILAIAN_IPK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner InputNilai = new Scanner(System.in);

    // TODO code application logic here
    double nim;
    
    System.out.print("Masukkan NIM = ");
    nim = InputNilai.nextDouble();
    
        if (nim >= 2.00 && nim < 2.90) {
            System.out.println(nim+ " = Nilai Memuaskan");
        } else if (nim >= 2.90 && nim < 3.40) {
            System.out.println(nim+ " = Nilai Sangat Memuaskan");
        } else if (nim >=3.40 && nim <= 4.00) {
            System.out.println(nim+ " = Nilai Sempurna");
        } else {
            System.out.println("Nim Tidak Valid");
        }
    }
    
}
