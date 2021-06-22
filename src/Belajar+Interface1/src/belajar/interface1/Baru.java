/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.interface1;

/**
 *
 * @author vaio
 */

/**
 *
 * @author vaio
 */
interface BelajarInterface1 {
    // MEMBUAT METHOD INTERFACE
    public void myFirstMethod();
    public void mySecondMethod();
}
    // MEMBUAT CLASS UNTUK IMPLEMENTS
    class Baru implements BelajarInterface1{
        // MEMBUAT ISI DARI METHOD SUPERCLASS
        @Override
        public void myFirstMethod(){
            System.out.println("Ini Adalah Methode Pertama");
        }
        @Override
        public void mySecondMethod(){
            System.out.println("Ini Adalah Methode Kedua");
        }
    }