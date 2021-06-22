/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar7_operator_komparasi;

/**
 *
 * @author vaio
 */
public class BELAJAR7_OPERATOR_KOMPARASI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    // OPERATOR KOMPARASI
    int a,b;
    boolean hasilKom;
    
    //================================
    //OPERATOR EQUAL ATAU PERSAMAAN 1
        System.out.println("PERSAMAAN / EQUAL");
    //TRUE
    a = 10;
    b = 10;
    System.out.printf("%d apakah sama dengan %d %s \n",a,b,(a == b));
    
    //FALSE
    a = 12;
    b = 10;
    System.out.printf("%d apakah sama dengan %d %s \n",a,b,(a == b));
    //================================
    //OPERATOR EQUAL ATAU PERSAMAAN 2
    //TRUE
    int x = 20;
    int y = 20;
    hasilKom = (x == y);
    System.out.printf("%d ==> %d %s \n",x,y,hasilKom);
    
    //FALSE
    x = 22;
    y = 20;
    hasilKom = (x == y);
    System.out.printf("%d ==> %d %s \n",x,y,hasilKom);
    
    

    //================================
    //OPERATOR NOT EQUAL ATAU PERTIDAKSAMAAN
    System.out.println("PERTIDAKSAMAAN / NOT EQUAL");
    a = 20;
    b = 20;
    hasilKom = (a != b);
    System.out.printf("%d ==> %d %s \n",a,b,hasilKom);
    
    //FALSE
    a = 22;
    b = 20;
    hasilKom = (a != b);
    System.out.printf("%d ==> %d %s \n",a,b,hasilKom);
    
    
    //================================
    //OPERATOR LESS THAN / KURANG DARI
        System.out.println("LESS THAN / KURANG DARI");
    a = 18;
    b = 20;
    hasilKom = (a < b);
    System.out.printf("%d < %d %s \n",a,b,hasilKom);
    

    a = 22;
    b = 20;
    hasilKom = (a < b);
    System.out.printf("%d < %d %s \n",a,b,hasilKom);
    
    
    //================================
    //OPERATOR GREATER THAN / LEBIH DARI
    System.out.println("GREATER THAN / LEBIH DARI");
    a = 18;
    b = 20;
    hasilKom = (a > b);
    System.out.printf("%d > %d %s \n",a,b,hasilKom);
    

    a = 22;
    b = 20;
    hasilKom = (a > b);
    System.out.printf("%d > %d %s \n",a,b,hasilKom);
    
    
    //================================
    //OPERATOR LESS THAN EQUAL / KURANG DARI SAMA DENGAN
    System.out.println("LESS THAN EQUAL / KURANG DARI SAMA DENGAN");
    a = 19;
    b = 20;
    hasilKom = (a <= b);
    System.out.printf("%d <= %d %s \n",a,b,hasilKom);
    
    a = 20;
    b = 20;
    hasilKom = (a <= b);
    System.out.printf("%d <= %d %s \n",a,b,hasilKom);
    
    a = 22;
    b = 20;
    hasilKom = (a <= b);
    System.out.printf("%d <= %d %s \n",a,b,hasilKom);
    
    
    //================================
    //OPERATOR GREATER THAN EQUAL / LEBIH DARI SAMA DENGAN
    System.out.println("GREATER THAN EQUAL / LEBIH DARI SAMA DENGAN");
    a = 19;
    b = 20;
    hasilKom = (a >= b);
    System.out.printf("%d >= %d %s \n",a,b,hasilKom);
    
    a = 20;
    b = 20;
    hasilKom = (a >= b);
    System.out.printf("%d >= %d %s \n",a,b,hasilKom);
    
    a = 22;
    b = 20;
    hasilKom = (a >= b);
    System.out.printf("%d >= %d %s \n",a,b,hasilKom);
    
    }
    
}
