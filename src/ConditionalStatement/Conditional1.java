package ConditionalStatement;

public class Conditional1 {

    // MEMBUAT INSTANCE VARIABLE
    public String kodeKaryawan;
    public String namaKaryawan;
    public float gajiPokok;
    public char statusMenikah;
    public int jumlahAnak;

    // DEKLARASI METHOD UNTUK SEMUA VARIABLE
    public float hitungTunjanganIstri(char param) {
        float tunjIstri = 0;
        if (param == 'y') {
            tunjIstri = 0.1f * this.gajiPokok;
        }
        return tunjIstri;
    }

    // MENGHITUNG TUNJANGAN ANAK
    public float hitungTunjanganAnak(int jumlah) {

        float tunjAnak = 0;
        tunjAnak = (jumlah * 0.05f * this.gajiPokok);
        return tunjAnak;
    }

    // MENGHITUNG POTONGAN
    public float hitungPotongan() {
        float jmlPotongan = 0;
        jmlPotongan = 0.05f * this.gajiPokok + this.hitungTunjanganAnak(this.jumlahAnak) + this.hitungTunjanganIstri(this.statusMenikah);
        return jmlPotongan;
    }


    // MENGHITUNG GAJI BERSIH
    public float gajiBersih(){
        float gajiBersih = 0;
        gajiBersih = this.gajiPokok + this.hitungTunjanganAnak(this.jumlahAnak) + this.hitungTunjanganIstri(this.statusMenikah) - this.hitungPotongan();
        return gajiBersih;
    }


    // MEMBUAT METHOD UNTUK MENAMPILKAN
    public static void tampil1(){
        Conditional1 objek1 = new Conditional1();

        // MEMASUKKAN NILAI KE INSTANCE VARIABLE
        objek1.kodeKaryawan = "K001";
        objek1.namaKaryawan = "Andre Rizaldi Brillianto";
        objek1.gajiPokok = 4_000_000;
        objek1.statusMenikah = 'y';
        objek1.jumlahAnak = 2;

        objek1.hitungTunjanganAnak(objek1.jumlahAnak);
        objek1.hitungPotongan();
        objek1.gajiBersih();

        System.out.println("====================");
        System.out.println("KODE KARYAWAN = " +objek1.kodeKaryawan);
        System.out.println("NAMA KARYAWAN = " +objek1.namaKaryawan);
        System.out.println("STATUS KARYAWAN = " +objek1.statusMenikah);
        System.out.println("GAJI POKOK = " +objek1.gajiPokok);

        System.out.println("====================");
        System.out.println("TUNJANGAN ISTRI = " +objek1.hitungTunjanganIstri(objek1.statusMenikah));
        System.out.println("TUNJANGAN ANAK = " +objek1.hitungTunjanganAnak(objek1.jumlahAnak));
        System.out.println("POTONGAN = " +objek1.hitungPotongan());

        System.out.println("===================");
        System.out.println("GAJI BERSIH = " +objek1.gajiBersih());
    }

    // MAIN METHOD
    public static void main(String[] args){
        tampil1();
    }
}
