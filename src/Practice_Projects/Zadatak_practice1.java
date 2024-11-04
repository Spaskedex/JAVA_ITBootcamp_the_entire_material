package Practice_Projects;
/*
Zadatak 1: +++
Napraviti metodu koja prihvata niz String-ova i jos jedan String, vraca broj pojavljivanja tog String-a u nizu.
Zadatak 2: +++
Napraviti metodu koja prihvata niz celih brojeva i vraca najmanji broj iz niza.
Zadatak 3: +++
Napraviti metodu koja prihvata niz brojeva i vraca proizvod svih parnih brojeva.
Zadatak 4(Ogledalo): +++
Napraviti metodu koja prihvata niz brojeva i kao rezultat vraca taj niz samo u obrnutom redosledu.
Zadatak 5:
Napraviti metodu koja prihvata neki niz String-ova i vraca taj niz bez duplikata.
Zadatak 6:
Napraviti metodu koja prihvata dva niza String-ova i konkatenira sve String-ove na istim pozicijama.
 */

public class Zadatak_practice1 {
    public static void main(String[] args) {
       int[] niz = {1,2,3,4,5,6,7,8,9,10,};
       int[] niz2 = {11, 22, 33, 44, 55};
       String[] nizString = new String[10];

        String[] array1 = {"Elephant", "Horse", "Rabit", "Zevra", "Tiktok", "Dracula", "Ajkula", "Lion", "Wolf", "Tiktok", "Tiktok"};
        String[] array2 = {"Tiktok", "Lion", "Girafa", "Wolf", "Facebook"};
        String[] array3 = {"Mouse", "String", "Giros", "Wolfenstein", "Facedefect"};
        String rec = "Tiktok";
        String myStr = "Hello, World!";

        stampajNizInt(ogledaloInt(niz));
        System.out.println(array1[5]);
        System.out.println(myStr.substring(7, 12));
        System.out.println(rec.substring(3, 5));




    }
    public static int[] ogledaloInt(int[] niz) {
        int[] obrnutiNiz = new int[niz.length];
        int j = 0;
        for(int i=niz.length-1; i>=0; i--) {
            obrnutiNiz[j]=niz[i];
            j++;
        }
        return obrnutiNiz;
    }




    public static void stampajNizInt(int[] niz) {
        for(int i=0; i<niz.length; i++) {
            System.out.println(niz[i]);
        }
    }

    public static void stampajNizString(String[] niz) {
        for(int i=0; i<niz.length; i++) {
            System.out.println(niz[i]);
        }
    }

}
