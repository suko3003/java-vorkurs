package Brueckenkurs_1.src;

import java.util.ArrayList;
import java.util.List;

public class ProceduralKlass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello World");
        System.out.println("I am a brand new program.");

        System.out.print("(4+5)*2=");
        System.out.println((4 + 5) * 2);

        System.out.print("10/2=");
        System.out.println(10 / 2);

        System.out.print("(4+5*2)-3=");
        System.out.println((4 + 5 * 2) - 3);

        System.out.print("5^3=");
        System.out.println(Math.pow(5, 3));

        System.out.println("5^3=" + Math.pow(5, 3));

        System.out.println("5+3=" + (5 + 3));

        System.out.println("5.4/3.141=" + (5.4 / 3.141));

        /*
         * 
         * f(x, c) = x^2 + x + c
         * x = 1520.3
         * c = 0.3
         * 
         */
        double x = 125.851487;
        double c = 65.358;

        x = 625.851487;
        c = 5.358;

        System.out.println("f(x,c) = x^2 + x + c");
        System.out.print("f(" + x + ", " + c + ") = ");
        System.out.println(Math.pow(x, 2) + x + c);

        double y;
        double b;

        y = 125.85148745678912345678;
        b = 65.358;

        System.out.println("y = " + y);

        int a = 45;
        int a2 = 2;

        System.out.println("a/a2 = " + (a / a2));

        y = 45;
        b = 2;

        System.out.println("y/b = " + (y / b));

        System.out.println("int min: " + Integer.MIN_VALUE);
        System.out.println("int max: " + Integer.MAX_VALUE);

        System.out.println("int max + 1: " + (Integer.MAX_VALUE + 1));

        System.out.println("int min - 1: " + (Integer.MIN_VALUE - 1));

        boolean niceDay = true; // false
        // hier ist ein kommentar
        niceDay = false;

        /*
         * mehrzeiliger Kommentar
         * bla blubb
         * 
         */

        // abhängig von den Sonnenstunden in der Variable
        // wird nice day = false oder true ausgegeben
        int sonnenStunden = 7;

        niceDay = sonnenStunden > 8; // ergebnis immer true oder false

        System.out.println("nice day = " + niceDay);

        if (niceDay) // oder: if (sonnenStunden > 8)
        {
            System.out.println("Na dann ab an den Strand!");
        } else {
            System.out.println("Lieber nicht an den Strand :-(");
        }

        // for
        // while (true / false) { }
        // do { } while (true / false)

        int usb = 0; // 0: noch nicht bereit

        // USB Gerät, Status abfragen
        do {
            System.out.println("USB Status vorher: " + usb);
            usb = usb + 1; // status aktualisieren
            System.out.println("USB Status nachher: " + usb);
        } while (usb < 10);

        System.out.println("USB Status nach der do-while: " + usb);

        usb = 0;

        while (usb < 10) {
            System.out.println("USB Status vorher: " + usb);
            usb = usb + 1; // status aktualisieren
            System.out.println("USB Status nachher: " + usb);
        }

        System.out.println("USB Status nach der while: " + usb);

        for (int i = 10; // start wert
                i > 0; // bedingung
                i--) // bei jedem schleifendurchlauf ausführen
        {

            System.out.println("i: " + i);
        }

        for (int i = 0; // start wert
                i < 100; // bedingung
                i++) // bei jedem schleifendurchlauf ausführen
        {
            System.out.println("i: " + i + " i % 2 = " + (i % 2));

            if ((i % 2) == 0) {
                System.out.println("Gerade");
            }
        }

        /*
         * 5 * 2 = 10
         */

        int array[] = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // int == Integer

        List<Integer> intList = new ArrayList<Integer>();

        for (int i = 0; i < 50_000_000; i++) {
            intList.add(i);
        }

        for (int i = 0; i < 50000000; i++) {
            System.out.println(intList.get(i));
        }

    }

}
