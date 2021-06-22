/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar11;

/**
 *
 * @author vaio
 */
public class BELAJAR11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    // ARRAY MULTIDIMENSI
    String [][] myName = {{"Alice","Andre"},{"Rizaldi","Brillianto"}};
    String x = myName[0][0];
    System.out.println(x);
    
    
        System.out.println("");
        
        
    // 
     int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
     for (int i = 0; i < myNumbers.length; ++i) {
        for(int j = 0; j < myNumbers[i].length; ++j) {
           System.out.println(myNumbers[i][j]);
        }
        
    }
    
    }
}