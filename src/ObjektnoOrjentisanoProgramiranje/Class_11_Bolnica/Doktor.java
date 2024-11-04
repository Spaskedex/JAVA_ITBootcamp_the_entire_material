package ObjektnoOrjentisanoProgramiranje.Class_11_Bolnica;

/*
Zadatak 1:
Napraviti klasu Doktor koji od atributa ima ime, broj pacijenata i godinu zaposlenja.
Napraviti metode:
- godineStaza() -> racuna Koliko doktor ima godina staza
- plata() -> racuna koliku platu ima doktor ako zaradjuje 100 po pacijentu
Napraviti klasu Pedijatar koji nasledjuje klasu Doktor I on zaradjuje 150 po pacijentu.
Napraviti klasu Hirurg koji nasledjuje klasu Doktor I on zaradjuje 230 po pacijentu.
Napraviti klasu Oftalmolog koji nasledjuje klasu Doktor.
 */


public class Doktor {


    private String ime;
    private int brojPacijenata;
    private int godinaZaposlenja;


    public  Doktor(String ime, int brojPacijenata, int godinaZaposlenja) {
        this.ime=ime;
        this.brojPacijenata=brojPacijenata;
        this.godinaZaposlenja=godinaZaposlenja;
    }

    public String toString() {
        return "Doktor: " + ime + " ima pacijenata: " + brojPacijenata + "; godine staza: " + godinaZaposlenja + ";";
    }

    public String getIme() {
        return ime;
    }
    public void setIme(String novoIme) {
        this.ime=novoIme;
    }
    public int getBrojPacijenata() {
        return brojPacijenata;
    }
    public void setBrojPacijenata(int noviBrojPacijenata) {
        this.brojPacijenata=noviBrojPacijenata;
    }
    public int getGodineZaposlenja() {
        return godinaZaposlenja;
    }
    public void setGodineZaposlenja(int noveGodineZaposlenja) {
        this.godinaZaposlenja=noveGodineZaposlenja;
    }

    public int godineStaza() {
        int godine = 2024 - getGodineZaposlenja();
        return godine;
    }

    // Ukol


    public double plata() {
        return 0;
    }

}
