/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar22_kelas_dalam_kelas;


class OuterClass{
    int x = 10;
    
    class InnerClass{
        int y = 20;
    }
}
/**
 *
 * @author vaio
 */
public class BELAJAR22_KELAS_DALAM_KELAS {

    public static void main(String[] args) {
        
    // KELAS DALAM KELAS
    // MEMBUAT OBJEK DARI KELAS OUTERCLASS DAN INNERCLASS
    OuterClass myOuterClass = new OuterClass();
    OuterClass.InnerClass myInnerClass = myOuterClass.new InnerClass();
    int Hasil = myOuterClass.x + myInnerClass.y;
    System.out.println(myOuterClass.x+ "+" +myInnerClass.y+ " Hasil = " +Hasil);
    }
    
}
