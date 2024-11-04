package ObjektnoOrjentisanoProgramiranje.Class_9_Zadatak3;


/*
Zadatak 3:
Napraviti klasu Knjiga koja ima od atributa naziv, broj strana,godinu izdanja i cenu.
Napraviti metodu:
-popust() -> ako je duzina knjige veca od 300 strana, umanjiti za 20%
-oldTimer() -> ako je knjiga starija od 20 godina, ispisati poruku da je u pitanju stara knjiga
 */

public class Main {
    public static void main(String[] args) {

        Knjiga knjiga1 = new Knjiga("Desperados", 549, 1952, 999.99);

        System.out.println(knjiga1);

        knjiga1.popust();
        System.out.println("Trenutna cena knjige: " + knjiga1.getCena());

        knjiga1.oldTimer();

    }
}
