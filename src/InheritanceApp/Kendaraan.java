package InheritanceApp;

public class Kendaraan {

    // MEMBUAT ATTRIBUT
    private String namaKendaraan;
    private int jumlahRoda;
    private int jumlahTempatDuduk;

    // MEMBUAT GETTER DAN SETTER
    // GET
    public String getNamaKendaraan(){
        return namaKendaraan;
    }

    public int getJumlahRoda(){
        return jumlahRoda;
    }

    public int getJumlahTempatDuduk(){
        return jumlahTempatDuduk;
    }

    // SET
    public void setNamaKendaraan(String namaKendaraan){
        this.namaKendaraan = namaKendaraan;
    }

    public void setJumlahRoda(int jumlahRoda){
        this.jumlahRoda = jumlahRoda;
    }

    public void setJumlahTempatDuduk(int jumlahTempatDuduk){
        this.jumlahTempatDuduk = jumlahTempatDuduk;
    }

    // MEMBUAT METHOD UNTUK MENAMPILKAN
    public String toString(){
        String data = "Nama Kendaraan = " +this.namaKendaraan+ "\n"+
                "Jumlah Roda = " +this.jumlahRoda+ "\n"+
                "Jumlah Tempat duduk = " +this.jumlahTempatDuduk;
        return data;
    }

    // MAIN CLASS
    public static void main(String[] args) {

        Kendaraan objekKendaraan = new Kendaraan();
        System.out.println("Mobil");
        objekKendaraan.setNamaKendaraan("Avanza");
        objekKendaraan.setJumlahRoda(4);
        objekKendaraan.setJumlahTempatDuduk(4);
        String tampil = objekKendaraan.toString();
        System.out.println(tampil);

        KeretaApi objekKeretaApi = new KeretaApi();
        System.out.println("\nKereta Api");
        objekKeretaApi.setNamaKendaraan("Avanza");
        objekKeretaApi.setJumlahRoda(50);
        objekKeretaApi.setJumlahGerbong(15);
        System.out.println("Nama Kendaraan = " +objekKeretaApi.getNamaKendaraan());
        System.out.println("Jumlah Gerbong = " +objekKeretaApi.getJumlahGerbong());
        System.out.println("Jumlah Roda = " +objekKeretaApi.getJumlahRoda());
        System.out.println("Jumlah Tempat Duduk = " +objekKeretaApi.getJumlahTempatDuduk());

    }
}


class KeretaApi extends Kendaraan {

    // MEMBUAT ATTRIBUT
    private int jumlahGerbong;

    // GETTER SETTER
    // GET
    public int getJumlahGerbong(){
        return jumlahGerbong;
    }

    public void setJumlahGerbong(int jumlahGerbong){
        this.jumlahGerbong = jumlahGerbong;
    }

}