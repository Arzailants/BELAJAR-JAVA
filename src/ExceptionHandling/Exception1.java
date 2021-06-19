package ExceptionHandling;

import javax.swing.*;

public class Exception1 {

    public static void main(String[] args) {

        int bil1, bil2;

        // SELAMA INPUT UNTUK BILL BUKAN BILANGAN BULAT
        // MAKA AKAN TERUS MENGULANG INPUT
        while (true){
            try{
                bil1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Bilangan 1 "));
                break;
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ini Bukan bilangan Integer");
            }
        }


        // SELAMA INPUT UNTUK BILANGAN 2 BUKAN BILANGAN BULAT
        // MAKA AKAN TERUS MENGULANG INPUT
        while (true){
            try {
                bil2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Bilangan 2"));
                break;
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ini Bukan Bilangan Integer");
            }
        }

        // MENAMPILKAN HASIL
        JOptionPane.showMessageDialog(null, "Hasil Penjumlahan = " +(bil1+bil2));
    }
}
