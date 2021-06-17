package JavaSwing;

import javax.swing.*;

public class JavaSwing1 {

    // MEMBUAT METHOD UNTUK MENAMPILKAN NAMA DENGAN JOPTION PANE
    public void optionPaneMethod(){
        String nama;
        nama = JOptionPane.showInputDialog("Masukkan Nama ");
        JOptionPane.showMessageDialog(null, "Hallo " +nama);
    }

    public static void tampil(){
        JavaSwing1 objek1 = new JavaSwing1();
        objek1.optionPaneMethod();
    }
    public static void main(String[] args) {

        // INSTANSIASI OBJEK KELAS
        tampil();
    }
}
