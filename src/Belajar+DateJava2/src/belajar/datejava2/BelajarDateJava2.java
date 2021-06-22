/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.datejava2;
import java.time.LocalTime;
/**
 *
 * @author vaio
 */
public class BelajarDateJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MEMBUAT OBJEK LOCALTIME
        LocalTime myObjek = LocalTime.now();
        System.out.println("Jam Hari ini = " +myObjek);
    }
    
}
