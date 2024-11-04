package ObjektnoOrjentisanoProgramiranje.TEST_JAVA_OOP;
/*
Napraviti klasu Rekreativac koji nasledjuje klasu Planinar.
 */
import java.util.ArrayList;

public class Rekreativac extends Planinar{
    public Rekreativac(ArrayList<Planina> listaPlanina, double maxUspon) {
        super(listaPlanina, maxUspon);
    }

    @Override
    public void izbaci() {
        super.izbaci();
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
}
