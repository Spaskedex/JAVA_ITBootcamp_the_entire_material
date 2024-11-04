package Milan_Tair_Java_practice;

import java.util.Scanner;

public class Lection_1and2 {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 3;
//        int c;
//        c = a * b;
//        System.out.println("C je :" + c);
//        c = a * a * 45;
//        System.out.println("Druga vrednost C je :" + c);
//        double d;
//        d = 1.0 * a / b * 73.4675432;
//        System.out.println("Double D ima vrednost:" + d);



        // Lection_2:
//        System.out.println("Unesite godinu upisa: ");
//
//        Scanner s = new Scanner(System.in);
//        int godinaUpisa = s.nextInt();
//        int godinaDiplomiranja = godinaUpisa + 4;
//        System.out.println("Godina diplomiranja je: " + godinaDiplomiranja);


//        Scanner s = new Scanner(System.in);
//        System.out.println("Unesite temperaturu u *C: ");
//        double tempC = s.nextDouble();
//        double tempF = tempC * 1.8 + 32;
//        System.out.println("Temperatura u *F je : " + tempF);

//        System.out.println("Unesite temperaturu u *F: ");
//          Scanner s = new Scanner(System.in);
//          double tempF = s.nextDouble();
//          double tempC = (tempF - 32) / 1.8;
//          System.out.println("Temperatura u *C je: " + tempC);

//        System.out.println("Unesite dva prirodna broja: ");
//            Scanner s = new Scanner(System.in);
//            int broj1 = s.nextInt();
//            int broj2 = s.nextInt();
//            double broj3 = broj1 * broj2 / (1 - broj2) +3;
//        System.out.println("Rezultat formule je: " + broj3);

//        System.out.println("Unesite realan broj: ");
//        Scanner s = new Scanner(System.in);
//        final double TE_KONSTANTA = 7.64;
//        double x = s.nextDouble();
//        double f = Math.pow(x, TE_KONSTANTA);
//        System.out.println("Specijalni stepen je: " + f);

        System.out.println("Unesite prirodni broj: ");
        Scanner s = new Scanner(System.in);
        final int  KONSTANTA = 3;
        int broj = s.nextInt();
        int rezultat = (int) Math.pow(broj, KONSTANTA);
        System.out.println("Rezultat stepena kosntante je : " + rezultat);



    }
}
