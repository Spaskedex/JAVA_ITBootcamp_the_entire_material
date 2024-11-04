package ObjektnoOrjentisanoProgramiranje.Class_11_MuzicarAlbum;

/*
Zadatak 3:
Napraviti klasu Album koji ima kao atribute naziv, godinu objavljivanja I broj pesama.
Napraviti klasu Muzicar koji od atributa ima ime, godinu pocetka karijere I jedan album.
Napraviti metode:
- prviHit() -> ukoliko je album objavljen kad je muzicar I zapoceo karijeru, ispisati poruku da mu je to prvi hit
- zarada() -> vraca zaradu od albuma ako znamo da zaradjuje 1000 po pesmi.
Napraviti klasu RokMuzicar koji nasledjuje klasu Muzicar I on zaradjuje 750 po pesmi.
Napraviti klasu PopMuzicar koji nasledjuje klasu Muzicar.
Napraviti klasu Reper koji nasledjuje klasu Muzicar I on zaradjuje 500 po pesmi.
 */

public class Album {

    private String naziv;
    private int godinaObjavljivanja;
    private int brojPesama;


    public Album(String naziv, int godinaObjavljivanja, int brojPesama) {
        this.naziv = naziv;
        this.godinaObjavljivanja = godinaObjavljivanja;
        this.brojPesama = brojPesama;
    }


    public String toString() {
        return "Ime albuma: " + naziv + ", godina objavljivanja: [" + godinaObjavljivanja + "] broj pesama: [" + brojPesama + "]";
    }

    public String getNaziv() {
        return naziv;
    }

    public int getGodinaObjavljivanja() {
        return godinaObjavljivanja;
    }

    public int getBrojPesama() {
        return brojPesama;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setGodinaObjavljivanja(int godinaObjavljivanja) {
        this.godinaObjavljivanja = godinaObjavljivanja;
    }

    public void setBrojPesama(int brojPesama) {
        this.brojPesama = brojPesama;
    }
}
