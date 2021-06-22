/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar5_format_string;

/**
 *
 * @author vaio
 */
public class BELAJAR5_FORMAT_STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //  CONTOH ARRAY BERDIMENSI DUA
    //  UNTUK MENYIMPAN STRING
    
    int nilai = 12345;
    double nilai2 = 3.14;
    String hub = "Alice Synthesis Thirty";
    
    System.out.println(
            String.format("|%d |%f |%s|",
                    nilai,nilai2,hub));
    
    System.out.println(
            String.format("| %5d | %7f | %20s |", 
                    nilai,nilai2,hub));
    }
    
}
