/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.arraylist.collections.integer;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author vaio
 */
public class BelajarArrayListCollectionsInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ArrayList<Integer> myObjek = new ArrayList<>();
    // MEMASUKKAN DATA INTEGER KE ARRAYLIST
    myObjek.add(50);
    myObjek.add(40);
    myObjek.add(30);
    myObjek.add(20);
    myObjek.add(10);
    myObjek.add(0);
    
    // OBJEK COLLECTION SORT
    Collections.sort(myObjek);
    
    // MEMANGGIL MYOBJEK
    System.out.println(myObjek);
    
    //PENGULANGAN ARRAYLIST DENGAN FOR EACH
        for (Integer i : myObjek) {
            System.out.println(i);
        }
    
    }
    
}
