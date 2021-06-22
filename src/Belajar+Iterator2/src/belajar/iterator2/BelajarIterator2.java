/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.iterator2;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author vaio
 */
public class BelajarIterator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // MEMBUAT OBJEK ARRAYLIST
    ArrayList<String> myArrayList = new ArrayList<>();
    // MENAMBAHKAN DATA
    myArrayList.add("AliceMyLove");
    myArrayList.add("LiaMyLove");
    myArrayList.add("BlackCoffin");
    // MEMBUAT OBJEK ITERATOR
    Iterator<String> myIter = myArrayList.iterator();
    // MENAMPILKAN SEMUA DATA
        while (myIter.hasNext()) {            
            System.out.println(myIter.next());
        }
    }
    
}
