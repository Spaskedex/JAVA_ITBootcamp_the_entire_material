package Practice_Projects.Practice_OOP_Zadatak1;

/*
Zadatak 1:
Napraviti klasu Nekretnina koja ima kao atribut kvadraturu, cena po kvadratu i listu ponuda.
Napraviti metode:
- najvecaPonuda() -> vraca najvecu ponudu iz liste
- cena() -> vraca cenu nekretnine, ukoliko ima vise od 100 kvadrata, na ukupnu svotu dati popust od 15%
Napraviti klasu Stan koji nasledjuje klasu Nekretnina.
Napraviti klasu Kuca koji nasledjuje klasu Nekretnina i on daje popust od 20% ukoliko je kuca veca od 200 kvadrata.
Napraviti klasu Lokal nasledjuje klasu Nekretnina i on daje popust od 25% ukoliko je kuca veca od 250 kvadrata.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> listaPonuda = new ArrayList<>();
        listaPonuda.add(50000.0);
        listaPonuda.add(55000.0);
        listaPonuda.add(60000.0);
        listaPonuda.add(75000.0);
        listaPonuda.add(100000.0);
        listaPonuda.add(115000.0);


        Nekretnina stan = new Stan(68, 1550, listaPonuda);
        Nekretnina kuca = new Kuca(278,850, listaPonuda);
        Nekretnina lokal = new Lokal(300, 750, listaPonuda);
        System.out.println(stan.najvecaPonuda());
        System.out.println(kuca.cena());
        System.out.println(kuca);


    }
}
