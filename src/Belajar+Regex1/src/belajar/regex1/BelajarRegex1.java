/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.regex1;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author vaio
 */
public class BelajarRegex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Pattern myPattern = Pattern.compile("AliceMyLove", Pattern.CASE_INSENSITIVE);
    Matcher myMatcher = myPattern.matcher("Andre Rizaldi Brillianto & AliceMyLoves");
    boolean FindMatch = myMatcher.find();
        if (FindMatch) {
            System.out.println("Data Ditemukan");
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }
    
}
