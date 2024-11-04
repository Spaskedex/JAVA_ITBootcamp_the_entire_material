package Homework.Homework_11;
/*
Napraviti klasu FudbalskiKlub koja nasleđuje klasu Klub, i dodati metodu:
- najboljiStrelac() -> vraca ime igraca sa najvise postignutih golova (golove cemo interpretirati kao postignute poene).
za fudbalski tim racunamo
 da igrac vredi po 1000 za svaki postignut gol
 */

import java.util.ArrayList;

public class FudbalskiKlub extends Klub{


    public FudbalskiKlub(String naziv, String grad, ArrayList<Igrac> igraci) {
        super(naziv, grad, igraci);
    }

    @Override
    public String odbrambeniAs() {
        return "";
    }

    @Override
    public double vrednostTima() {
        double vrednost = 0;
        for (Igrac i: getIgraci()) {
            vrednost += i.getPoeni()*1000;
        }
        return vrednost;
    }

    @Override
    public String sampionTima() {
        return "";
    }
    @Override
    public String najboljiStrelac() {
        Igrac strelac = getIgraci().get(0);
        for (Igrac i: getIgraci()) {
            if (strelac.getPoeni()<i.getPoeni()) {
                strelac=i;
            }
        }
        return strelac.getIme();
    }
}
