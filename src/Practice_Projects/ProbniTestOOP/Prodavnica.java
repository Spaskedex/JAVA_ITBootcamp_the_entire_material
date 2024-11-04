package Practice_Projects.ProbniTestOOP;
/*
Napraviti klasu Artikl koji od atributa ima naziv, cenu I godinu proizvodnje.
Napraviti klasu Prodavnica koja od atributa ima broj zaposlenih I listu artikala.
Napraviti metode:
-blackFriday() -> sve artikle iz liste spusta za 50%
-pronadji(String a) -> trazi prosledjeni naziv u listi artikala
-triftKolekcija() -> vraca listu artikala koji su stariji od 20 godina
-ukupnaZarada() -> racuna Koliko prodavnica zaradjuje kada proda sve artikle, uz to da svakog zaposlenog placaju 100
-izbaciPrestaro() -> izbacuje iz liste sve artikle koji su stariji od 30 god
Napraviti klasu HM koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 150.
Napraviti klasu Zara koji nasledjuje klasu Prodavnica I oni svoje zaposlene placaju 200.
Napraviti klasu Reserved koji ima dodatni atribut za ocekivanu godisnju zaradu, ukoliko je to ispunjeno
svi zaposleni dobijaju platu od 200, u suprotnom imaju platu od 100.
Napraviti klasu SportVision I on za black Friday daje popust od 30% na sve artikle.
Za sve klase kreirati adekvatne konstruktore, geter I setere kao I toString.
Modifikovanje metoda je dozvoljeno kao I kreiranje dodatnih.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Prodavnica {

    private int brojZaposlenih;
    private ArrayList<Artikl> listaArtikala;


    public Prodavnica(int brojZaposlenih, ArrayList<Artikl> listaArtikala) {
        this.brojZaposlenih = brojZaposlenih;
        this.listaArtikala = listaArtikala;
    }
    public String toString() {
        return "Broj zaposlenih: " + brojZaposlenih + ", lista artikala: " + listaArtikala;
    }

    public int getBrojZaposlenih() {
        return brojZaposlenih;
    }

    public ArrayList<Artikl> getListaArtikala() {
        return listaArtikala;
    }

    public void setBrojZaposlenih(int brojZaposlenih) {
        this.brojZaposlenih = brojZaposlenih;
    }

    public void setListaArtikala(ArrayList<Artikl> listaArtikala) {
        this.listaArtikala = listaArtikala;
    }
//    public double blackFriday(ArrayList<Artikl> lista) {
//        double popust=0;
//        for(Artikl a:getListaArtikala()){
//            popust=a.getCena()*0.5;
//        }
//        return popust;
//    }

    public void blackFriday() {
    for(Artikl a: getListaArtikala()){
    a.setCena(a.getCena()*0.5);
        }
    }

    public void pronadji(String a) {
        for (Artikl naziv: getListaArtikala()) {
            if(a.equals(naziv.getNaziv())) {
                System.out.println("Imamo artikl " + a + " na stanju.");
            }
        }
    }


    public ArrayList<Artikl> triftKolekcija() {
        ArrayList<Artikl> kolekcija = new ArrayList<>();
        for (Artikl a: getListaArtikala()) {
            if(a.getGodinaProzivodnje()<(2024-20)) {
                kolekcija.add(a);
            }
        }
        return kolekcija;
    }
    public double ukupnaZarada() {
        double zarada = 0;
        for(Artikl a: getListaArtikala()) {
            zarada+=a.getCena();
        }
        return (zarada-(getBrojZaposlenih()*100));
    }
    public void izbaciPrestaro(){
        for (int i=getListaArtikala().size()-1; i>=0; i--) {
            if(getListaArtikala().get(i).getGodinaProzivodnje()<(2024-30)) {
                getListaArtikala().remove(i);
            }
        }
    }
}
