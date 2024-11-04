package Homework;

/*
1. Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca sumu svih elemenata niza
 */

import java.util.Scanner;

public class Homework_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza:");
        int duzina = sc.nextInt();
        int i = 0;
        int[] niz = new int[duzina];
        int zbir = 0;
        while (i < duzina) {
            System.out.println("Unesite elemente niza (cele brojeve): ");
            niz[i] = sc.nextInt();
            i++;
        }
        for (i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
            zbir += niz[i];
        }
        System.out.println("Zbir svih elemenata niza je: " + zbir);
    }
}

