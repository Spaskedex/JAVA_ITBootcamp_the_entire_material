package Homework.Homework_9;

public class Euro extends Valuta{
    public Euro(String naziv, String simbol, double kurs) {
        super("Euro", "EUR", kurs);
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
