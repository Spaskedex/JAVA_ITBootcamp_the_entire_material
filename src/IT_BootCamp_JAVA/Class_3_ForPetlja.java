package IT_BootCamp_JAVA;

import java.util.Scanner;

public class Class_3_ForPetlja {
    public static void main(String[] args) {

        /*
            For petlja - ponavlja odredjen broj puta blok datog koda. Sastoji se iz tri dela : 1. inicijalizacija promenljive,
            2. uslov (i<5) koji ponavlja blok koda sve dok je uslov ispunjen, 3. azuriranje (update) :inkrement u ulozi brojaca;
         */


//        Zadatak 3:
//        Izracunati sumu prvih 5 brojeva.


//        int sum = 0;
//        for ( int i = 0; i <= 5; i++) {
//            sum+=i;
//            System.out.println("Zbir prvih 5 brojeva je :" + sum);
//        }

//        Zadatak 4(for):
//        Istampati 10 parnih brojeva.

//        int broj = 0;
//        for (int i = 0; i < 20; i+=2) {
//            broj = broj + 2;
//            System.out.println("Deset parnih brojeva : " + broj);
//        }

//        Zadatak 5(for):
//        Istampati sve brojeve 1-20 koji su deljivi sa 2 i 3.


//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 0 && i % 3 == 0) {
//                System.out.println("Brojevi deljivi sa dva i tri su: " + i);
//            }
//        }



        /*
        Zadatak 6(switch):
        Definisati neku fiksnu platu. Unesite radnu poziciju (moze biti Mehanicar, Fizikalac ili Sef),
        ukoliko ste fizikalac na fiksnu platu imate bonus od 1000, ukoliko ste Mehanicar imate bonus od 1500
        a Sef 2000 bonus na platu. Istampati koliku radnik ima platu.
         */
//        System.out.println("Unesite radnu poziciju: Sef, Mehanicar ili Fizikalac:");
//        Scanner sc = new Scanner(System.in);
//        String radnaPozicija = sc.nextLine();
//
//        int plata = 50000;
//        switch (radnaPozicija.trim().toLowerCase()) {
//            case "mehanicar":
//                plata += 1500;
//                System.out.println("Plata mehanicara sa bonusom je: " + plata);
//                break;
//            case "fizikalac":
//                plata += 1000;
//                System.out.println("Plata fizikalca sa bonusom je : " + plata);
//                break;
//            case "sef":
//                plata += 2000;
//                System.out.println("Plata sefa sa bonusom je : " + plata);
//                break;
//            default:
//                System.out.println("Osnovna plata bez bonusa je: " + plata);
//                break;
//
//        }

        /*
        Zadatak 7:
        Napraviti program da stampa brojeve od 20 do 1.
         */

        for (int i = 20; i >= 0; i--) {
            System.out.println(i);
        }


    }
}
