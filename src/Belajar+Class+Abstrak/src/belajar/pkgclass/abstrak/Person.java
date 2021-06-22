/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pkgclass.abstrak;

/**
 *
 * @author vaio
 */
// ABSTRAK CLASS
abstract class Person {
    public String fname = "AliceMyLove";
    public int umur = 30;
}

// SUBCLASS (INHERIT FROM PERSON)
class Student extends Person{
    public int hasilBelajar = 100;
    public void belajar(){
        System.out.println("Belajar Bersama");
    }
}