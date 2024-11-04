package ObjektnoOrjentisanoProgramiranje.Class_10_Glumac;

public class Romantika extends Film{

    public Romantika(int godinaObjavljivanja, Glumac glumac, double ukupnaZarada) {
        super(godinaObjavljivanja, glumac, ukupnaZarada);
    }

    @Override
    public double troskovi(double troskovi1) {
        troskovi1 = getUkupnaZarada()*0.1;
        return troskovi1;
    }
}
