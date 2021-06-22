package com.tutorial;

public class Main {

    public static void main(String[] args) {

    // UNARY = OPERASI YANG DILAKUKAN PADA SATU VARIABLE


     // UNARY + DAN -
        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d\n",angka, +angka);

     // UNARY INCREMENT DAN DECREMENT
        //INCREMENT
        int angka2 = 10;
        angka2++;
        angka2++;
        System.out.println("nilai dengan '++' menjadi = " +angka2);

        //DECREMENT
        int angka3 = 10;
        angka3--;
        angka3--;
        System.out.println("nilai dengan '--' menjadi =" +angka3);

        //
        int a = 5;
        System.out.println("nilai dengan '++a' prefix menjadi " + ++a);
        int b = 5;
        System.out.println("nilai dengan 'b++' postfix menjadi " + b++);
        System.out.println("nilai hasil dari postfix menjadi " + b);


        //UNARY BOOLEAN DENGAN ! UNTUK NEGASI
        boolean alice = true;
        System.out.println("nilai boolean = " + alice);
        System.out.println("nilai boolean = " + +alice);



    }
}


