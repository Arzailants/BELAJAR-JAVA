/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.ifelse.kamus;
import java.util.Scanner;
/**
 *
 * @author vaio
 */
public class BelajarIfelseKamus {
    public static void myMethod(String nama, int umur){
        System.out.println("Artinya = " +nama+ " dan Umurnya = " +umur);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // IF ELSE KAMUS
        
        Scanner InputObjek = new Scanner(System.in);
        
        System.out.print("Masukkan Kata = ");
        String kata = InputObjek.nextLine();
        
        if ("one".equals(kata)){
            myMethod("Satu",12);
        } else if ("two".equals(kata)){
            myMethod("Dua",13);
        } else if ("three".equals(kata)){
            myMethod("Tiga",14);
        } else if ("four".equals(kata)){
            myMethod("Empat",15);
        } else if ("five".equals(kata)){
            myMethod("Lima",17);
        } else if ("six".equals(kata)){
            myMethod("Enam",18);
        } else if ("seven".equals(kata)){
            myMethod("Tujuh",19);
        } else if ("eight".equals(kata)){
            myMethod("Delapan",20);
        } else if ("nine".equals(kata)){
            myMethod("Sembilan",21);
        } else if ("ten".equals(kata)){
            myMethod("Sepuluh",22);
        } else{
            myMethod("Tidak Tahu",00);
        }
    }
    
}
