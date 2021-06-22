/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarsix;

/**
 *
 * @author vaio
 */
public class BELAJARSIX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    // PERULANGAN DENGAN BREAK DAN CONTINUE
    
    // CONTINUE
    int i = 0;
        while (i < 10) {            
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        
        System.out.println();
        
    
    // BREAK
    int x = 1;
        while (x < 10) {            
            if (x == 4) {
                x++;
                break;
            }
            System.out.println(x);
            x++;
        }
    }
    
}
