package ObjektnoOrjentisanoProgramiranje.TEST_JAVA_OOP;

import ObjektnoOrjentisanoProgramiranje.Class_11_Skola.SrednjoSkolac;

import java.util.ArrayList;

/*
Napraviti klasu Planinar
atributi:lista planina, max uspon(maksimalna visina na koju taj planinar moze da se popne)
Metode: -dodaj(Planina p) -> ubacuje datu planinu u listu ukoliko je njena visina manja ili jednaka max usponu
	-opasne() -> metoda vraca listu planina koje su opasne za penjanje
 	-izbaci() -> izbacuje planinu iz liste ukoliko je veca od max uspona nekog planinara ili ako je opasna
	-najveca()-> vraca najvecu planinu iz planinarove liste
 */
public class Planinar {

    private ArrayList<Planina> listaPlanina;
    private double maxUspon;


    public Planinar(ArrayList<Planina> listaPlanina, double maxUspon) {
        this.listaPlanina = listaPlanina;
        this.maxUspon = maxUspon;
    }
    public String toString() {
        return "Lista planina: " + listaPlanina + "; maksimalna visina: " + maxUspon + "m;";
    }

    public ArrayList<Planina> getListaPlanina() {
        return listaPlanina;
    }

    public double getMaxUspon() {
        return maxUspon;
    }

    public void setListaPlanina(ArrayList<Planina> listaPlanina) {
        this.listaPlanina = listaPlanina;
    }

    public void setMaxUspon(double maxUspon) {
        this.maxUspon = maxUspon;
    }
    public void dodaj(Planina p) {
        for(Planina i: getListaPlanina()) {
            if(p.getVisina()<=getMaxUspon()) {
                listaPlanina.add(p);
            }
        }
    }
    public ArrayList<Planina> opasne() {
        ArrayList<Planina> opasne = new ArrayList<>();
        for(Planina p: getListaPlanina()) {
            if(p.getVisina()>getMaxUspon()) {
                opasne.add(p);
            }
        }
        return opasne;
    }
    public void izbaci() {
        for(int i=getListaPlanina().size()-1; i>=0; i--){
            if(getListaPlanina().get(i).getVisina()>=getMaxUspon() || getListaPlanina().get(i).isOpasnost()) {
                getListaPlanina().remove(i);
            }
        }
    }
    public Planina najveca() {
        Planina najvisa = getListaPlanina().get(0);
        for(Planina p: getListaPlanina()) {
            if(najvisa.getVisina()<p.getVisina() && najvisa.getVisina()<getMaxUspon()) {
                najvisa=p;
            }
        }
        return najvisa;
    }
}
