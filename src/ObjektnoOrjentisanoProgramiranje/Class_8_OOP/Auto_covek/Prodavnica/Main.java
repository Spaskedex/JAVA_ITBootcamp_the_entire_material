package ObjektnoOrjentisanoProgramiranje.Class_8_OOP.Auto_covek.Prodavnica;


/*
Zadatak 3:
Napraviti klasu Namirnica koja ima naziv i cenu.
Napraviti klasu Korpa koja ima listu namernica i metodu za racunanje ukupne cene svih namernica.
Klasa mora imati adekvatan konstruktor I toString.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        Namirnica n1 = new Namirnica("Hleb", 50);
        Namirnica n2 = new Namirnica("Mleko", 120);
        Namirnica n3 = new Namirnica("Jogurt", 148);
        Namirnica n4 = new Namirnica("Zejtin", 169);
        Namirnica n5 = new Namirnica("Pasteta", 37);

        ArrayList<Namirnica> lista = new ArrayList<>();
        lista.add(n1);
        lista.add(n2);
        lista.add(n3);
        lista.add(n4);
        lista.add(n5);

        Korpa bag = new Korpa(lista);
        System.out.println(bag);
        System.out.println(bag.ukupnaCena());
    }
}
