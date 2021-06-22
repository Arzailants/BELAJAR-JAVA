/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar5_konversi_tipe_data_numeric;

/**
 *
 * @author vaio
 */
public class BELAJAR5_KONVERSI_TIPE_DATA_NUMERIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // PROGRAM UNTUK KONVERSI DATA
    int nilaiInt = 450; //32 bit
        System.out.println("nilai  int = " +nilaiInt);
        
    //MEMPERLUAS RENTANG KE TIPE DATA YANG LEBIH BESAR
    long nilaiLong  = nilaiInt;
        System.out.println("nilai long = " +nilaiLong);

   
    //MEMPERKECIL RENTANG KE TIPE DATA YANG LEBIH KECIL    
    byte nilaiByte  = (byte) nilaiInt;
        System.out.println("nilai byte =" +nilaiByte);
        System.out.println("nilai maks byte =" + Byte.MAX_VALUE);
        System.out.println("nilai mins byte =" + Byte.MIN_VALUE);
    
    
    //CASTING PEMBAGIAN
    float a = 10;
    int b = 4;
    
    float c = a/b; 
        System.out.printf("%f / %d = %f \n",a,b,c);
        
    int x = 10;
    int y = 5;
    
    float z = (float) (x/y);
        System.out.printf("%d / %d = %f\n",x,y,z);
    }
    
}
