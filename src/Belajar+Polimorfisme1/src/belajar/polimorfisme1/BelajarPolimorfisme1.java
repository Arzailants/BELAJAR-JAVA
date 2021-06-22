/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.polimorfisme1;

/**
 *
 * @author vaio
 */
class BelajarPolimorfisme1 {
    public void Belajar1(){
        System.out.println("Kelas SI 18 B Mata Pelajaran");
    }
}
    class Matematika extends BelajarPolimorfisme1{
        public void Belajar1(){
            System.out.println("Materi Wajib 1");
        }
    }
    class BhsInggris extends BelajarPolimorfisme1{
        public void Belajar1(){
            System.out.println("Materi Wajib 2");
        }
    }
    class Agama extends BelajarPolimorfisme1 {
        public void Belajar1(){
            System.out.println("Materi Wajib 3");
        }
    }
    /**
     * @param args the command line arguments
     */
class MyMainClass {
    public static void main(String[] args) {
        
    // MEMBUAT OBJEK DARI SETIAP CLASS
    BelajarPolimorfisme1 myBelajar = new BelajarPolimorfisme1();
    Matematika myMatematika = new Matematika();
    BhsInggris myBhsInggris = new BhsInggris();
    Agama myAgama = new Agama();
    
    myBelajar.Belajar1();
    myMatematika.Belajar1();
    myBhsInggris.Belajar1();
    myAgama.Belajar1();
    
    }
}
