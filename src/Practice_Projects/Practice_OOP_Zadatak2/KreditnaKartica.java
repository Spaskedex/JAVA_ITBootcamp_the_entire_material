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

public class KreditnaKartica {

    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    private double stanjeNaRacunu;

    public KreditnaKartica(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }
    public String toString() {
        return "Stanje na racunu: " + stanjeNaRacunu + " RSD;";
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }
}
