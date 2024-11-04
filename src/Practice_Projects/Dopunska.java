package Practice_Projects;


/*
1. Izbroj koliko puta se javlja slovo 'a' u unetom stringu.
 */

import java.util.Scanner;

public class Dopunska {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] niz = {1,2,3,4,5,6,7,8,9,10,};
        int[] niz2 = {11, 22, 33, 44, 55};
        String[] nizString = new String[10];


        String[] array1 = {"Elephant", "Horse", "Rabit", "Zevra", "Tiktok", "Dracula", "Ajkula", "Lion", "Wolf", "Tiktok", "Tiktok"};
        String[] array2 = {"Tiktok", "Lion", "Girafa", "Wolf", "Facebook"};
        String[] array3 = {"Mouse", "String", "Giros", "Wolfenstein", "Facedefect"};
        String rec = "Tiktok";
        String myStr = "Hello, World!";

        stampaj(saberiNizove(array2, array3));

        nalaziSe(array2, array1);


    }

    /*
        Zadatak 1:
Nadji minimum u nizu brojeva i vratiti ga.
     */

    public static int vratiMinimum(int[] niz) {
        int min = niz[0];
        for(int i =1; i<niz.length; i++) {
            if(min > niz[i]) {
                min=niz[i];
            }
        }
        return min;
    }


    /*
    Zadatak 2:
Sabrati dva niza String-ova.
     */

    // --- void metode koristimo kada ne zelimo da sacuvamo neku konkretnu vrednost u memoriji, kada nesto treba da se uradi;
    // ---void je proces dok odredjen tip metode vraca neku odredjenu vrednost u memoriju;

    public static String[] saberiNizove(String[] niz1, String[] niz2) {
        String[] rezultat = new String[niz1.length+niz2.length];

        for(int i=0; i< niz1.length; i++) {
            rezultat[i]=niz1[i];
        }
        int j=0;
        for(int i =niz1.length; i<rezultat.length; i++) {
            rezultat[i] = niz2[j];
            j++;
        }
        return rezultat;
    }


    /*
    Zadatak 3:
Napraviti niz imena i proveriti Koliko se puta svako ime iz prvog niza nalazi u drugom nizu.
     */
    // *** Ugnjezdena FOR petlja : u prvoj for petlji svaka iteracija dovodi do kompletnog niza iteracija ugnjezdene for petlje;
    //     i tako za svaku narednu iteraciju prve for petlje sve iteracije ugnjezdene do konacnog izvrsenja uslova glavne for petlje;


    public static void nalaziSe(String[] niz1, String[] niz2) {

        for(int i=0; i<niz1.length; i++) {
            String trenutnoIme = niz1[i];
            int brojac=0;
            for(int j=0; j<niz2.length; j++) {
                if (trenutnoIme.equalsIgnoreCase(niz2[j])) {
                    brojac++;
                }
            }
            System.out.println("Ime " + trenutnoIme + " se nalazi ovoliko puta " + brojac);
        }
    }









    public static void stampaj(String[] niz) {
        for(int i=0; i<niz.length; i++) {
            System.out.println(niz[i]);
        }
    }

    public static void isDigit(String[] args) {
        // Defining the characters -- konvertuje 'char' u int;
        char a = 'C', b = '9';

        // Applying the isDigit() function
        System.out.println(a + " is a digit : " + Character.isDigit(a));
        System.out.println(b + " is a digit : " + Character.isDigit(b));
    }


}
