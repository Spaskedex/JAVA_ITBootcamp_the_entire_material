package ObjektnoOrjentisanoProgramiranje.Class_11_Bolnica;

public class Pedijatar extends Doktor{
    public Pedijatar(String ime, int brojPacijenata, int godineZaposlenja) {
        super(ime, brojPacijenata, godineZaposlenja);
    }

    @Override
    public double plata() {
        double ukupnaPlata = getBrojPacijenata()*150;
        return ukupnaPlata;
    }

    /*
    ili krace:
    public double plata() {
        return getBrojPacijenata()*150;
    }
     */
}
