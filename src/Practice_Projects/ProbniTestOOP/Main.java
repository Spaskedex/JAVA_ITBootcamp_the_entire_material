package Practice_Projects.ProbniTestOOP;
/*
Napraviti klasu Artikl koji od atributa ima naziv, cenu I godinu proizvodnje.
Napraviti klasu Prodavnica koja od atributa ima broj zaposlenih I listu artikala.
Napraviti metode:
-blackFriday() -> sve artikle iz liste spusta za 50%
-pronadji(String a) -> trazi prosledjeni naziv u listi artikala
-triftKolekcija() -> vraca listu artikala koji su stariji od 20 godina
-ukupnaZarada() -> racuna Koliko prodavnica zaradjuje kada proda sve artikle, uz to da svakog zaposlenog placaju 100
-izbaciPrestaro() -> izbacuje iz liste sve artikle koji su stariji od 30 god
Napraviti klasu HM koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 150.
Napraviti klasu Zara koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 200.
Napraviti klasu Reserved koji ima dodatni atribut za ocekivanu godisnju zaradu, ukoliko je to ispunjeno
svi zaposleni dobijaju platu od 200, u suprotnom imaju platu od 100.
Napraviti klasu SportVision I on za black Friday daje popust od 30% na sve artikle.
Za sve klase kreirati adekvatne konstruktore, geter I setere kao I toString.
Modifikovanje metoda je dozvoljeno kao I kreiranje dodatnih.
 */

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Artikl> artikli = new ArrayList<>();
        Artikl a1 = new Artikl("TV", 250, 1987);
        Artikl a2 = new Artikl("TvBlackWhite", 100, 1982);
        Artikl a3 = new Artikl("TVPlazma", 350, 2001);
        Artikl a4 = new Artikl("TVLCD", 400, 2010);
        Artikl a5 = new Artikl("TVUHD", 550, 2015);
        Artikl a6 = new Artikl("TV4K", 600, 2018);
        Artikl a7 = new Artikl("TV8K", 1000,2020);
        Artikl a8 = new Artikl("Laptop", 1500, 2024);
        artikli.add(a1);
        artikli.add(a2);
        artikli.add(a3);
        artikli.add(a4);
        artikli.add(a5);
        artikli.add(a6);
        artikli.add(a7);
        artikli.add(a8);
        System.out.println(artikli);
        Prodavnica HM = new HM(3, artikli);
        Prodavnica zara = new Zara(2,artikli);
        Prodavnica reserved = new Reserved(5, artikli, 5000);
        Prodavnica sportVision = new SportVision(4, artikli);
        HM.pronadji("TV");
        zara.blackFriday();
        System.out.println("Zarada zara : " + zara.ukupnaZarada());
        System.out.println("Zarada HM : " + HM.ukupnaZarada());
        System.out.println("Zarada Reserved: : " + reserved.ukupnaZarada());
        System.out.println("Zarada SportVision: " + sportVision.ukupnaZarada());
        System.out.println(HM.triftKolekcija());
        HM.izbaciPrestaro();
        System.out.println(HM);
        HM.pronadji("Laptop");
        HM.pronadji("CD");



    }
}
