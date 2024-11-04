package Practice_Projects.ProbniTestOOP;
/*
Napraviti klasu Artikl koji od atributa ima naziv, cenu I godinu proizvodnje.
Za sve klase kreirati adekvatne konstruktore, geter I setere kao I toString.
Modifikovanje metoda je dozvoljeno kao I kreiranje dodatnih.
 */

public class Artikl {

    private String naziv;
    private double cena;
    private int godinaProzivodnje;


    public Artikl(String naziv, double cena, int godinaProzivodnje) {
        this.naziv = naziv;
        this.cena = cena;
        this.godinaProzivodnje = godinaProzivodnje;
    }
    public String toString() {
        return "Ime artikla: " + naziv + "; cena: [" + cena + "] EUR ; proizvedeno: [" + godinaProzivodnje + "]";
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCena() {
        return cena;
    }

    public int getGodinaProzivodnje() {
        return godinaProzivodnje;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setGodinaProzivodnje(int godinaProzivodnje) {
        this.godinaProzivodnje = godinaProzivodnje;
    }
}
