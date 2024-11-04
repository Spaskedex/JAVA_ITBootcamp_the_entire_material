package Practice_Projects.Practice_OOP_Zadatak2;

/*
Napraviti klasu Korpa koji ima od atributa jednu stavku i kreditnu karticu.
Napraviti metode:
- plati() -> skida pare sa kreditne kartice u iznosu od cene stavke, ukoliko nema dovoljno, ispisati poruku.
- viseStavki() -> vraca nam Koliko puta mozemo da kupimo tu stavku sa parama koje imamo
 */

public class Korpa {

    private Stavka stavka;
    private KreditnaKartica kartica;


    public Korpa(Stavka stavka, KreditnaKartica kartica) {
        this.stavka = stavka;
        this.kartica = kartica;
    }
    public String toString() {
        return "stavka " + stavka + " kartica " + kartica;
    }

    public Stavka getStavka() {
        return stavka;
    }

    public KreditnaKartica getKartica() {
        return kartica;
    }

    public void setStavka(Stavka stavka) {
        this.stavka = stavka;
    }

    public void setKartica(KreditnaKartica kartica) {
        this.kartica = kartica;
    }

    public void plati() {
        double skini = 0;
        if(getKartica().getStanjeNaRacunu()>=getStavka().getCena()) {
            skini = getKartica().getStanjeNaRacunu() - getStavka().getCena();
            getKartica().setStanjeNaRacunu(skini);
            System.out.println("Placeno. Stanje na racunu: " + getKartica().getStanjeNaRacunu());
        } else {
            System.out.println("Nemate dovoljno sredstava na racunu.");
        }
    }
    public int viseStavki() {
        return (int) (getKartica().getStanjeNaRacunu()/getStavka().getCena());
    }
}
