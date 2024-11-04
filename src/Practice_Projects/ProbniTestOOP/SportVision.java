package Practice_Projects.ProbniTestOOP;
/*
Napraviti klasu SportVision I on za black Friday daje popust od 30% na sve artikle.
 */

import java.util.ArrayList;

public class SportVision extends Prodavnica{
    public SportVision(int brojZaposlenih, ArrayList<Artikl> listaArtikala) {
        super(brojZaposlenih, listaArtikala);
    }

    @Override
    public void blackFriday() {
        for(Artikl a: getListaArtikala()){
            a.setCena(a.getCena()*0.7);
        }
    }
}
