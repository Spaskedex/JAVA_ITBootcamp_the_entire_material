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


public class Glumac {

    private int godRodjenja;
    private String ime;


    public Glumac(int godRodjenja, String ime) {
        this.godRodjenja=godRodjenja;
        this.ime=ime;
    }

    public String toString() {
        return "Godina rodjenja: [" + godRodjenja + "] Ime glumca: [" + ime + "]";
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }
    public void setGodRodjenja(Integer novaGodinaRodjenja) {
        this.godRodjenja=novaGodinaRodjenja;
    }

    public String getIme() {
        return ime;
    }
    public void setIme(String novoIme) {
        this.ime=novoIme;
    }






}
