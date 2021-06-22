/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar28;

/**
 *
 * @author vaio
 */

class OuterClass{
    int x = 10;

    class InnerClass{
        int y = 20;
    }
}

public class BELAJAR28 {

    public static void main(String[] args) {
        
    // KELAS DALAM KELAS
    // KITA MEMBUAT OBJEK DARI OUTERCLASS DAN INNERCLASS
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    int Hasil = myOuter.x + myInner.y;
    System.out.println("Hasil = " +myOuter.x+ "+" +myInner.y+ "=" +Hasil);
    }
    
}
