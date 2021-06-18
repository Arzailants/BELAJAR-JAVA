package ArrayApp;

public class Array1 {
    public static void main(String[] args) {

        // MENGISI DATA ARRAY
        MasukkanString inputName = new MasukkanString();
        inputName.namaArray[0] = "Andre Rizaldi Brillianto";
        inputName.namaArray[1] = "Andre";
        inputName.namaArray[2] = "Andre Rizaldi";
        inputName.namaArray[3] = "Andre Rizaldi Brillianto & Alice";
        inputName.namaArray[4] = "Andre Rizaldi Brillianto & Reveth";

        inputName.tampil();
    }

}

class PanjangString{
    // METHOD UNTUK MENGHITUNG PANJANG STRING
    public int hitungPanjang(String nama){
        return nama.length();
    }
}

class MasukkanString{

    // MEMBUAT ARRAY
    String[] namaArray = new String[5];

    // PERULANGAN UNTUK MENAMPILKAN
    public void tampil(){
        for (int i = 0; i < namaArray.length; i++){
            PanjangString objek = new PanjangString();
            System.out.println("Nama Karyawan = " +namaArray[i]+ " (Panjang = " +objek.hitungPanjang(namaArray[i]) +")");
        }
    }
}