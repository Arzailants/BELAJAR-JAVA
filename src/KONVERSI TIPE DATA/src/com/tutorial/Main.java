package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // PROGRAM UNTUK KONVERSI DATA

        int nilaiInt = 450; //32 bit
        System.out.println("nilai int = " + nilaiInt);

        // MEMPERLUAS RENTANG KE TIPE DATA YANG LEBIH BESAR
        long nilaiLong = 450;
        System.out.println("nilai Long = " +nilaiLong);

        // MEMPERKECIL RENTANG KE TIPE DATA YANG LEBIH KECIL
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai maksimum = " + Byte.MAX_VALUE);
        System.out.println("nilai minimum = " + Byte.MIN_VALUE );

        // CASTING PEMBAGIAN
        int x = 10;
        int y = 4;

        float z = (float) x/y;
        System.out.printf("%d / %d = %f \n",x,y,z);


    }
}
