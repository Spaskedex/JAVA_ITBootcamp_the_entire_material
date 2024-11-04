package Practice_Projects.Practice_OOP_Zadatak1;

import java.util.ArrayList;

public class Lokal extends Nekretnina{
    public Lokal(double kvadratura, double cenaKvadrat, ArrayList<Double> listaPonuda) {
        super(kvadratura, cenaKvadrat, listaPonuda);
    }

    @Override
    public double cena() {
        double cena=0;
        if(super.getKvadratura()<=250) {
            cena=getKvadratura()*getCenaKvadrat();
        }
        if(getKvadratura()>250) {
            cena=getKvadratura()*getCenaKvadrat()*0.75;
        }
        return cena;
    }
}
