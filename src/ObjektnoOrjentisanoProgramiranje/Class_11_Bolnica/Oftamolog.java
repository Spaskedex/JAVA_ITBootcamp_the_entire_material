package ObjektnoOrjentisanoProgramiranje.Class_11_Bolnica;

public class Oftamolog extends Doktor{
    public Oftamolog(String ime, int brojPacijenata, int godinaZaposlenja) {
        super(ime, brojPacijenata, godinaZaposlenja);
    }

    @Override
    public double plata() {
        double ukupno = getBrojPacijenata()*100;
        return ukupno;
    }
}
