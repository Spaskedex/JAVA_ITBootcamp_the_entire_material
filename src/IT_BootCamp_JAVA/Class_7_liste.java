package IT_BootCamp_JAVA;

/*
    -- Liste :  ArrayList<>   --  ArrayList<Integer> , ArrayList<Double> , ArrayList<Boolean>
    // Integer je wrapper klasa on int koju java obavije da ga pretvori iz prostog u slozen tip;
    -- Liste spadaju u dinamicke strukture podataka i nije potrebno unapred zauzeti memorijski prostor definisanjem duzine liste
        vec se ona dinamicno menja sa ubacivanjem novih elemenata; Indexiranje lista je identicno indexiranju u nizovima;
    -- Nizovi spadaju u staticke strukture i potrebno je unapred definisati koji memorijski prostor ce zauzeti (int[] niz = new int[10]; npr);
 */


import java.util.ArrayList;

public class Class_7_liste {
    public static void main(String[] args) {

    //    ArrayList<Integer> lista = new ArrayList<>();

     //   lista.add(5);    // ugradjena metoda ubacivanje elemenata u listu i uvek ubacuje sledeci na poslednje mesto u listi;
     //   lista.add(7);
     //   lista.add(-1);
     //   System.out.println(lista);

     //   lista.get(0);    //   niz[i]   uzimanje odredjenog elementa iz niza; dok je u listama lista.get(0)  u zagradi index (mesto u listi);
     //   lista.size();    //   vraca velicinu liste, tj broj elemenata;
     //   System.out.println(lista.size());

     //   lista.isEmpty();     // provera da li je lista prazna, vraca true ukoliko je lista prazna odnosno false ako ima neki element;

     //   lista.remove(2);   // uklanja mesto iz liste na osnovu indexa i automatski pomera sve elemente koji su u listi iza za jedno mesto napred,
                                    // menja index niza clanovima koji su se nalazili posle uklonjenog elementa, ona se primarno koristi;
    //    lista.remove(object, o);  // uklanja konkretan element iz liste, odnosno prvi takav na koji naidje iz liste, ne preporucuje se-nepredvidiva;

     //   lista.contains(5);    // provera da li se odredjeni element nalazi u strukturi liste;

     //   lista.add(1, 6);    // npr. ubacuje element na odredjeno mesto index 1 element 6;
  //      lista.addAll();        // dodaje unapred pripremljenu celu listu ili niz ...;


        /*
        Zadatak 1:
Napraviti listu i ubaciti u nju sve parne brojeve koji su deljivi sa 3.
         */

        ArrayList<Integer> lista = new ArrayList<>();

        for(int i=1; i<30; i++) {
            if(i%3==0 && i%2==0) {
                lista.add(i);

            }
        }
        System.out.println(lista);
        // dopuna zadatka: izbaci sve elemente deljive sa 4;
        for(int i=0; i<lista.size(); i++) {
            if(lista.get(i)%4==0) {
                lista.remove(i);
            }
        }
        System.out.println(lista);


        /*
        Zadatak 2:
a)Napraviti listu brojeva od 1 do 50 koji su deljivi sa 7.
b)Proci kroz tu listu i izbaciti sve elemente koji su deljivi sa 3.
         */
        ArrayList<Integer> lista1 = new ArrayList<>();
        for(int i =1; i<=50; i++) {
            if(i%7==0) {
                lista1.add(i);
            }
        }
        System.out.println(lista1);
        for(int i=0; i<lista1.size(); i++) {
            if(lista1.get(i)%3==0) {
                lista1.remove(i);
            }
        }
        System.out.println(lista1);


    }
}
