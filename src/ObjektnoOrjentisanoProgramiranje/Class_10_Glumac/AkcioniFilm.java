package ObjektnoOrjentisanoProgramiranje.Class_10_Glumac;

public class AkcioniFilm extends Film{


    public AkcioniFilm(int godinaObjavljivanja, Glumac glumac, double ukupnaZarada) {
        super(godinaObjavljivanja, glumac, ukupnaZarada);
    }

    @Override
    public double troskovi(double troskovi1) {
        troskovi1 = getUkupnaZarada()*0.4;
        return troskovi1;
    }
}
