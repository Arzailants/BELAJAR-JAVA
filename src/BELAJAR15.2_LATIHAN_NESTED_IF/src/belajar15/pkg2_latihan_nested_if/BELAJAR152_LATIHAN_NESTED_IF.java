/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar15.pkg2_latihan_nested_if;

/**
 *
 * @author vaio
 */
public class BELAJAR152_LATIHAN_NESTED_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NESTED IF / IF BERTINGKAT
    
    int ekspresi1 = 10;
    int ekspresi2 = 20;
    int ekspresi3 = 30;
        
    if(ekspresi1 == 20){
            System.out.println("statement 1");
        }
        else{
         if (ekspresi2 == 20){
             System.out.println("statement 4");
         }
         else{
             if(ekspresi3 == 30 ){
                 System.out.println("satement 2");
             }
             else{
                 System.out.println("statment 3");
             }
         }   
        }
    }
    
}
