/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.methodekelas2;


/**
 *
 * @author vaio
 */
public class BelajarMethodeKelas2 {

    //MEMBUAT CLASS METHOD 1
    public void myMethod(){
        System.out.println("Kecepatan Mobilnya sangat cepat");
    }
    static int myMethods(int speed){
        System.out.println("Kecepatannya = " +speed);
    return speed;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        myMethods(10);
    }
    
}
