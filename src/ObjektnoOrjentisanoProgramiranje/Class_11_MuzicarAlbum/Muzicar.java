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

public abstract class Muzicar {

    private String ime;
    private int godinaPocetka;
    private Album album;


    public Muzicar(String ime, int godinaPocetka, Album album) {
        this.ime = ime;
        this.godinaPocetka = godinaPocetka;
        this.album = album;
    }

    public String toString() {
        return "Ime: " + ime + " godina pocetka karijere: " + godinaPocetka + "; prvi album: " + album;
    }


    public String getIme() {
        return ime;
    }

    public int getGodinaPocetka() {
        return godinaPocetka;
    }

    public Album getAlbum() {
        return album;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setGodinaPocetka(int godinaPocetka) {
        this.godinaPocetka = godinaPocetka;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void prviHit() {
        if(getGodinaPocetka()==getAlbum().getGodinaObjavljivanja()) {
            System.out.println("Ovaj album je autorov prvi hit.");
        } else {
            System.out.println("Nije autorov prvi hit.");
            }
        }

        public abstract double zarada();

}
