package ConditionalStatement;

public class Conditional2 {

    // MEMBUAT INSTANCE VARIABLE
    public float totalPinjaman;
    public String golongan;

    // MEMBUAT METHOD PERHITUNGAN PINJAMAN
    public void myAngsuranMethod(){
        float angsuran = 0, totalAngsuran = 0;

        if (golongan.equals("3A")){
            angsuran = 50_000f;
        } else if (golongan.equals("3B")){
            angsuran = 100_000f;
        } else if (golongan.equals("3C")){
            angsuran = 150_000f;
        }

        // MENAMPILKAN JUMLAH PINJAMAN
        System.out.format("JUMLAH PINJAMAN = %.2f \n", totalPinjaman);

        // MENAMPILKAN PEMBAYARAN PINJAMAN
        int bulan = 0;
        while (totalAngsuran < totalPinjaman){
            totalAngsuran += angsuran;
            bulan++;
            System.out.format("PINJAMAN BULAN KE - %d = %.2f \n",bulan,totalAngsuran);
        }
    }

    public static void main(String...args){

        // INSTANSIASI OBJEK
        Conditional2 objek = new Conditional2();
        objek.totalPinjaman = 2000000;
        objek.golongan = "3C";
        objek.myAngsuranMethod();

    }
}
