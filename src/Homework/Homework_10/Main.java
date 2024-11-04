package Homework.Homework_10;
/*
Domaci:
Napraviti klasu Knjiga koja ima atribute: naslov, broj strana, i godina izdavanja.
Napraviti klasu Pisac koja ima atribute: ime, godina rođenja, i lista knjiga (lista objekata klase Knjiga).
Napraviti metode:
najpoznatijaKnjiga() -> koja vraća naslov knjige sa najvećim brojem strana.
vremePisanja() -> koja vraća razliku između godine izdavanja prve i poslednje knjige.
Napraviti klasu Romanopisac koji nasledjuje klasu Pisac i specifična metoda je:
dugometrazniRoman() -> vraća "dugometražni roman" ako knjiga ima više od 500 strana.
Napraviti klasu Pesnik koji nasledjuje klasu Pisac i ima metodu:
brojZbirki() -> koja vraća broj knjiga koje imaju manje od 100 strana (pretpostavljamo da su zbirke poezije kraće).
Napraviti klasu Esesista koja nasledjuje klasu Pisac i dodati metodu:
kratkiEseji() -> vraća broj eseja (knjiga) koji imaju manje od 50 strana.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Knjiga knjiga1 = new Knjiga("Dobro je", 342, 2005);
        Knjiga knjiga2 = new Knjiga("Dobro je jok", 223, 2006);
        Knjiga knjiga3 = new Knjiga("Zamalo je", 123, 2008);
        Knjiga knjiga4 = new Knjiga("Zasto bre", 555, 2007);
        Knjiga knjiga5 = new Knjiga("Posto je", 45, 2012);
        ArrayList<Knjiga> lista = new ArrayList<>();
        lista.add(knjiga1);
        lista.add(knjiga2);
        lista.add(knjiga3);
        lista.add(knjiga4);
        lista.add(knjiga5);
        System.out.println(lista);
        Pisac romanopisac = new Romanopisac("Brankica", 1972, lista);
        System.out.println(romanopisac);
        Pisac pesnik = new Pesnik("Desanka", 1932, lista);
        System.out.println(pesnik);
        Pisac eseista = new Eseista("Blogdan", 1986, lista );
        System.out.println(eseista);

    }
}
