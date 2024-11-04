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

public class Knjiga {
    private String naslov;
    private int brojStrana;
    private int godinaIzdavanja;

    public Knjiga(String naslov, int brojStrana, int godinaIzdavanja) {
        this.naslov=naslov;
        this.brojStrana=brojStrana;
        this.godinaIzdavanja=godinaIzdavanja;
    }
    public String toString() {
        return "Knjiga: " + naslov + "; br.strana: [" + brojStrana + "] izdata: [" + godinaIzdavanja + "] godine.";
    }

    public String getNaslov() {
        return naslov;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public int getGodinaIzdavanja() {
        return godinaIzdavanja;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
    }

    public void setGodinaIzdavanja(int godinaIzdavanja) {
        this.godinaIzdavanja = godinaIzdavanja;
    }
}
