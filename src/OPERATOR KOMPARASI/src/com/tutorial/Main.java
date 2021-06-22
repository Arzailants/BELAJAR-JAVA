package com.tutorial;

public class Main {

    public static void main(String[] args) {

        //OPERATOR KOMPARASI akan menghasilkan nilai dalam bentuk boolean
        int a,b;
        boolean hasilKomparasi;

        //OPERATOR EQUAL ATAU PERSAMAAN
        System.out.println("====== PERSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = ( a == b);
        System.out.printf("%d == %d >> %s \n",a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = ( a == b);
        System.out.printf("%d == %d >> %s \n",a,b, hasilKomparasi);



        //OPERATOR NOT EQUAL ATAU PERTIDAKSAMAAN
        System.out.println("====== PERTIDAKSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = ( a != b);
        System.out.printf("%d != %d >> %s \n",a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = ( a != b);
        System.out.printf("%d != %d >> %s \n",a,b, hasilKomparasi);



        //OPERATOR LESS ATAU KURANG DARI
        System.out.println("====== KURANG DARI");
        a = 10;
        b = 10;
        hasilKomparasi = ( a < b);
        System.out.printf("%d <  %d >> %s \n",a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = ( a < b);
        System.out.printf("%d < %d >> %s \n",a,b, hasilKomparasi);



        //OPERATOR GREATER THAN ATAU LEBIH DARI
        System.out.println("====== LEBIH DARI");
        a = 10;
        b = 10;
        hasilKomparasi = ( a > b);
        System.out.printf("%d > %d >> %s \n",a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = ( a > b);
        System.out.printf("%d > %d >> %s \n",a,b, hasilKomparasi);

    }
}
