package Homework;

/*
4. Napisati program koji koristi metodu za izracunavanje faktorijela unetog broja.
 */

import java.util.Scanner;

public class Homework_6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj ciji faktorijel zelite da znate: ");
        int brojF = sc.nextInt();
        faktorijel(brojF);

        System.out.println("Faktorijel unetog broja je: " + faktorijel(brojF));
    }

    public static int faktorijel(int a) {
        int faktor = 1;
        int b=0;
        if (a >= 1) {
            for (int i = 1; i <= a; i++) {
                faktor *= i;
            }
        }
        if (a <= 0) {
            return b;
        }
        return faktor;
    }
}
