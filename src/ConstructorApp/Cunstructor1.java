package ConstructorApp;

public class Cunstructor1 {
    public static void main(String[] args) {

        PersegiPanjang.tampil();
    }
}

class PersegiPanjang{

    public int panjang;
    public int lebar;
    public int luas;
    public int keliling;

    // MEMBUAT CONSTURCTOR
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int hitungLuas(){
        luas = (panjang * lebar);
        return luas;
    }

    public int hitungKeliling(){
        keliling = 2 * (panjang + lebar);
        return keliling;
    }

    public static void tampil(){
        PersegiPanjang objek1 = new PersegiPanjang(20,5);
        int dataLuas = objek1.hitungLuas();
        int dataKeliling = objek1.hitungKeliling();
        System.out.println(dataLuas);
        System.out.println(dataKeliling);
    }
}