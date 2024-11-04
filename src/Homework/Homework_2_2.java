package Homework;

/*
2. Napisati progam koji za uneti broj poena (0-100) dodeljuje odgovarajucu ocenu (6, 7, 8, 9, 10) prema sledecem ranigiranju
51-60
61-70
71-80
81-90
91-100
Ako je broj poena manji od 51, ispisati poruku da je broj bodova nedovoljan za polaganje ispita.
 */


import java.util.Scanner;

public class Homework_2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj vasih osvojenih poena (od 0 do 100) : ");
        int osvojeniPoeni = sc.nextInt();

        if ( osvojeniPoeni >= 51 && osvojeniPoeni <= 60 ) {
            System.out.println("Cestitam, polozili ste! Vasa ocena je : 6.");
        } else if( osvojeniPoeni >= 61 && osvojeniPoeni <= 70) {
            System.out.println("Cestitam, polozili ste! Vasa ocena je : 7.");
        } else if ( osvojeniPoeni >= 71 && osvojeniPoeni <= 80) {
            System.out.println("Cestitam, polozili ste! Vasa ocena je : 8.");
        } else if ( osvojeniPoeni >= 81 && osvojeniPoeni <= 90) {
            System.out.println("Cestitam, polozili ste! Vasa ocena je : 9.");
        } else if ( osvojeniPoeni >= 91 && osvojeniPoeni <= 100) {
            System.out.println("Cestitam, polozili ste! Vasa ocena je max : 10.");
        } else if ( osvojeniPoeni < 51 && osvojeniPoeni >= 0) {
            System.out.println("Zao nam je! Broj bodova je nedovoljan za polaganje ispita!");
        } else {
            System.out.println("Nepravilan unos, pokusajte ponovo!");
        }
    }
}
