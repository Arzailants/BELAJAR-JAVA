/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pkgclass.didalam.pkgclass;

/**
 *
 * @author vaio
 */
class BelajarClassDidalamClass {
    int x = 10;
    
    class InnerClass{
        int y = 20;
    }
}
    /**
     * @param args the command line arguments
     */
class MyMainClass{
    public static void main(String[] args) {
        // MEMBUAT OBJEK dari Kelas Luar
        BelajarClassDidalamClass myOuter = new BelajarClassDidalamClass();
        // MEMBUAT OBJEK dari Kelas dalam dengan menggunakan perantara kelas luar
        BelajarClassDidalamClass.InnerClass myInner = BelajarClassDidalamClass.new InnerClass();
    }
    
}
