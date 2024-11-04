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

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> listaOcena = new ArrayList<>();
        listaOcena.add(5);
        listaOcena.add(5);
        listaOcena.add(5);
        listaOcena.add(5);
        listaOcena.add(5);
        listaOcena.add(5);
        listaOcena.add(5);
        listaOcena.add(5);
        listaOcena.add(5);
        listaOcena.add(5);


        Ucenik osnovac = new Osnovac("Ruzica", 1000, listaOcena, 0 );
        Ucenik srednjoskolac = new SrednjoSkolac("Adam", 3000,listaOcena, 0);
        Ucenik student = new Student("Marija", 5000, listaOcena, 0);

        System.out.println(osnovac);
        System.out.println(srednjoskolac);
        System.out.println(student);
        System.out.println("Ukupna cena za osnovce je: " + osnovac.cenaSkolovanja());
        System.out.println("Ukupna cena za srednjoskolce je: " + srednjoskolac.cenaSkolovanja());
        System.out.println("Ukupna cena za studente je: " + student.cenaSkolovanja() + "ukor: " + student.zaUkor());

    }
}
