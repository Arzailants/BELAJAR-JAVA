/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.datejava3;
import java.time.LocalDateTime;
/**
 *
 * @author vaio
 */
public class BelajarDateJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MEMBUAT OBJEK DARI PAKET LOCALDATETIME
        LocalDateTime myObjek = LocalDateTime.now();
        System.out.println("Tanggal dan jam Hari ini = " +myObjek);
    }
    
}
