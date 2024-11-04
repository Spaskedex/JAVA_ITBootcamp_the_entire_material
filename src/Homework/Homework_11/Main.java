package Homework.Homework_11;

import java.util.ArrayList;

/*
Napraviti klasu Igrac koja ima atribute: ime, godine iskustva, i broj postignutih poena.
Napraviti klasu Klub koja ima atribute: naziv, grad, i lista igraca (lista objekata klase Igrac).
Napraviti metode:
- najiskusnijiIgrac() -> vraca ime igrača sa najvise godina iskustva.
- ukupnoPoena() -> vraća ukupan broj poena koje su postigli svi igrači u klubu.
- vrednostTima() -> vraca vrednost tima (apstraktan metod)
Napraviti klasu KosarkaskiKlub koja nasleđuje klasu Klub, i dodati specifičnu metodu:
- sampionTima() -> vraća ime igraca koji ima više od 1000 postignutih poena.
Napraviti klasu FudbalskiKlub koja nasleđuje klasu Klub, i dodati metodu:
- najboljiStrelac() -> vraca ime igraca sa najvise postignutih golova (golove cemo interpretirati kao postignute poene).
Napraviti klasu OdbojkaškiKlub koja nasleđuje klasu Klub, i dodati metodu:
- odbrambeniAs() -> vraća ime igrača koji ima najvise poena, ali je igrao manje od 3 godine.
vrednostTima() -> za kosarkaski tim racunamo da igrac vredi 50 za svaki postignut poen, za fudbalski tim racunamo
 da igrac vredi po 1000 za svaki postignut gol, dok za odbojkaski tim svaki igrac vredi 100 po poenu.
 Vrednost tima predstavlja sumu cena svih njegovih igraca
 */
public class Main {
    public static void main(String[] args) {

        Igrac i1 = new Igrac("Dex", 2, 99);
        Igrac i2 = new Igrac("Ford", 23, 23);
        Igrac i3 = new Igrac("Fux", 2, 23);
        Igrac i4 = new Igrac("Fex", 14, 23);
        Igrac i5 = new Igrac("Fix", 15, 23);
        Igrac i6 = new Igrac("Rex", 6, 2);

        ArrayList<Igrac> igraci = new ArrayList<>();
        igraci.add(i1);
        igraci.add(i2);
        igraci.add(i3);
        igraci.add(i4);
        igraci.add(i5);
        igraci.add(i6);
        Klub kosarka = new KosarkaskiKlub("Crvena Zvezda", "Beograd", igraci);
        System.out.println(kosarka);
        System.out.println("Ukupno poena: " + kosarka.ukupnoPoena());
        System.out.println("Sampion tima: " + kosarka.sampionTima());
        Klub fudbal = new FudbalskiKlub("Crvena zvezda", "Beograd", igraci);
        System.out.println("Najbolji strelac: " + fudbal.najboljiStrelac());
        Klub odbojka = new OdbojkaskiKlub("As", "Sabac", igraci);
        System.out.println(odbojka.odbrambeniAs());
        System.out.println("Vrednost kosarkaskog tima : " + kosarka.vrednostTima());
        System.out.println("Vrednost fudbalskog tima : " + fudbal.vrednostTima());
        System.out.println("Vrednost odbojkaskog tima : " + odbojka.vrednostTima());


    }
}
