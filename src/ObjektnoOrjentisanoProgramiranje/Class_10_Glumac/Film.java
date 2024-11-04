package ObjektnoOrjentisanoProgramiranje.Class_10_Glumac;

/*
Zadatak 2:
Napraviti klasu Glumac koji ima godinu rodjenja I ime.
Napraviti klasu Film koji od atributa ima godinu objavljivanja, glavnog glumca I ukupno zaradjenih para.
Napraviti metode:
- godineGlavnogGlumca() -> kao rezultat vraca broj godina koje je glumac imao kad je snimio film
- troskovi() -> vraca nam koliki su troskovi ako racunamo da iznose 20% od ukupne zarade filma
Klasa Horor nasledjuje klasu Film.
Klasa AkcioniFilm nasledjuje klasu Film I njegovi troskovi iznose 40% od ukupne zarade.
Klasa Romantika nasledjuje klasu Film I njegovi troskovi iznose 10% od ukupne zarade.
 */

public class Film {

    private int godinaObjavljivanja;
    private Glumac glumac;
    private double ukupnaZarada;


    public Film(int godinaObjavljivanja, Glumac glumac, double ukupnaZarada) {
        this.godinaObjavljivanja=godinaObjavljivanja;
        this.glumac=glumac;
        this.ukupnaZarada=ukupnaZarada;
    }

    public String toString() {
        return "Godina objavljivanja filma: [" + godinaObjavljivanja + "]; Glavni glumac: " + glumac + "; Ukupna zarada: " + ukupnaZarada + " USD;";
    }
    public int getGodinaObjavljivanja() {
        return godinaObjavljivanja;
    }
    public void setGodinaObjavljivanja(Integer novaGodObj) {
        this.godinaObjavljivanja=novaGodObj;
    }
    public Glumac getGlumac() {
        return glumac;
    }
    public void setGlumac(Glumac noviGlumac) {
        this.glumac=noviGlumac;
    }
    public double getUkupnaZarada() {
        return ukupnaZarada;
    }
    public void setUkupnaZarada(double novaUkupnaZarada) {
        this.ukupnaZarada=novaUkupnaZarada;
    }

    public int godineGlavnogGlumca(int godGlumca) {
        godGlumca = getGodinaObjavljivanja() - getGlumac().getGodRodjenja();
        return godGlumca;
    }

    public double troskovi(double troskovi1) {
        troskovi1 = getUkupnaZarada()*0.2;
        return troskovi1;
    }

}
