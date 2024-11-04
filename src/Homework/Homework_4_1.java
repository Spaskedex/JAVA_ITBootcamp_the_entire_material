package Homework;

/*
    1. Napisi program koji koristi do-while petlju da omoguci korisniku unos lozinke sve dok ne
unese ispravnu lozinku. Ispravna lozinka moze biti unapred inicijalozovana.
 */

import java.util.Scanner;

public class Homework_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ispravnaLozinka = "sifra123";
        String lozinka;

      do {
          System.out.println("Unesite lozinku: ");
          lozinka = sc.nextLine();
          if (!lozinka.equals(ispravnaLozinka)) {
              System.out.println("Lozinka je pogresna.");
          }

      } while (!lozinka.equals(ispravnaLozinka));
        System.out.println("Lozinka je ispravna.");
    }
}
