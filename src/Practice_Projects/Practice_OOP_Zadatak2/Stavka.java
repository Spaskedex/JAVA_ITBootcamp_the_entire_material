package Practice_Projects.Practice_OOP_Zadatak2;

/*
Zadatak 2:
Napraviti klasu Stavka koja ima od atributa naziv i cenu.
Napraviti klasu KreditnaKartica koja od atributa ima stanje na racunu.
Napraviti klasu Korpa koji ima od atributa jednu stavku i kreditnu karticu.
Napraviti metode:
- plati() -> skida pare sa kreditne kartice u iznosu od cene stavke, ukoliko nema dovoljno, ispisati poruku.
- viseStavki() -> vraca nam Koliko puta mozemo da kupimo tu stavku sa parama koje imamo
OnlineKorpa nasledjuje klasu Korpa i on prilikom placanja daje popust od 10%.
FizickaKorpa nasledjuje klasu Korpa.
 */

public class Stavka {
    private String naziv;
    private double cena;


    public Stavka(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }
    public String toString() {
        return "Ime " + naziv + " cena: [" + cena + "] RSD;";
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
