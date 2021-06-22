/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar18_kalkulator_sederhana;

import java.util.Scanner;

/**
 *
 * @author vaio
 */
public class BELAJAR18_KALKULATOR_SEDERHANA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
    // MEMBUAT KALKULATOR SEDERHANA
    float a,b,hasil;
    char operator;
    
    System.out.print("Masukkan Nilai a = ");
    a = UserInput.nextFloat();
    System.out.print("Masukkan Operator = ");
    operator = UserInput.next().charAt(0);
    System.out.print("Masukkan Nilai b = ");
    b = UserInput.nextFloat();
    
    // KALKULATOR SEDERHANA MENGGUNAKAN IF ELSE
        if (operator == '+') {
            hasil = a + b;
            System.out.println("Hasilnya adalah = " +hasil);
        }else if (operator == '*') {
            hasil = a * b;
            System.out.println("Hasilnya adalah = " +hasil);
        }else if (operator == '/') {
            hasil = a / b;
            System.out.println("Hasilnya adalah = " +hasil);
        }else{
            System.out.println("Operasi salah");
        }
    
    
        // KALKULATOR SEDERHANA MENGGUNAKAN SWITCH CASE
        switch (operator) {
            case '+':
                hasil = a + b;
                System.out.println("Hasilnya adalah = " +hasil);
                break;
            case '*':
                hasil = a * b;
                System.out.println("Hasilnya adalah = " +hasil);
                break;
            case '/':
                hasil = a / b;
                System.out.println("Hasilnya adalah = " +hasil);
                break;
            default:
                System.out.println("Operasi salah");
                break;
        }
    
    
    }
    
}
