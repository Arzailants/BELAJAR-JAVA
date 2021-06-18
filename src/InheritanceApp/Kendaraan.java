package InheritanceApp;

public class Kendaraan {

    // MEMBUAT ATRIBUT
    public int jumlahRoda;
    public int jumlahTempatDuduk;
    public String nama;

    // MEMBUAT METHOD TAMPIL JUMLAH RODA
    public void tampilJumlahRoda(){
        System.out.println(this.nama+ " Jumlah Rodanya = " +this.jumlahRoda);
    }

    // MEMBUAT METHOD TAMPIL JUMLAH TEMPAT DUDUK
    public void tampilJumlahTempatDuduk(){
        System.out.println(this.nama+ " Jumlah Tempat Duduk = "+this.jumlahTempatDuduk);
    }

    public static void main(String[] args) {

        //
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.nama = "Pajero Sport";
        kendaraan.jumlahRoda = 4;
        kendaraan.jumlahTempatDuduk = 4;
        kendaraan.tampilJumlahRoda();
        kendaraan.tampilJumlahTempatDuduk();

        System.out.println("============");

        // INSTANSIASI OBJEK KELAS KERETA API
        KeretaApi keretaApi = new KeretaApi();
        keretaApi.nama = "Kereta Api";
        keretaApi.jumlahRoda = 50;
        keretaApi.jumlahTempatDuduk = 100;
        keretaApi.jumlahGerbong = 12;
        keretaApi.tampilGerbong();
        keretaApi.tampilJumlahRoda();
        keretaApi.tampilJumlahTempatDuduk();
    }


}


class KeretaApi extends Kendaraan{

    public int jumlahGerbong;

    public void tampilGerbong(){
        System.out.format("%s Jumlah Semua Gerbong di Kereta = %d \n", super.nama, jumlahGerbong);
    }
}