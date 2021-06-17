package JavaSwing;

import javax.swing.*;

public class JavaSwing2 {

    // MEMBUAT METHOD
    public void mySwingProject(){
        // MEMBUAT LOCAL VARIBLE
        int bil1, bil2, hasil;

        bil1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan 1 "));

        bil2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Bilangan 2 "));

        hasil = bil1 + bil2;
        JOptionPane.showMessageDialog(null,"Hasil dari " +bil1+ "+" +bil2+ " = " +hasil);
    }

    // MEMBUAT METHOD UNTUK MENAMPILKAN
    public static void tampil(){
        JavaSwing2 objek1 = new JavaSwing2();
        objek1.mySwingProject();
    }

    // MAIN METHOD
    public static void main(String[] args){
        tampil();
    }
}
