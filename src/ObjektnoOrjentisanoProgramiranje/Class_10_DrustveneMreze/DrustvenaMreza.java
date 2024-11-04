package ObjektnoOrjentisanoProgramiranje.Class_10_DrustveneMreze;


/*
Zadatak 1:
Napraviti klasu DrustvenaMreza koja od atributa ima broj korisnika i broj reklama.
Napraviti metodu:
- zarada() -> racuna zaradu za drustvene mreze ako zaradjuje 2 po korisniku a 5 po reklami.
- upozorenje() -> ispisuje poruku o upozorenju ukoliko drustvena mreza nema dovoljno korisnika (manje od 200)
Napraviti klasu Facebook koji nasledjuje klasu DrustvenaMreza.
Napraviti klasu Instagram koji nasledjuje klasu DrustvenaMreza I on zaradjuje 1 po korisniku I 10 po reklami.
Napraviti klasu TikTok koji nasledjuje klasu DrustvenaMreza I on ispisuje upozorenje ukoliko ima manje od 500 korisnika.
 */

public class DrustvenaMreza {

    private int brojKorisnika;
    private int brojReklama;

    public DrustvenaMreza(int brojKorisnika, int brojReklama) {
        this.brojKorisnika=brojKorisnika;
        this.brojReklama=brojReklama;
    }

    public String toString() {
        return "Broj korisnika: [" + brojKorisnika + "]; broj reklama: [" + brojReklama + "[;";
    }

    public int getBrojKorisnika() {
        return brojKorisnika;
    }
    public void setBrojKorisnika(int noviBrojKorisnika) {
        this.brojKorisnika=noviBrojKorisnika;
    }

    public int getBrojReklama() {
        return brojReklama;
    }
    public void setBrojReklama(int noviBrojReklama) {
        this.brojReklama= noviBrojReklama;
    }

    public double zarada() {
        double zarada= ((2*getBrojKorisnika())+(5*getBrojReklama()));
        return zarada;
    }

    public void upozorenje() {
        if(getBrojKorisnika()<1000000) {
            System.out.println("Nedovoljno korisnika na mrezi!");
        } else {
            System.out.println("Na mrezi je " + getBrojKorisnika() + " korisnika");
        }
    }


}
