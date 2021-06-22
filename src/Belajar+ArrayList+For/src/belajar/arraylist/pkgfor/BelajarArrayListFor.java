/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.arraylist.pkgfor;
import java.util.ArrayList;
/**
 *
 * @author vaio
 */
public class BelajarArrayListFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ArrayList<String> myObjek = new ArrayList();
    // MENAMBAH DATA KE ARRAYLIST
    myObjek.add("AliceMyLove");
    myObjek.add("LiaMyLove");
    myObjek.add("RevethVeins");
        for (int i = 0; i < myObjek.size(); i++) {
            System.out.println(myObjek.get(i));
        }
    
    }
    
}
