package Homework.Homework_11;
/*
Napraviti klasu KosarkaskiKlub koja nasleđuje klasu Klub, i dodati specifičnu metodu:
- sampionTima() -> vraća ime igraca koji ima više od 1000 postignutih poena.
vrednostTima() -> za kosarkaski tim racunamo da igrac vredi 50 za svaki postignut poen
 */

import java.util.ArrayList;

public class KosarkaskiKlub extends Klub{
    public KosarkaskiKlub(String naziv, String grad, ArrayList<Igrac> igraci) {
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
            vrednost += i.getPoeni()*50;
        }
        return vrednost;
    }

    @Override
public String sampionTima() {
        Igrac sampion = getIgraci().get(0);
        for (Igrac i: getIgraci()) {
            if(sampion.getPoeni()>1000) {
                sampion=i;
            }
        }
        return sampion.getIme();
    }

    @Override
    public String najboljiStrelac() {
        return "";
    }


}
