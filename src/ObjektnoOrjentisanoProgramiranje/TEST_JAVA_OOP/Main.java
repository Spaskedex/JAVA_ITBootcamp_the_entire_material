package ObjektnoOrjentisanoProgramiranje.TEST_JAVA_OOP;
/*
Napraviti klasu Planina
atributi: naziv(String), visina(double ili int) i opasnost(Boolean)
Napraviti klasu Planinar
atributi:lista planina, max uspon(maksimalna visina na koju taj planinar moze da se popne)
Metode: -dodaj(Planina p) -> ubacuje datu planinu u listu ukoliko je njena visina manja ili jednaka max usponu
	-opasne() -> metoda vraca listu planina koje su opasne za penjanje
 	-izbaci() -> izbacuje planinu iz liste ukoliko je veca od max uspona nekog planinara ili ako je opasna
	-najveca()-> vraca najvecu planinu iz planinarove liste
Napraviti klasu Rekreativac koji nasledjuje klasu Planinar.
Napraviti klasu Amater koji nasledjuje klasu Planinar.
Napraviti klasu Pro koji nasledjuje klasu Planinar koji iz svoje liste izbacuje samo planine koje su vece od njegovog maxUspon-a.
Za sve klase je potrebno deklarisati dati konstruktor, get,set i toString.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Planina p = new Planina("Vlasic", 1560, false);
        Planina p1 = new Planina("Cer", 2550, false);
        Planina p2 = new Planina("Stara Planina", 3650, true);
        Planina p3 = new Planina("Triglav", 4567, true);
        Planina p4 = new Planina("Durmitor", 3210, true);
        Planina p5 = new Planina("Planinica", 1236, false);
        ArrayList<Planina> planine = new ArrayList<>();
        planine.add(p);
        planine.add(p1);
        planine.add(p2);
        planine.add(p3);
        planine.add(p4);
        planine.add(p5);
        System.out.println(planine);
        Planinar rekreativac = new Rekreativac(planine, 1200);
        Planinar amater = new Amater(planine, 1888);
        Planinar pro = new Pro(planine, 4500, 5000);
        System.out.println();
        Planina zaDodavanje = new Planina("Kilimandzaro", 7896, true);
        rekreativac.dodaj(zaDodavanje);
       


        System.out.println("Rekreativac:" + rekreativac);
        System.out.println("Amater: " + amater);
        System.out.println("Pro: " + pro);
        System.out.println("Rekreativac - opasne: " + rekreativac.opasne());
        System.out.println("Amater opasne : " + amater.opasne());
        System.out.println("Pro opasne: " + pro.opasne());
        System.out.println("Najvisa planina: " + amater.najveca());

    }
}
