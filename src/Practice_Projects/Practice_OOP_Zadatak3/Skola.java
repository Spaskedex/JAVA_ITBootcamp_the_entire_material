package Practice_Projects.Practice_OOP_Zadatak3;

import java.util.ArrayList;

/*
Napraviti klasu Skola koja ima listu ucenika i metode:
- vukovci() -> vraca listu djaka koji imaju prosek 5.0
- izbaci() -> izbacuje iz liste sve djake koji imaju prosek ispod 1.5
- ukupnoNeopravdanih() -> vraca sumu svih neopravdanih od ucenika
 */
public class Skola {

    private ArrayList<Ucenik> ucenici;


    public Skola(ArrayList<Ucenik> ucenici) {
        this.ucenici = ucenici;
    }

    public String toString() {
        return "Ucenici: " + ucenici;
    }

    public ArrayList<Ucenik> getUcenici() {
        return ucenici;
    }

    public void setUcenici(ArrayList<Ucenik> ucenici) {
        this.ucenici = ucenici;
    }

    public ArrayList<Ucenik> vukovci() {
        ArrayList<Ucenik> vukovci5 = new ArrayList<>();
        for (Ucenik u : getUcenici()) {
            if (u.prosek() == 5) {
                vukovci5.add(u);
            }
        }
        return vukovci5;
    }

    public void izbaci() {
        for (int i = 0; i < getUcenici().size(); i++) {
            if (getUcenici().get(i).prosek() < 1.5) {
                ucenici.remove(i);
            }
        }
    }

    // drugi nacin izbacivanja elementa iz liste bez .remove;
    public void izbaci1() {
        ArrayList<Ucenik> lista = new ArrayList<>();
        for (Ucenik u : getUcenici()) {
            if (u.prosek() > 1.5) {
                lista.add(u);
            }
        }
        setUcenici(lista);
    }

    public int ukupnoNeopravdanih() {
    int suma = 0;
    for(Ucenik u:getUcenici()) {
        suma+=u.getNeopravdani();
    }
    return suma;
}
}
