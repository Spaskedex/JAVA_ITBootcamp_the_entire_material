package Practice_Projects.Practice_OOP_Zadatak1;

import java.util.ArrayList;

public class Stan extends Nekretnina{
    public Stan(double kvadratura, double cenaKvadrat, ArrayList<Double> listaPonuda) {
        super(kvadratura, cenaKvadrat, listaPonuda);
    }

    @Override
    public double cena() {
        double cena=0;
        if(super.getKvadratura()<=100) {
            cena=getKvadratura()*getCenaKvadrat();
        }
        if(getKvadratura()>100) {
            cena=getKvadratura()*getCenaKvadrat()*0.85;
        }
        return cena;
    }
}
