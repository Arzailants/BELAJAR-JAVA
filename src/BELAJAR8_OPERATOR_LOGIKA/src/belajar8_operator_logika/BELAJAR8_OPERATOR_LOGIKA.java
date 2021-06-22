/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar8_operator_logika;

/**
 *
 * @author vaio
 */
public class BELAJAR8_OPERATOR_LOGIKA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    // OPERATOR LOGIKA = OPERASI YANG BISA KITA LAKUKAN KEPADA TIPE DATA BOOLEAN
    // AND, OR, XOR, NEGASI
    
    boolean a,b,c;
    
    // OR / ATAU (||)
        System.out.println("==OR==");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + "||" + b + "=" + c);
        
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + "||" + b + "=" + c);
        
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + "||" + b + "=" + c);
        
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + "||" + b + "=" + c);
        
        
        // DAN / AND (&&)
        System.out.println("==AND==");
        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + "&&" + b + "=" + c);
        
        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + "&&" + b + "=" + c);
        
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + "&&" + b + "=" + c);
        
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + "&&" + b + "=" + c);
        
        
        // XOR / EXCLUSIVE OR ()
        System.out.println("==XOR==");
        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + "^" + b + "=" + c);
        
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + "^" + b + "=" + c);
        
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + "^" + b + "=" + c);
        
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + "^" + b + "=" + c);
        
        
        // NOT / NEGASI = FLIPPING (!)
        System.out.println("==XOR==");
        a = false;
        b = !a;
        System.out.println(a + " ! = " + b);
        
        a = true;
        b = !a;
        System.out.println(a + " ! = " + b);
        
    }
    
}
