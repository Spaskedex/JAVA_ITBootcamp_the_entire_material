package Homework.Homework_11;
/*
Napraviti klasu Igrac koja ima atribute: ime, godine iskustva, i broj postignutih poena.
 */

public class Igrac {

    private String ime;
    private int iskustvo;
    private double poeni;

    public Igrac(String ime, int iskustvo, double poeni) {
        this.ime=ime;
        this.iskustvo=iskustvo;
        this.poeni=poeni;
    }
    public String toString() {
        return "Ime igraca: " + ime + ", godine iskustva: " + iskustvo + ", poeni/golovi: [" + poeni + "];";
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String novoIme) {
        this.ime=novoIme;
    }
    public int getIskustvo() {
        return iskustvo;
    }
    public void setIskustvo(int noviIskustvo) {
        this.iskustvo = noviIskustvo;
    }
    public double getPoeni() {
        return poeni;
    }
    public void setPoeni(double noviPoeni) {
        this.poeni=noviPoeni;
    }
}
