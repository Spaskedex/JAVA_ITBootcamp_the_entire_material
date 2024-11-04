package Homework.Homework_10;

import java.util.ArrayList;

public class Romanopisac extends Pisac{
    public Romanopisac(String ime, int godRodjenja, ArrayList<Knjiga> listaKnjiga) {
        super(ime, godRodjenja, listaKnjiga);
    }
    public void dugometrazniRoman(ArrayList<Knjiga> knjige) {
        for(Knjiga k:getListaKnjiga())
        if (k.getBrojStrana() > 500) {
            System.out.println("Dugometražni roman");
        } else {
            System.out.println("Nije dugometražni roman");
        }
    }

}
