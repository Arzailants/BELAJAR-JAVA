/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.arraylist.collections;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author vaio
 */
public class BelajarArrayListCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ArrayList<String> myObjek = new ArrayList();
    // MEMASUKKAN DATA KE ARRAYLIST
    myObjek.add("LiaMyLove");
    myObjek.add("AliceMyLove");
    myObjek.add("Brillianto");
    
    // OBJEK COLLECTIONS
    Collections.sort(myObjek);
    
    // MELAKUKAN PERULANGAN ARRAYLIST DENGAN FOR EACH
        for (String nama : myObjek) {
            System.out.println(nama);
        }
    }
    
}
