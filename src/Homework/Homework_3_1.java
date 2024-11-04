package Homework;

/*
1. Napisi program koji korisnika pita da unese ocenu ucenika kao celobrojni broj
(na primer, 5, 4, 3, 2, 1). Koristiti switch za konvertovanje ocenu u slovnu ocenu prema sledećem kljucu:
Ako je ocena 5, slovna ocena je "Odlican".
Ako je ocena 4, slovna ocena je "Vrlo dobar".
Ako je ocena 3, slovna ocena je "Dobar".
Ako je ocena 2, slovna ocena je "Dovoljan".
Ako je ocena 1, slovna ocena je "Nedovoljan".
 */


import java.util.Scanner;

public class Homework_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite vasu ocenu:");
        int ocena = sc.nextInt();

        switch (ocena) {
            case 1:
                System.out.println("Nedovoljan uspeh!");
                break;
            case 2:
                System.out.println("Dovoljan uspeh!");
                break;
            case 3:
                System.out.println("Dobar uspeh!");
                break;
            case 4:
                System.out.println("Vrlo dobar uspeh!");
                break;
            case 5:
                System.out.println("Odlican uspeh! Bravo!!!");
                break;
            default:
                System.out.println("Pogresan unos!");
                break;
        }

    }
}
