package Homework.Homework_8;


/*
Domaci:
Kreirati klasu BankovniRacun koja modeluje bankovni racun. Svaki bankovni racun ima svoj jedinstveni broj,
 ime vlasnika racuna, i trenutno stanje na racunu.
Implementirati konstruktor koji postavlja vrednosti ovih atributa pri kreiranju racuna.
Dodati metode uplata i isplata koje omogucavaju uplatu i isplatu novca sa racuna.
Obe metode primaju iznos kao argument. Metoda uplata povecava trenutno stanje racuna za dati iznos,
dok metoda skidanje smanjuje trenutno stanje racuna.
Implementirati provere da li je iznos uplate ili skidanja pozitivan i da li postoji dovoljno sredstava na racunu za skidanje.
Napisati metodu toString koja generise string reprezentaciju objekta, uključujući broj racuna,
ime vlasnika i trenutno stanje na racunu.
U main metodi, kreirati objekat klase BankovniRacun, ispisati informacije o računu pomocu
metode toString, izvrsiti nekoliko uplata i skidanja novca na računu pomoću metoda uplata i
skidanje, te na kraju ispisati azurirane informacije o racunu.
 */
/*
Domaci:
Prepraviti prethodni domaci tako sto cete dodati odgovarajuce modifikatore
vidljivosti i primeniti enkapsulaciju. Domaci predajete do sutrasnjeg predavanja
 */


public class Main_bankovni_racun {
    public static void main(String[] args) {


        BankovniRacun bk1 = new BankovniRacun(11051975, "Dejan", "Spasojevic", 13645768);
        BankovniRacun bk2 = new BankovniRacun(234696847, "Dragan", "Stojkovic", 923456876);

        System.out.println("Vasi podaci bk1: " + bk1);
        System.out.println("Vase ime je " + bk1.getIme());
        System.out.println("Vasi podaci bk2: " + bk2);
        System.out.println("Stanje na racunu bk1 posle uplate: " + bk1.uplata(100000) + " RSD.");
        bk2.isplata(100000000);
        bk1.isplata(136798);
        System.out.println("Stanje na racunu bk2 posle uplate: " + bk2.uplata(1564381));
        bk2.isplata(999999999);
        bk2.isplata(435000000);


    }
}
