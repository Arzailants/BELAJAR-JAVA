/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar22;

/**
 *
 * @author vaio
 */
public class BELAJAR22 {
int x = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    // MEMANGGIL DENGAN BANYAK OBJEK DARI SATU KELAS
    BELAJAR22 myObjek1 = new BELAJAR22();
    BELAJAR22 myObjek2 = new BELAJAR22();
        System.out.println(myObjek1.x);
        
    myObjek1.x = 20;
        System.out.println(myObjek1.x);
        
        System.out.println(myObjek2.x);
        
    myObjek2.x = 100;
        System.out.println(myObjek2.x);
    }
    
}
