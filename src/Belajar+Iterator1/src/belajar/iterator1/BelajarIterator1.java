/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.iterator1;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author vaio
 */
public class BelajarIterator1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // MEMBUAT OBJEK ARRAYLIST
    ArrayList<String> myObjek = new ArrayList<>();
    // MENAMBAHKAN DATA
    myObjek.add("AliceMyLove");
    myObjek.add("LiaMyLove");
    myObjek.add("BlackCoffin");
    // MEMBUAT OBJEK ITERATOR
    Iterator<String> myIter = myObjek.iterator();
    // GUNAKAN METHOD NEXT DI DALAM ITERATOR
    System.out.println("Jadinya = " +myIter.next());
    }
    
}
