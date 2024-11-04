package Homework.Homework_10;
/*
Domaci:
Napraviti klasu Knjiga koja ima atribute: naslov, broj strana, i godina izdavanja.
Napraviti klasu Pisac koja ima atribute: ime, godina rođenja, i lista knjiga (lista objekata klase Knjiga).
Napraviti metode:
najpoznatijaKnjiga() -> koja vraća naslov knjige sa najvećim brojem strana.
vremePisanja() -> koja vraća razliku između godine izdavanja prve i poslednje knjige.
Napraviti klasu Romanopisac koji nasledjuje klasu Pisac i specifična metoda je:
dugometrazniRoman() -> vraća "dugometražni roman" ako knjiga ima više od 500 strana.
Napraviti klasu Pesnik koji nasledjuje klasu Pisac i ima metodu:
brojZbirki() -> koja vraća broj knjiga koje imaju manje od 100 strana (pretpostavljamo da su zbirke poezije kraće).
Napraviti klasu Esesista koja nasledjuje klasu Pisac i dodati metodu:
kratkiEseji() -> vraća broj eseja (knjiga) koji imaju manje od 50 strana.
 */

import java.util.ArrayList;

public abstract class Pisac {
   private String ime;
   private int godRodjenja;
   private ArrayList<Knjiga> listaKnjiga;

    public Pisac(String ime, int godRodjenja, ArrayList<Knjiga> listaKnjiga) {
        this.ime = ime;
        this.godRodjenja = godRodjenja;
        this.listaKnjiga = listaKnjiga;
    }
    public String toString() {
        return "Pisac: " + ime + " rodjen: " + godRodjenja + "; knjige: " + listaKnjiga + ";";
    }
    public String getIme() {
        return ime;
    }
    public int getGodRodjenja() {
        return godRodjenja;
    }
    public ArrayList<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setGodRodjenja(int godRodjenja) {
        this.godRodjenja = godRodjenja;
    }
    public void setListaKnjiga(ArrayList<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }

    public Knjiga najpoznatijaKnjiga(){
        Knjiga najduzaKnjiga=null;
        for(Knjiga knjiga: getListaKnjiga()) {
            if(knjiga.getBrojStrana()>najduzaKnjiga.getBrojStrana()) {
                najduzaKnjiga=knjiga;
            }
        }
        return najduzaKnjiga;
    }

    public int vremePisanja() {
        int prva = Integer.MAX_VALUE;
        int zadnja = Integer.MIN_VALUE;
        for (Knjiga knjiga: getListaKnjiga()) {
            if(prva>knjiga.getGodinaIzdavanja()) {
                prva=knjiga.getGodinaIzdavanja();
            }
            if(zadnja<knjiga.getGodinaIzdavanja()) {
                zadnja=knjiga.getGodinaIzdavanja();
            }
        }
        return zadnja - prva;
    }

}
