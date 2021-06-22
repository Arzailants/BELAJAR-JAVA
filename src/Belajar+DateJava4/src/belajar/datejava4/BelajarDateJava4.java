/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.datejava4;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author vaio
 */
public class BelajarDateJava4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MEMBUAT OBJEK CLASS LOCAL DATE DAN RUBAH FORMAT
        LocalDateTime myLocalObjek = LocalDateTime.now();
        System.out.println("Sebelum di rubah = " +myLocalObjek);
        
        // MERUBAH LOCAL DATE TIME
        DateTimeFormatter myFormatObjek = DateTimeFormatter.ofPattern("E,dd-MMMM-yyyy HH:mm:ss:ns");
        
        // MEMASUKKAN DATE TIME FORMATER KE VARIABEL
        String DateFormat = myLocalObjek.format(myFormatObjek);
        System.out.println("Sesudah di rubah = " +DateFormat);
    }
    
}
