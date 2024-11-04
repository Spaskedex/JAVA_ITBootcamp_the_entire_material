package ObjektnoOrjentisanoProgramiranje.Class_9_Zadatak4;

/*
Zadatak 4:
Napraviti klasu Autor koji u sklopu ima ime, godinu rodjenja,ukupan broj prodanih dela i jednu knjigu.
Napraviti metodu:
-ranaObjava() -> ispisati poruku ako je autor objavio svoju knjigu pre 25 godine
-zarada() -> Koliko je zaradio ukupno para od svih prodanih dela ako racunamo da imaju isti cenu kao ta jedna knjiga
 */

public class Knjiga {

    private String naslov;
    private int godinaIzdavanja;
    private double cena;

    public Knjiga(String naslov, int godinaIzdavanja, double cena) {
        this.naslov=naslov;
        this.godinaIzdavanja=godinaIzdavanja;
        this.cena=cena;
    }

    public String toString() {
        return "Naslov knjige: [" + naslov + "]; godina izdavanja: [" + godinaIzdavanja + "];";
    }

    public String getNaslov() {
        return naslov;
    }
    public void setNaslov(String noviNaslov) {
        this.naslov=noviNaslov;
    }

    public int getGodinaIzdavanja() {
        return godinaIzdavanja;
    }
    public void setGodinaIzdavanja(Integer novaGodinaIzdavanja) {
        this.godinaIzdavanja=novaGodinaIzdavanja;
    }

    public double getCena() {
        return cena;
    }
    public void setCena(double novaCena) {
        this.cena=novaCena;
    }


}
