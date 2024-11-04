package ObjektnoOrjentisanoProgramiranje.TEST_JAVA_OOP;
/*
Napraviti klasu Pro koji nasledjuje klasu Planinar koji iz svoje liste izbacuje samo planine koje su vece od njegovog maxUspon-a.
 */

import java.util.ArrayList;

public class Pro extends Planinar{



    private double maxUsponPro;
    public Pro(ArrayList<Planina> listaPlanina, double maxUspon, double maxUsponPro) {
        super(listaPlanina, maxUspon);
        this.maxUsponPro=maxUspon;
    }

    @Override
    public void izbaci() {
        for(int i=getListaPlanina().size()-1; i>=0; i--){
            if(getListaPlanina().get(i).getVisina()>=getMaxUsponPro()) {
                getListaPlanina().remove(i);
            }
        }
    }

    @Override
    public void dodaj(Planina p) {
        super.dodaj(p);
    }

    @Override
    public ArrayList<Planina> opasne() {
        return super.opasne();
    }

    @Override
    public Planina najveca() {
        return super.najveca();
    }

    public double getMaxUsponPro() {
        return maxUsponPro;
    }
}
