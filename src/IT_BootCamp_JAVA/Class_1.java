package IT_BootCamp_JAVA;

public class Class_1 {
    // Java - je sekvencionalni jezik, izvrsava se svaka linija koda redom jedna po jedna
    int ceoBroj; // Deklaracija promenljive - kreiranje promenljive bez dodele vrednosti;
    //ceoBroj = 5; // Inicijalizacija promenljive - dodela vrednosti kreirane promeljive;
    int ceoBroj1 = -7; // Deklaracija i Inicijalizacija promenljive odjednom, prirodni broj;

    double realanBroj = 5.341; // Realan broj;

    char karakter = 'A'; // jedan karakter

    boolean logickiTip = 5==2; // logickiTip = false, moze biti true or false,boolean logicka provera istinitosti;

    String text = "Ovo je neki tekst 2!"; // String je znakovni niz;

        /* Aritmeticki operatori:
        + sabiranje
        - oduzimanje
        * mnozenje
        / deljenje
        % ostatak prilikom deljenja
        = dodela vrednosti
        == provera jednakosti
        ++ inkrement, uvecava promenljivu za po 1 (a++ daje uvecanje promenljive a za 1);
        imaju dve vrste inkrementa : ++a prvo poveca vrednost pa stampa, a++ prvo stampa na izlazu pa uvecava a za 1;
        -- dekrement , smanjuje promenljivu za 1;
        a++ Postfiksni inkrement
        ++a prefiksni inkrement
         */

        /* Operatori skracivanja , pridruzivanja:
        int broj = 1;
        broj = broj + 5;  int broj uvecavamo za 5
        broj+= 5 je isto samo skraceno od broj = broj + 5 ;
        broj-= 7  == broj = broj - 7
        broj*=2 == broj = broj * 2;
        broj/=2 == broj = broj / 2;

            Operatori poredjenja:
        5 > 2 operator vece;
        2 < 5 manje;
        5>=5 vece-jednako;
        5<= manje-jednako;
        5 == 5 provera jednakosti
        !  - najcesce ima ulogu negacije i znaci obrnuto od onoga sto je napisano u nastavku;
        5!=4 proveravamo nejednakost;
         */

        /* Operacije sa Stringovima:
        + Konkatenacija (spaja dva stringa) "string1" + "string2" = string1string2
        .toLowerCase() sva slova ravna i stavlja u mala;
        .toUperCase()  sva slova pretvara u Velika slova;
        *Poredimo stringove equals metodom :

        System.out.println(txt1.equals(txt1);  *daje true

        System.out.println(txt1.equals(txt2)   *daje false

        System.out.println(txt1.equalsIgnoreCase(txt2))    *equals ignorise razlike u velicini slova;

        System.out.println(!(txt1.equalsIgnoreCase(txt2)))   ! uzvicnik pre zagrade u koju smestimo
        ceo izraz equals negira izraz
         */

}
