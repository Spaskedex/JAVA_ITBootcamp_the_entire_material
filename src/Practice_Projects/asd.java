package Practice_Projects;




import java.sql.SQLOutput;
import java.util.Scanner;

public class asd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        1. Izbroj koliko puta se javlja slovo 'a' u unetom stringu.
         */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Unesite string: ");
//        String array = sc.nextLine();
//        int brojac = 0;
//        for(int i=0; i<array.length(); i++) {
//        char slovo = array.charAt(i);
//        if( slovo == 'a' || slovo == 'A') {
//            brojac++;
//        }
//        }
//        System.out.println("Slovo 'a' se pojavljuje " + brojac + " puta.");


        /*
      2.Izbroj koliko se samoglasnika nalazi u unetom string;
        */
//        System.out.println("Unesite string:");
//        String rec = sc.nextLine();
//        rec = rec.toLowerCase();
//        int brojac = 0;
//        for (int i = 0; i<rec.length(); i++) {
//            char samoglasnici = rec.charAt(i);
//            if(samoglasnici == 'a' || samoglasnici == 'e' || samoglasnici == 'i' || samoglasnici == 'o' || samoglasnici == 'u') {
//                brojac++;
//            }
//        }
//        System.out.println("Samoglasnika ima " + brojac);

        /*
        3. * Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca sumu svih elemenata niza
         */
//        System.out.println("Unesite duzinu niza:");
//        int duzina = sc.nextInt();
//        int[] niz = new int[duzina];
//        int suma = 0;
//        for (int i=0; i<duzina; i++) {
//            System.out.println("Unesite brojeve niza:");
//            niz[i] = sc.nextInt();
//            suma+=niz[i];
//        }
//        System.out.println("Suma svih brojeva je: " + suma);


        /*
        4. * Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca maksimalni element u nizu
         */

//        System.out.println("Unesite duzinu niza:");
//        int duzina = sc.nextInt();
//        int[] niz = new int[duzina];
//        int maxBr = 0;
//        for(int i=0; i<duzina; i++) {
//            System.out.println("Unesite brojeve niza:");
//            niz[i] = sc.nextInt();
//            if(maxBr < niz[i]) {
//                maxBr = niz[i];
//            }
//        }
//        System.out.println("Najveci broj niza je: " + maxBr);



        /*
            5. Napisati program koji trazi od korisnika da unese niz celih brojeva,
            pronalazi minimalni i maksimalni element u nizu i racuna kvadrat njihove razlike.
         */

        System.out.println("Duzina niza:");
        int duzinaN = sc.nextInt();
        int[] nizN = new int[duzinaN];
        System.out.println("Unesite prvi broj niza:");
        nizN[0] = sc.nextInt();
        int maxEl=nizN[0];
        int minEl=nizN[0];

        for(int i = 0; i<(duzinaN-1); i++) {
            System.out.println("Unesite sledeci broj niza:");
            nizN[i] = sc.nextInt();

            if (maxEl<nizN[i]) {
                maxEl=nizN[i];
            }
            if(minEl>nizN[i]) {
                minEl = nizN[i];
            }
        }
        System.out.println("Max el = " + maxEl + " min el =" + minEl);
        System.out.println("Kvadrat njihove razlike je: " + Math.pow((maxEl-minEl), 2));


        /*
        6. Napisati program koji trazi od korisnika da unese niz celih brojeva, zatim vraca odgovor da li je veca
        apsolutna vrednost zbira pozitivnih brojeva ili apsolutna vrednost zbira negativnih brojeva.
        Funkcija za dobijanje apsoultne vrednosti broja je: Math.abs(broj).
         */

}
}
