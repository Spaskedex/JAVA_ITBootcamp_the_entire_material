package Practice_Projects.Practice_OOP_Zadatak1;

import java.util.ArrayList;

public class Kuca extends Nekretnina{
    public Kuca(double kvadratura, double cenaKvadrat, ArrayList<Double> listaPonuda) {
        super(kvadratura, cenaKvadrat, listaPonuda);
    }

    @Override
    public double cena() {
        double cena=0;
        if(super.getKvadratura()<=200) {
            cena=getKvadratura()*getCenaKvadrat();
        }
        if(getKvadratura()>200) {
            cena=getKvadratura()*getCenaKvadrat()*0.8;
        }
        return cena;
    }
}
