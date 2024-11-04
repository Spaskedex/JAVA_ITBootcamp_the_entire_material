package Homework.Homework_11;
/*
Napraviti klasu Klub koja ima atribute: naziv, grad, i lista igraca (lista objekata klase Igrac).
Napraviti metode:
- najiskusnijiIgrac() -> vraca ime igrača sa najvise godina iskustva.
- ukupnoPoena() -> vraća ukupan broj poena koje su postigli svi igrači u klubu.
- vrednostTima() -> vraca vrednost tima (apstraktan metod)
 */

import java.util.ArrayList;

public abstract class Klub {

    private String naziv;
    private String grad;
    private ArrayList<Igrac> igraci;

    public Klub (String naziv, String grad, ArrayList<Igrac> igraci) {
        this.naziv=naziv;
        this.grad=grad;
        this.igraci=igraci;
    }
    public String toString() {
        return "Ime kluba: " + naziv + ", maticni grad:" + grad + ", lista igraca: [" + igraci + "];";
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String noviNaziv) {
        this.naziv=noviNaziv;
    }
    public String getGrad() {
        return grad;
    }
    public void setGrad(String noviGrad) {
        this.grad=noviGrad;
    }
    public ArrayList<Igrac> getIgraci() {
        return igraci;
    }
    public void setIgraci(ArrayList<Igrac> noviIgraci) {
        this.igraci=noviIgraci;
    }
    public String najiskusnijiIgrac() {
            Igrac najiskusniji = getIgraci().getFirst();
            for(Igrac i: getIgraci()) {
                if (najiskusniji.getIskustvo() < i.getIskustvo()) {
                    najiskusniji= i;
              }
        }
       return najiskusniji.getIme();
    }
    public int ukupnoPoena() {
        int ukupno= 0;
        for(Igrac i: getIgraci()) {
            ukupno+=i.getPoeni();
        }
        return ukupno;
    }

    public abstract String odbrambeniAs();

    public abstract double vrednostTima();

    public abstract String sampionTima();

    public abstract String najboljiStrelac();
}
