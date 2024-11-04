package Practice_Projects;

import java.util.concurrent.LinkedTransferQueue;

public class Practice_PripremaZaTest {
    public static void main(String[] args) {

               /*
        Zadatak 1:
Napraviti metodu koja prima niz brojeva i kao rezultat vraca najveci broj iz tog niza.
         */

//        int[] niz = {15, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        pronadjiMax(niz);
//        System.out.println(pronadjiMax(niz));
//
//    }
//    public static int pronadjiMax(int[] niz) {
//        int max = Integer.MIN_VALUE;
//        int max = niz[0];
//        for (int i = 1; i < niz.length; i++) {
//            if (niz[i] > max) {
//                max = niz[i];
//            }
//        }
//        return max;
//    }
//}


       /*
    Zadatak 2:
Napraviti metodu koja prima niz String-ova i jos jedan String, vraca true ukoliko se ta rec nalazi u tom nizu.
     */

//        String[] stringNiz = {"avion","zirafa", "slonche", "karamelica"};
//        String rec = "slonche";
//        proveraReci(stringNiz, rec);
//                System.out.println(proveraReci(stringNiz, rec));
//
//        }
//public static boolean proveraReci(String[] strNiz, String rec) {
//
//    for(int i=0; i<strNiz.length; i++ ) {
//        if(strNiz[i].equalsIgnoreCase(rec)) {
//            return true;
//        }
//
//    }
//    return false;
//    }
//}


        /*
        Zadatak 3:
Napraviti metodu koja prima neki niz brojeva i racuna sumu svih parnih brojeva.
         */

//        int[] niz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        suma(niz);
//        System.out.println(suma(niz));
//
//
//    }
//    public static int suma(int[] nizBr) {
//        int sum = 0;
//        for(int i =0; i<nizBr.length; i++) {
//            if(nizBr[i]%2==0) {
//                sum+=nizBr[i];
//            }
//        }
//        return sum;
//    }
//}

        /*
        Zadatak 4:
Napraviti metodu koja prima niz Stringova i vraca najduzi String iz niza.
         */

//        String[] nizStringova1 = {"Stampedo", "Integer", "Avokado", "Track", "Run", "Kolabolacionista", "Multileveldamageonceagain"};
//        najduziString(nizStringova1);
//        System.out.println(najduziString(nizStringova1));
//
//    }
//    public static String najduziString (String[] stringNiz) {
//        String duzinaStringa = stringNiz[0];
//        for ( int i = 0; i < stringNiz.length; i++) {
//            if(stringNiz[i].length() > duzinaStringa.length()  ) {
//                duzinaStringa = stringNiz[i];
//            }
//        }
//        return duzinaStringa;
//    }
//}

        /*
   Zadatak 5:
Napraviti metodu koja prima dva niza istih duzina i sabire ih.
         */

//        int[] nizPrvi = {1,2,3,4,5,6,7,8,9,0};
//        int[] nizDrugi = {5,6,7,8,9,10,1,2,3,4};
//        zbirNizova(nizPrvi, nizDrugi);
//        stampajNiz(zbirNizova(nizPrvi, nizDrugi));
//    }
//
//    public static void stampajNiz(int[] niz) {
//        for(int i=0; i<niz.length; i++) {
//            System.out.println(niz[i]);
//        }
//    }
//        public static int[] zbirNizova (int[] niz1, int[] niz2) {
//        int[] nizZbir = new int[niz1.length];
//        for(int i=0; i<niz1.length; i++) {
//            nizZbir[i] = niz1[i] + niz2[i];
//        }
//        return nizZbir;
//        }
//}


        /*
        Zadatak 6:
Napraviti metodu koja prima dva niza razlicitih duzina i sabire ih.
         */

//        int[] niz1 = {1, 2, 3, 4, 5, 6, 7, 8};
//        int[] niz2 = {4, 5, 6, 7};
//
//        stampaj(razlNizoviZbir(niz1, niz2));
//
//
//}
//    public static void stampaj(int[] niz) {
//        for (int i = 0; i < niz.length; i++) {
//            System.out.println(niz[i]);
//        }
//    }

//    public static int[] razlNizoviZbir(int[] niz1, int[] niz2) {
//
//        int[] nizDuzi;
//        int[] nizKraci;
//
//        if (niz1.length > niz2.length) {
//            nizDuzi = niz1;
//            nizKraci = niz2;
//        } else {
//            nizKraci = niz1;
//            nizDuzi = niz2;
//        }
//        int[] rezultatZbira = new int[nizDuzi.length];
//
//        for (int i = 0; i < nizDuzi.length; i++) {
//            if(i<nizKraci.length) {
//                rezultatZbira[i] = nizDuzi[i] + nizKraci[i];
//            } else {
//                rezultatZbira[i] = nizDuzi[i];
//            }
//        }
//        return rezultatZbira;
//    }
//}

    /*
    Zadatak 7:
Napraviti metodu koja prima niz celih brojeva i vraca true ukoliko je niz rastuci.
     */
        int[] nizRastuci = {3,6,8,9,11,13,14,34,56};
        int[] nizRandom = {345,234,1,765,9};
        int[] nizOpadajuci = {99,88,77,66,55,44,33,22,11};

        System.out.println(proveraRastuci(nizRastuci));
        System.out.println(proveraRastuci(nizRandom));
        System.out.println(proveraRastuci(nizOpadajuci));

    }
    public static boolean proveraRastuci (int[] niz) {
        boolean b = true;
        int provera = Integer.MIN_VALUE;
        for(int i =0; i<niz.length; i++) {
            if(provera < niz[i]) {
                provera = niz[i];
            } else {
                b = false;
            }
        }
       return b;
    }
}