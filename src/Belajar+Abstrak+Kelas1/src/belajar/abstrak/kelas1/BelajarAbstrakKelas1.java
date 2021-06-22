/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.abstrak.kelas1;

/**
 *
 * @author vaio
 */
// CLASS ABSTRAK
abstract class BelajarAbstrakKelas1 {
    // ABSTRAK METHOD (TIDAK MEMILIKI SEBUAH BADAN)
    public abstract void myAbstrakMethod();
    // REGULAR METHOD
    public void myMethod(){
        System.out.println("Andre Rizaldi Brillianto");
    }
}
    class Baru extends BelajarAbstrakKelas1{
        @Override
        public void myAbstrakMethod(){
            System.out.println("Abstrak Method");
        }
    }
    /**
     * @param args the command line arguments
     */
        class MyMainClass{
    public static void main(String[] args) {  
    // MEMBUAT SEBUAH OBJEK UNTUK MEMANGGIL METHOD DARI SUBCLASS YANG TERHUBUNG LANGSUNG DENGAN ABSTRAK CLASS
    Baru myObjek = new Baru();
    // MEMANGGIL METHOD
    myObjek.myAbstrakMethod();
    myObjek.myMethod();
    }
    
}
