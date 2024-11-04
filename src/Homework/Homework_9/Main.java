package Homework.Homework_9;

/*
Domaci:
Definisati hijerarhiju klasa koje predstavljaju razlicite valute u menjacnici.
Osnovna Klasa: Valuta
promenljive: naziv , simbol, i kurs.
Konstruktor: Postavlja vrednosti za naziv, simbol i kurs valute.
Metoda: konvertujUdinare(iznos), koja konvertuje zadati iznos u dinare koristeci trenutni kurs valute.
Dolar:
Nasledjuje klasu Valuta.
Konstruktor: Postavlja vrednosti za naziv "Dolar", simbol "USD", i trenutni kurs prema dinarima.
Dodatna Metoda: postaviKursNovi(kurs), koja postavlja novi kurs dolara.
Euro:
Nasledjuje klasu Valuta.
Konstruktor: Postavlja vrednosti za naziv "Euro", simbol "EUR", i trenutni kurs prema dinarima.
Dodatna Metoda: postaviKursNovi(kurs: number), koja postavlja novi kurs evra.
Napisati glavni program koji kreira objekte za dolar i evro, postavlja njihove kurseve,
i vrsi konverziju odredjenih iznosa iz jedne valute u drugu.

 */


public class Main {
    public static void main(String[] args) {

        Valuta dolar = new Dolar("Dolar", "USD", 105);
        System.out.println(dolar);
        Valuta euro = new Euro("Euro", "EUR", 117);
        System.out.println(euro);
        int iznosUSD = 1000;
        int iznosEUR = 1000;

        System.out.println("Iznos od " + iznosUSD + " USD u dinarima iznosi: " + dolar.konvertujUDinare(iznosUSD) + " RSD.");
        System.out.println("Iznos od " + iznosEUR + " EUR u dinarima iznosi: " + euro.konvertujUDinare(iznosEUR) + " RSD.");

        dolar.postaviKursNovi(107);
        euro.postaviKursNovi(121);

        System.out.println(dolar);
        System.out.println(euro);

        System.out.println("Iznos novog kursa od " + iznosUSD + " USD u dinarima iznosi: " + (dolar.konvertujUDinare(iznosUSD)) + " RSD.");
        System.out.println("Iznos novog kursa od " + iznosEUR + " EUR u dinarima iznosi: " + euro.konvertujUDinare(iznosEUR) + " RSD.");

    }
}
