package ObjektnoOrjentisanoProgramiranje.Class_11_Skola;

import java.util.ArrayList;

public class Student extends Ucenik{
    public Student(String ime, double fiksnaCenaSkolovanja, ArrayList<Integer> listaOcena, int brojNeopravdanih) {
        super(ime, fiksnaCenaSkolovanja, listaOcena, brojNeopravdanih);
    }

    @Override
    public double cenaSkolovanja() {
        double cena = getFiksnaCenaSkolovanja()+(getFiksnaCenaSkolovanja()*0.30);
        return cena;
    }

    /*
    public double cenaSkolovanja() {
        return getFiksnaCenaSkolovanja*1.30;
    }
     */
}
