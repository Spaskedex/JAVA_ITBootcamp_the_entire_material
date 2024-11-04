package Practice_Projects.Practice_OOP_Zadatak3;
/*
Zadatak 3:
Napraviti klasu Ucenik koji ima kao atribute ime, broj neopravdanih I listu ocena.
Napraviti metodu:
- prosek() -> racuna ucenikov prosek
Napraviti klasu Skola koja ima listu ucenika i metode:
- vukovci() -> vraca listu djaka koji imaju prosek 5.0
- izbaci() -> izbacuje iz liste sve djake koji imaju prosek ispod 1.5
- ukupnoNeopravdanih() -> vraca sumu svih neopravdanih od ucenika
 */

import java.util.ArrayList;

public class Ucenik {
    private String ime;
    private int neopravdani;
    private ArrayList<Integer> ocene;


    public Ucenik(String ime, int neopravdani, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.neopravdani = neopravdani;
        this.ocene = ocene;
    }
    public String toString() {
        return "Ucenik: " + ime + ", neopravdani: " + neopravdani + "; ocene: " + ocene;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setNeopravdani(int neopravdani) {
        this.neopravdani = neopravdani;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }

    public String getIme() {
        return ime;
    }

    public int getNeopravdani() {
        return neopravdani;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }
    public double prosek() {
        double prosek = 0;
        for (Integer d: getOcene()) {
            prosek+=d;
        }
        return prosek/getOcene().size();
    }
}
