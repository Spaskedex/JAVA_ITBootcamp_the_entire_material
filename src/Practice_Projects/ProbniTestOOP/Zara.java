package Practice_Projects.ProbniTestOOP;
/*
Napraviti klasu Zara koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 200.
 */

import java.util.ArrayList;

public class Zara extends Prodavnica{
    public Zara(int brojZaposlenih, ArrayList<Artikl> listaArtikala) {
        super(brojZaposlenih, listaArtikala);
    }

    @Override
    public double ukupnaZarada() {
        double zarada = 0;
        for(Artikl a: getListaArtikala()) {
            zarada+=a.getCena();
        }
        return (zarada-(getBrojZaposlenih()*200));
    }
}
