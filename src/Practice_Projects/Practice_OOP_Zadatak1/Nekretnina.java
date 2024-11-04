package Practice_Projects.Practice_OOP_Zadatak1;

/*
Zadatak 1:
Napraviti klasu Nekretnina koja ima kao atribut kvadraturu, cena po kvadratu i listu ponuda.
Napraviti metode:
- najvecaPonuda() -> vraca najvecu ponudu iz liste
- cena() -> vraca cenu nekretnine, ukoliko ima vise od 100 kvadrata, na ukupnu svotu dati popust od 15%
Napraviti klasu Stan koji nasledjuje klasu Nekretnina.
Napraviti klasu Kuca koji nasledjuje klasu Nekretnina i on daje popust od 20% ukoliko je kuca veca od 200 kvadrata.
Napraviti klasu Lokal nasledjuje klasu Nekretnina i on daje popust od 25% ukoliko je kuca veca od 250 kvadrata.
 */

import java.util.ArrayList;

public class Nekretnina {

    private double kvadratura;
    private double cenaKvadrat;
    private ArrayList<Double> listaPonuda;

    public Nekretnina(double kvadratura, double cenaKvadrat, ArrayList<Double> listaPonuda ) {
        this.kvadratura=kvadratura;
        this.cenaKvadrat=cenaKvadrat;
        this.listaPonuda=listaPonuda;
    }
    public String toString() {
        return "Kvadratura " + kvadratura + " m2, cena po kvadratu: " + cenaKvadrat + "EUR; lista ponuda: " + listaPonuda;
    }


    public double getKvadratura() {
        return kvadratura;
    }

    public double getCenaKvadrat() {
        return cenaKvadrat;
    }

    public ArrayList<Double> getListaPonuda() {
        return listaPonuda;
    }

    public void setKvadratura(double kvadratura) {
        this.kvadratura = kvadratura;
    }

    public void setCenaKvadrat(double cenaKvadrat) {
        this.cenaKvadrat = cenaKvadrat;
    }

    public void setListaPonuda(ArrayList<Double> listaPonuda) {
        this.listaPonuda = listaPonuda;
    }
    public double najvecaPonuda() {
        double ponuda = getListaPonuda().get(0);
        for(Double d: getListaPonuda()) {
            if(d>ponuda) {
                ponuda=d;
            }
        }
        return ponuda;
    }
    public double cena() {
        double cena=0;
        if(kvadratura<=100) {
            cena=kvadratura*cenaKvadrat;
        }
        if(kvadratura>100) {
            cena=kvadratura*cenaKvadrat*0.85;
        }
        return cena;
    }
}
