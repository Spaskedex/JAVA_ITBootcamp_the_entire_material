package ObjektnoOrjentisanoProgramiranje.TEST_JAVA_OOP;

import java.util.ArrayList;

/*
Napraviti klasu Amater koji nasledjuje klasu Planinar.
 */
public class Amater extends Planinar{
    public Amater(ArrayList<Planina> listaPlanina, double maxUspon) {
        super(listaPlanina, maxUspon);
    }

    @Override
    public void izbaci() {
        super.izbaci();
    }

    @Override
    public ArrayList<Planina> opasne() {
        return super.opasne();
    }

    @Override
    public void dodaj(Planina p) {
        super.dodaj(p);
    }

    @Override
    public Planina najveca() {
        return super.najveca();
    }
}
