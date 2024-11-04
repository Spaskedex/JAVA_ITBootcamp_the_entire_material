package ObjektnoOrjentisanoProgramiranje.Class_11_Bolnica;

public class Hirurg extends Doktor{
    public Hirurg(String ime, int brojPacijenata, int godineZaposlenja) {
        super(ime, brojPacijenata, godineZaposlenja);
    }


    @Override
    public double plata() {
        double ukupno = getBrojPacijenata()*230;
        return ukupno;
    }

    /*
    ili krace:
    public double plata() {
        return getBrojPacijenata()*230;
    }
     */
}
