package Homework.Homework_9;

public class Dolar extends Valuta {


    public Dolar(String naziv, String simbol, double kurs) {
        super("Dolar", "USD", kurs);
    }

    @Override
    public double konvertujUDinare(double iznos) {
        return super.konvertujUDinare(iznos);
    }

    @Override
    public double postaviKursNovi(int kurs) {
        return super.postaviKursNovi(kurs);
    }
}