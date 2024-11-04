package Homework;

/*
2. Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca maksimalni element u nizu
 */

import java.util.Scanner;

public class Homework_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza:");
        int duzina = sc.nextInt();

        int[] niz = new int[duzina];
        int maksimalnaVrednost = Integer.MIN_VALUE;

        for (int i = 0; i < duzina; i++) {
            System.out.println("Unesite elemente niza (cele brojeve): ");
            niz[i] = sc.nextInt();
            if (maksimalnaVrednost < niz[i]) {
                maksimalnaVrednost = niz[i];
            }
        }
        System.out.println("Maksimalna vrednost broja u nizu je: " + maksimalnaVrednost);
    }
}
