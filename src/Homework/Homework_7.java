package Homework;

/*
1. Napisati program koji omogucava korisniku da unese niz celih brojeva. Program treba da ima sledeće metode:
-+ Metoda za unos niza
-+ Metoda za stampanje niza
-+ Metoda za racunanje srednje vredsnoti brojeva u nizu
-+ Metoda za sabiranje svih dvocifrenih brojeva
-+ Metoda za vracanje razlike izmedju minimalnog i maksimalnog elementa niza
-+ Napisati metodu za vracanje niza sa obrnutim redosledom elemenata niza
-+ Napisati metodu za vracanje broja brojeva vecih od proseka
 */

import java.util.Scanner;

public class Homework_7 {
    public static void main(String[] args) {
        int[] nizInt = new int[5];
        int[] niz = {1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88,99};
        int[] niz2 = {11, 22, 33, 44, 55};
        int[] niz3 = {1,2,3,4,5,6,7,8,9,10};

        String[] nizString = new String[10];
        String[] array1 = {"Elephant", "Horse", "Rabit", "Zevra", "Tiktok", "Dracula", "Ajkula", "Lion", "Wolf", "Tiktok", "Tiktok"};
        String[] array2 = {"Tiktok", "Lion", "Girafa", "Wolf", "Facebook"};
        String[] array3 = {"Mouse", "String", "Giros", "Wolfenstein", "Facedefect"};
        String rec = "Tiktok";
        String myStr = "Hello, World!";


        unosNiza(nizInt);       // 1.

        stampanjeNiza(niz2);    // 2.

        int srednjaVrednost = srednjaVrednost(niz);      // 3.
        System.out.println(srednjaVrednost);

        int sumaDvocifrenih = sumaDvocifrenih(niz);      // 4.
        System.out.println(sumaDvocifrenih);

        System.out.println(minMax(niz));                 // 5.

        stampanjeNiza(obrnutiNiz(niz2));                 // 6.

        System.out.println(brojeviVeciOdProseka(niz3));   // 7.



    }
    public static void unosNiza(int[] niz) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza:");
        int duzinaNiza = sc.nextInt();
        int[] unos = new int[duzinaNiza];

        for (int i=0; i<niz.length; i++) {
            System.out.println("Unesite element niza:");
            unos[i] = sc.nextInt();
        }
    }

    public static void stampanjeNiza(int[] niz) {
        for(int i=0; i<niz.length; i++) {
            System.out.println(niz[i]);
        }
    }

    public static int srednjaVrednost (int[] niz) {
        int suma =0;
        for(int i = 0; i<niz.length; i++) {
            suma+=niz[i];

        }
        suma/=2;
        return suma;
    }

    public static int sumaDvocifrenih(int[] niz) {
        int suma = 0;
        for(int i = 0; i<niz.length; i++)
            if(niz[i]>9 && niz[i]<100) {
                suma+=niz[i];
            }
        return suma;
    }

    public static int minMax(int[] niz) {
        int maxEl = Integer.MIN_VALUE;
        int minEl = Integer.MAX_VALUE;
        int razlika;
        for(int i=0; i<niz.length; i++) {
            if(maxEl<niz[i]) {
                maxEl=niz[i];
            }
            if(minEl>niz[i]) {
                minEl=niz[i];
            }
        }
        razlika = maxEl-minEl;
        return razlika;
    }

    public static int[]  obrnutiNiz(int[] niz) {
        int j = 0;
        int[] obrnuti = new int[niz.length];
        for(int i=niz.length-1; i>=0; i--) {
            obrnuti[j]=niz[i];
            j++;
        }
        return obrnuti;
    }

    public static int brojeviVeciOdProseka(int[] niz) {

        int zbir= 0;
        int brojac = 0;
        for(int i=0; i<niz.length; i++) {
            zbir += niz[i];
        }
        int prosek = zbir / 2;
        for(int j=0; j<niz.length; j++) {
            if(niz[j]>prosek) {
                brojac++;
            }
        }
        return brojac;
    }
}
