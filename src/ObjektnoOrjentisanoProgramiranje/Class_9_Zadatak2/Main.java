package ObjektnoOrjentisanoProgramiranje.Class_9_Zadatak2;


/*
Zadatak 2:
Napraviti klasu Radnik koja ima id, godinu zaposlenja i platu radnika.
Napraviti metodu koja racuna staz radniku i metodu koja daje povisicu za 20%
ukoliko se radnik tu nalazi vise od 5 godina, i povisicu od 40% ukoliko ima
staz duzi od 10 godina.
Napraviti adekvatan konstruktor, get i set metod, kao i toString.
 */

public class Main {
    public static void main(String[] args) {

        Radnik r = new Radnik(1234567890, 2013, 99999);

        System.out.println(r);

        System.out.println(r.staz());

        r.povisica();
        System.out.println("Plata nakon povisice: " + r.getPlata());

    }
}
