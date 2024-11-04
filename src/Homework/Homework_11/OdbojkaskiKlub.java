package Homework.Homework_11;
/*
Napraviti klasu OdbojkaškiKlub koja nasleđuje klasu Klub, i dodati metodu:
- odbrambeniAs() -> vraća ime igrača koji ima najvise poena, ali je igrao manje od 3 godine.
za odbojkaski tim svaki igrac vredi 100 po poenu.
 */

import java.util.ArrayList;

public class OdbojkaskiKlub extends Klub{

    public OdbojkaskiKlub(String naziv, String grad, ArrayList<Igrac> igraci) {
        super(naziv, grad, igraci);
    }
    @Override
    public String odbrambeniAs() {
        Igrac as = getIgraci().get(0);
        for(Igrac i: getIgraci()) {
            if((as.getPoeni()>i.getPoeni()) && (as.getIskustvo()<3) ) {
                as=i;
            }
        }
        return as.getIme();
    }

    @Override
    public double vrednostTima() {
        double vrednost = 0;
        for (Igrac i: getIgraci()) {
            vrednost += i.getPoeni()*100;
        }
        return vrednost;
    }

    @Override
    public String sampionTima() {
        return "";
    }

    @Override
    public String najboljiStrelac() {
        return "";
    }
}
