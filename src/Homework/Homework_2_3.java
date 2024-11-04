package Homework;

/*
3. Napisi jednostavan kalkulator koji trazi od korisnika da unese dva broja i operaciju (+ ili -).
Na osnovu izbora korisnika, program treba da izvrsi odgovarajucu operaciju.
(char operacija = sc.next().charAt(0); -> za ucitavanje znaka)
*charAt(i) vraca karatker na i-tom mestu iz stringa, brojanje pocinje od 0 => charAt(0) -> vraca karakter na prvoj poziciji stringa
*Pre nego sto postavite domaci formatirajte kod sa CTRL + ALT + L
 */


import java.util.Scanner;

public class Homework_2_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi od dva broja: ");
        int prviBroj = sc.nextInt();
        System.out.println("Unesite drugi broj: ");
        int drugiBroj = sc.nextInt();
        System.out.println("Unesite znak '+' za sabiranje ili '-' za oduzimanje unetih brojeva: ");
        char znak = sc.next().charAt(0);

        if (znak == '+') {
            System.out.println("Zbir unetih brojeva je " + (prviBroj + drugiBroj));
        } else if (znak == '-') {
            System.out.println(" Razlika unetih brojeva je " + (prviBroj - drugiBroj));
        } else {
            System.out.println("Pogresan unos matematicke operacije. Pokusajte ponovo.");
        }
    }
}
