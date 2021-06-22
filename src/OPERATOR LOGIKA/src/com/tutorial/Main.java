package com.tutorial;

public class Main {

    public static void main(String[] args) {

        //OPERATOR LOGIKA = OPERASI YANG BISA KITA LAKUAN KEPADA TIPE DATA BOOLEAN
        // OR, AND, XOR, DAN NEGASI

        boolean a,b,c;

        // OR / ATAU (||)

        System.out.println("======== OR (||) ======");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " +c);

        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " +c);

        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " +c);

        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " +c);


        // AND / DAN(&&)
        System.out.println("======== AND (&&) ======");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " +c);

        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " +c);

        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " +c);

        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " +c);


        // XOR / EXCLUSIVE OR (^)
        System.out.println("======== XOR (^) ======");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " +c);

        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " +c);

        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " +c);

        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " +c);


        // NOT / NEGASI >> FLIPING (!)
        System.out.println("=====NEGASI======");
        a = true;
        c = !a;
        System.out.println(a + " >> (!) = " + c);

    }
}
