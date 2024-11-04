package ObjektnoOrjentisanoProgramiranje.Class_11_Skola;

/*
Zadatak 2:
Napraviti klasu Ucenik koji ima kao atribute ime, fiksna cena skolovanja, listu ocena I broj neopravdanih.
Napraviti metode:
- zaUkor() -> vraca true ili false u zavisnosti od toga da li djak ispunjava neke uslove za ukor
(da li ima vise od 10 nepravdanih ili ako ima vise od 10 jedinica).
- cenaSkolovanja() -> vraca punu cenu skolovanja ako racunamo da pored vec fiksnih troskova imamo I druge troskove koji
iznose 15% od fiksne cene skolovanja
Klasa Osnovac nasledjuje klasu Ucenik.
Klasa SrednjoSkolac nasledjuje klasu Ucenik I on ima 25% dodatnih troskova.
Klasa Student nasledjuje klasu Ucenik I on ima 30% dodatnih troskova.
 */

import java.util.ArrayList;

public abstract class Ucenik {

    private String ime;
    private double fiksnaCenaSkolovanja;
    private ArrayList<Integer> listaOcena;
    private int brojNeopravdanih;

    public Ucenik(String ime, double fiksnaCenaSkolovanja, ArrayList<Integer> listaOcena, int brojNeopravdanih) {
        this.ime=ime;
        this.fiksnaCenaSkolovanja=fiksnaCenaSkolovanja;
        this.listaOcena=listaOcena;
        this.brojNeopravdanih=brojNeopravdanih;
    }
    public String toString() {
        return "Ucenik: " + ime + ", Skolarina: " + fiksnaCenaSkolovanja + "; Ocene: " + listaOcena + "; neopravdanih casova: " + brojNeopravdanih + "!";
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String novoIme) {
        this.ime=novoIme;
    }
    public double getFiksnaCenaSkolovanja() {
        return fiksnaCenaSkolovanja;
    }
    public void setFiksnaCenaSkolovanja(double novaCena) {
        this.fiksnaCenaSkolovanja=novaCena;
    }
    public ArrayList<Integer> getListaOcena() {
        return listaOcena;
    }
    public void setListaOcena(ArrayList<Integer> novaListaOcena) {
        this.listaOcena=novaListaOcena;
    }
    public int getBrojNeopravdanih() {
        return brojNeopravdanih;
    }
    public void setBrojNeopravdanih(Integer noviNeopravdani) {
        this.brojNeopravdanih=noviNeopravdani;
    }

    private int prebrojKeceve() {
        int brojac=0;
        for(Integer i:getListaOcena()) {
            if(i==1) {
                brojac++;
            }
        }
        return brojac;
    }

    public boolean zaUkor() {
        if(getBrojNeopravdanih()>10 || prebrojKeceve()>10) {
            return true;
        }
        return false;
    }
    public double cenaSkolovanja() {
     double cena = getFiksnaCenaSkolovanja()+(getFiksnaCenaSkolovanja()*0.15);
    return cena;
    }


}
