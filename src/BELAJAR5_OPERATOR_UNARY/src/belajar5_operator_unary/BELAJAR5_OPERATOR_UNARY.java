/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar5_operator_unary;

/**
 *
 * @author vaio
 */
public class BELAJAR5_OPERATOR_UNARY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // UNARY = OPERASI YANG DILAKUKAN PADA SATU VARIABEL
    
    //UNARY + DAN -
    int angka = 1;
        System.out.printf("unary '-', %d menjadi %d\n",angka, -angka);
        System.out.printf("unary '+', %d menjadi %d\n",angka, +angka);
    
    //UNARY INCREMENT
    int angka2 = 10;
    angka2++;
        System.out.println("hasilnya dengan ++ menjadi =" +angka2);
        
    //UNARY DECREMENT
    int angka3 = 10;
    angka3--;
        System.out.println("hasilnya dengan -- menjadi =" +angka3);
    
        
    //PREFIX
    int a = 5;
        System.out.println("nilai dengan ++ prefix menjadi =" + ++a);
        
    //POSTFIX
    int b = 5;
        System.out.println("nilai dengan ++ postfix menjadi =" + b++);
        System.out.println("nilai b setelah di postfix dan ditampilkan = "+b);
        
    //UNARY BOOLEAN DENGAN ! UNTUK NEGASI
    boolean alicx = true;
        System.out.println("nilai boolean = " + alicx);
        System.out.println("nilai boolean = " + !alicx);
        
    }
    
}
