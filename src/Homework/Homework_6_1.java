package Homework;

/*
3. Napisati program koji koristi metode za ispisivanje kvadrata i korena unetog broja.
 */

import java.util.Scanner;

public class Homework_6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj:");
        double broj = sc.nextDouble();
        kvadratniBroj(broj);
        kvadratniKoren(broj);
        System.out.println("Rezultat unetog broja " + broj + " na kvadrat je: " + kvadratniBroj(broj));
        System.out.println("Kvadratni koren unetog broja: " + broj + " je " + kvadratniKoren(broj));

    }
    public static double kvadratniBroj (double a) {
        double kvadrat = Math.pow(a, 2);
        return kvadrat;
    }
    public static double kvadratniKoren (double a) {
        double koren =  Math.sqrt(a);
        return koren;
    }
}
