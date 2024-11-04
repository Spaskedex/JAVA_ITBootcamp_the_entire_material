package Homework.Homework_10;

import java.util.ArrayList;

public class Pesnik extends Pisac{
    public Pesnik(String ime, int godRodjenja, ArrayList<Knjiga> listaKnjiga) {
        super(ime, godRodjenja, listaKnjiga);
    }

    public int brojZbirki() {
        int brojac = 0;
        for (Knjiga knjiga : super.getListaKnjiga()) {
            if (knjiga.getBrojStrana() < 100) {
                brojac++;
            }
        }
        return brojac;
    }
}
