package Homework.Homework_10;

import java.util.ArrayList;

public class Eseista extends Pisac{
    public Eseista(String ime, int godRodjenja, ArrayList<Knjiga> listaKnjiga) {
        super(ime, godRodjenja, listaKnjiga);
    }

    public int kratkiEseji() {
        int brojac=0;
        for(Knjiga knjiga : super.getListaKnjiga()) {
            if(knjiga.getBrojStrana()<50) {
                brojac++;
            }
        }
        return brojac;
    }
}
