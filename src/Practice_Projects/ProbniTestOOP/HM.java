package Practice_Projects.ProbniTestOOP;
/*
Napraviti klasu HM koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 150.
 */

import java.util.ArrayList;

public class HM extends Prodavnica{
    public HM(int brojZaposlenih, ArrayList<Artikl> listaArtikala) {
        super(brojZaposlenih, listaArtikala);
    }

    @Override
    public double ukupnaZarada() {
        double zarada = 0;
        for(Artikl a: getListaArtikala()) {
            zarada+=a.getCena();
        }
        return (zarada-(getBrojZaposlenih()*150));
    }
}
