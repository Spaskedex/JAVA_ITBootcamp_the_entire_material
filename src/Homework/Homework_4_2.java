package Homework;

/*
    2.Napisi program koji koristi while petlju da omogući korisniku unos dva broja. Program
treba da ispise rezultat deljenja prvog broja sa drugim. Petlja treba da se ponavlja u slucaju
da je drugi broj jednak nuli.
 */

import java.util.Scanner;

public class Homework_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        boolean z = true;
        System.out.println("Unesite prvi broj:");
        x = sc.nextDouble();

        while (z) {

            System.out.println("Unesite drugi broj: ");
            y = sc.nextDouble();

            if (y != 0) {
                System.out.println("Rezultat deljenja x / y = " + (x / y));
                z = false;
            }
        }


    }
}
