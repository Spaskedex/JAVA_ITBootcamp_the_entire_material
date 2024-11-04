package Practice_Projects.Practice_OOP_Zadatak3;
/*
Zadatak 3:
Napraviti klasu Ucenik koji ima kao atribute ime, broj neopravdanih I listu ocena.
Napraviti metodu:
- prosek() -> racuna ucenikov prosek
Napraviti klasu Skola koja ima listu ucenika i metode:
- vukovci() -> vraca listu djaka koji imaju prosek 5.0
- izbaci() -> izbacuje iz liste sve djake koji imaju prosek ispod 1.5
- ukupnoNeopravdanih() -> vraca sumu svih neopravdanih od ucenika
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ocene = new ArrayList<>();
        ArrayList<Integer> ocene1 = new ArrayList<>();
        ArrayList<Integer> ocene2 = new ArrayList<>();

        ocene.add(1);
        ocene.add(1);
        ocene.add(1);
        ocene1.add(5);
        ocene1.add(5);
        ocene1.add(5);
        ocene2.add(5);
        ocene2.add(4);
        ocene2.add(3);

        Ucenik u1 = new Ucenik("Dejan", 0, ocene1);
        Ucenik u2 = new Ucenik("Milan", 16, ocene);
        Ucenik u3 = new Ucenik("Jelena", 3, ocene2);

        ArrayList<Ucenik> ucenici = new ArrayList<>();
        ucenici.add(u1);
        ucenici.add(u2);
        ucenici.add(u3);
        Skola skola = new Skola(ucenici);
        System.out.println(skola);
        System.out.println("Ukupno neopravdanih: " + skola.ukupnoNeopravdanih());
        ArrayList<Ucenik> vukovci = skola.vukovci();
        System.out.println("Vukovci: " + vukovci);
        System.out.println(skola.vukovci());
        skola.izbaci();
        System.out.println(skola.getUcenici());
        System.out.println("Ukupno neopravdanih: " + skola.ukupnoNeopravdanih());







    }
}
