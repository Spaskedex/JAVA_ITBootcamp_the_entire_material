package ObjektnoOrjentisanoProgramiranje.TEST_JAVA_OOP;
/*
Napraviti klasu Planina
atributi: naziv(String), visina(double ili int) i opasnost(Boolean)
 */

public class Planina {

    private String naziv;
    private double visina;
    private boolean opasnost;


    public Planina(String naziv, double visina, boolean opasnost) {
        this.naziv = naziv;
        this.visina = visina;
        this.opasnost = opasnost;
    }
    public String toString() {
        return "Ime planine " + naziv + ", visina: [" + visina + "]m , opasna: " + opasnost;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getVisina() {
        return visina;
    }

    public boolean isOpasnost() {
        return opasnost;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public void setOpasnost(boolean opasnost) {
        this.opasnost = opasnost;
    }
}
