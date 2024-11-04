package Practice_Projects.ProbniTestOOP;
/*
Napraviti klasu Reserved koji ima dodatni atribut za ocekivanu godisnju zaradu, ukoliko je to ispunjeno
svi zaposleni dobijaju platu od 200, u suprotnom imaju platu od 100.
 */

import java.util.ArrayList;



public class Reserved extends Prodavnica{

    private double ocekivanaZarada;

    public Reserved(int brojZaposlenih, ArrayList<Artikl> listaArtikala, double ocekivanaZarada) {
        super(brojZaposlenih, listaArtikala);
        this.ocekivanaZarada=ocekivanaZarada;
    }


    @Override
    public double ukupnaZarada() {
        double zarada = 0;
        for(Artikl a: getListaArtikala()) {
            zarada+=a.getCena();
        }
        if(zarada>=ocekivanaZarada) {
            return (zarada-(getBrojZaposlenih()*200));
        } else {
            return (zarada-(getBrojZaposlenih()*100));
        }
    }
}
