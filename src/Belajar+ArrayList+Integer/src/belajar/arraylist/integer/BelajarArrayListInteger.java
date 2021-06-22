/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.arraylist.integer;
import java.util.ArrayList;
/**
 *
 * @author vaio
 */
public class BelajarArrayListInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ArrayList<Integer> myObjek = new ArrayList<>();
    // MEMASUKKAN DATA KE ARRAYLIST<INTEGER>
    myObjek.add(20);
    myObjek.add(100);
    myObjek.add(10);
        for (Integer i : myObjek) {
            System.out.println(i);
        }
    
    }
    
}
