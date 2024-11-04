package Practice_Projects;

public class Test_probni_resenja {
    public static void main(String[] args) {

        int[] niz1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] niz2 = {11, 22, 33, 44, 55};

        String[] array1 = {"Elephant", "Horse", "Rabit", "Zevra", "Tiktok", "Dracula", "Ajkula", "Lion", "Wolf"};
        String[] array2 = {"Tiktok", "Lion", "Girafa", "Wolf", "Facebook"};
        String[] array3 = {"Mouse", "String", "Giros", "Wolfenstein", "Facedefect"};
        String array4 = "Tiktok";

        int[] ogledaloNiz = ogledalo(niz1);
//        stampajaString(array1);
//        stampajaIntNiz(niz1);
//        stampajaIntNiz(ogledaloNiz);
//        stampajaIntNiz(ogledalo(niz2));

        stampajOgledaloString(array2);
        stampajOgledaloInt(niz2);







    }

    /*
    Zadatak 1:
Napraviti metodu koja prihvata niz String-ova i jos jedan String, vraca broj pojavljivanja tog String-a u nizu.
     */

    public static int prebrojString(String[] niz, String rec) {
        int brojac=0;
        for (int i=0; i<niz.length; i++) {
            if(niz[i].equalsIgnoreCase(rec)) {
                brojac++;
            }
        }
        return brojac;
    }



    /*
    Zadatak 2:
Napraviti metodu koja prihvata niz celih brojeva i vraca najmanji broj iz niza.
     */

    public static int minimum(int[] niz) {
        int minimum = Integer.MAX_VALUE;

        for(int i=1; i<niz.length; i++) {
            if(niz[i]<minimum) {
                minimum=niz[i];
            }
        }
        return minimum;
    }


    /*
    Zadatak 3:
Napraviti metodu koja prihvata niz brojeva i vraca proizvod svih parnih brojeva.
     */

    public static int proizvodParnih(int[] niz) {
        int proizvod =1;
        for(int i=0; i<niz.length; i++) {
            if(niz[i]%2==0) {
                proizvod*=niz[i];
            }
        }
        return proizvod;
    }



    /*
    Zadatak 4(Ogledalo):
Napraviti metodu koja prihvata niz brojeva i kao rezultat vraca taj niz samo u obrnutom redosledu.
     */

public static int[] ogledalo(int[] niz) {
    int[] rezultat = new int[niz.length];
    int j=0;
    for(int i=niz.length-1; i>=0; i--) {
        rezultat[j] = niz[i];
        j++;
    }
    return rezultat;
}



/*
Zadatak 5:
Napraviti metodu koja prihvata neki niz String-ova i vraca taj niz bez duplikata.
 */
    public static String[] bezDuplikata(String[] niz) {
        int brojacDuplikata =0;

        for(int i=0; i<niz.length-1; i++) {
            String trenutniElement = niz[i];
            for(int j=i+1; j<niz.length; j++) {
                if(trenutniElement.equalsIgnoreCase(niz[j]) && niz[j]!=null) {
                    brojacDuplikata++;
                    niz[j]=null;
                }
            }
        }
        String[] rezultat = new String[niz.length-brojacDuplikata];
        int j=0;
        for(int i=0; i<niz.length; i++) {
            if (niz[i]!=null) {
              rezultat[i] = niz[i];
              j++;
            }
        }
        return rezultat;
    }








    public static void stampajaString(String[] niz) {
        for(int i=0; i<niz.length; i++) {
            System.out.println(niz[i]);
        }
    }


    public static void stampajaIntNiz(int[] niz) {
        for(int i=0; i<niz.length; i++) {
            System.out.println(niz[i]);
        }
    }

    public static void stampajOgledaloString(String[] niz) {
        for (int i=niz.length-1; i>=0; i--) {
            System.out.println(niz[i]);
        }
    }

    public static void stampajOgledaloInt(int[] niz) {
        for(int i=niz.length-1; i>=0; i--) {
            System.out.println(niz[i]);
        }
    }

}
