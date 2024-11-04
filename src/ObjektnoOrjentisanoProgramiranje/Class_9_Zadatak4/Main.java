package ObjektnoOrjentisanoProgramiranje.Class_9_Zadatak4;


/*
Zadatak 4:
Napraviti klasu Autor koji u sklopu ima ime, godinu rodjenja,ukupan broj prodanih dela i jednu knjigu.
Napraviti metodu:
-ranaObjava() -> ispisati poruku ako je autor objavio svoju knjigu pre 25 godine
-zarada() -> Koliko je zaradio ukupno para od svih prodanih dela ako racunamo da imaju isti cenu kao ta jedna knjiga
 */

public class Main {
    public static void main(String[] args) {

        Knjiga knjiga1 = new Knjiga("Dobro je", 2012, 999.99);

        Autor autor1 = new Autor("Brankica Damjanovic", 1972, 326875, knjiga1);

        System.out.println(knjiga1);
        System.out.println(autor1);


    }


}
