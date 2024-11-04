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


public class Valuta {

    private String naziv;
    private String simbol;
    private double kurs;

    public Valuta(String naziv, String simbol, double kurs) {
        this.naziv=naziv;
        this.simbol=simbol;
        this.kurs=kurs;
    }
    public String toString() {
        return "Valuta: " + naziv + " [" + simbol + "[ , " + "kurs: [" + kurs + " RSD]";
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String noviNaziv) {
        this.naziv=noviNaziv;
    }
    public String getSimbol() {
        return simbol;
    }
    public void setSimbol(String noviSimbol) {
        this.simbol=noviSimbol;
    }
    public double getKurs() {
        return kurs;
    }
    public void setKurs(int noviKurs) {
        this.kurs=noviKurs;
    }
    public double konvertujUDinare(double iznos) {
        double dinari = iznos*getKurs();
        return dinari;
    }
    public double postaviKursNovi(int kurs) {
        setKurs(kurs);
        return getKurs();
    }




}
