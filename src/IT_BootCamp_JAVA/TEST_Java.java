package IT_BootCamp_JAVA;

/*
Zadatak 1:
Napraviti metodu koja prihvata niz brojeva i vraca broj parnih brojeva u nizu.
Zadatak 2:
Napraviti metodu koja prihvata niz String-ova i neki String, vraca nam true ako se taj String nalazi u nizu.
Zadatak 3:
Napraviti metodu koja prihvata niz brojeva i vraca najveci broj iz niza.
Zadatak 4(xo):
Napraviti metodu koja prima niz karaktera(sastoje se samo od x i o), vraca nam karakter koji se
nalazi uzastopno 3 puta za redom.
Primer:
{x,o,o,x,o,o,o,x,x} -> o je pobednik!
Zadatak 5:
Napraviti metodu koja prima niz brojeva i proverava da li je niz monoton.
Niz je monoton ukoliko mu je vrednost ili rastuca ili opadajuca.
Primer:
Niz je monoton -> {1, 11, 21, 35}, {1, 0, -5, -10}
Niz NIJE monoton -> {1, 3, 6, 2, 11}, {5, 3, 4, 0, -2}
Zadatak 6:
Napraviti metodu koja prima 3 niza String-ova i ispisuje nam poruku koji je od ta 3 niza najveci.
 */

import java.sql.SQLOutput;

public class TEST_Java {
    public static void main(String[] args) {

        int broj=0;
        int broj2=0;

        int[] nizInt = {1,2,3,4,5,6,7,8,9,10};
        int[] nizInt2 = {11,22,33,44,55,66,77,88,99,100};
        int[] silazno = {5,4,3,2,1};

        String rec = "Hello, World!";
        String ime = "Dejan";

        char[] xO = {'o','o','o'};

        String[] nizString = {"Donkey", "Kong", "Lion", "Elephant", "Tigar", "Zeko", "Rodzer", "Dejan"};
        String[] nizString2 = {"Cat", "Dog", "Fish", "Cevapi"};
        String[] nizString3 = {"Mouse", "Hotdog"};

        System.out.println("Parnih brojeva u nizu ima: " + brojParnih(nizInt2));      // 1. Prvi zadatak;

        System.out.println("Rec se nalazi u stringu: " + proveraReci(nizString, ime));      // 2. Drugi zadatak;

        System.out.println("Max broj niza je:" + maxBroj(nizInt2));                  // 3. Treci zadatak;

        System.out.println(iksOks(xO));                                            // 4. Cetvrti;

        stampajString(najduziString(nizString,nizString2,nizString3));              // 6. Sesti zadatak;

        System.out.println(monotonNizUzlazno(nizInt));                          //5. Peti uzlazno;
        System.out.println(monotonSilazno(nizInt2));                          //5. Peti silazno;



    }

    /*
    Zadatak 1:
Napraviti metodu koja prihvata niz brojeva i vraca broj parnih brojeva u nizu.
     */

    public static int brojParnih(int[] niz) {
        int brojac = 0;
        for(int i=0; i<niz.length; i++) {
            if(niz[i]%2==0) {
                brojac++;
            }
        }
        return brojac;
    }

    /*
    Zadatak 2:
Napraviti metodu koja prihvata niz String-ova i neki String, vraca nam true ako se taj String nalazi u nizu.
     */

    public static boolean proveraReci(String[] niz, String rec) {
        boolean b = true;
        for(int i=0; i<niz.length; i++) {
            if(niz[i].contains(rec)) {
                b=true;
            } else{
                b=false;
            }
        }
        return b;
    }

    /*
    Zadatak 3:
Napraviti metodu koja prihvata niz brojeva i vraca najveci broj iz niza.
     */
    public static int maxBroj(int[] niz) {
        int maxElement = niz[0];
        for(int i=0; i<niz.length; i++) {
            if(maxElement<niz[i]) {
                maxElement=niz[i];
            }
        }
        return maxElement;
    }

    /*
    Zadatak 4(xo):
Napraviti metodu koja prima niz karaktera(sastoje se samo od x i o), vraca nam karakter koji se
nalazi uzastopno 3 puta za redom.
     */
    public static char[] iksOks(char[] iksoks) {
        char[] pobednik = new char[3];                  // * u glavi mi unos preko skenera sc.next().charAt(1,2,3) nije mi bas jasno kako metodu da uradim ..
        char[] pobednikX = {'x','x','x'};
        char[] pobednikO = {'o','o','o'};
        for(int i=0; i<3; i++) {
            if(iksoks.equals(pobednikX)) {
                pobednik = pobednikX;
            } else if(iksoks.equals(pobednikO)) {
                pobednik = pobednikO;
            }
        }
        return pobednik;
    }

    /*
    Zadatak 5:
Napraviti metodu koja prima niz brojeva i proverava da li je niz monoton.
     */
        public static boolean monotonNizUzlazno(int[] niz) {
            boolean b = true;
            int provera = niz[0];
            for(int i=0; i<niz.length; i++) {
                if(provera<=niz[i]) {
                    provera=niz[i];
                }   else {
                    b = false;
                }
            }
            return b;
        }

    public static boolean monotonSilazno(int[] niz) {
        boolean b = true;
        int provera = niz[niz.length-1];
        for(int i=niz.length-1; i>=0; i--) {
            if(provera>=niz[i]) {
                provera=niz[i];
            }   else {
                b = false;
            }
        }
        return b;
    }




    /*
    Zadatak 6:
Napraviti metodu koja prima 3 niza String-ova i ispisuje nam poruku koji je od ta 3 niza najveci.
 */
    public static String[] najduziString(String[] niz1, String[] niz2, String[] niz3) {
        String[] najduziNiz;
        if(niz1.length>niz2.length && niz1.length>niz3.length) {
            najduziNiz=niz1;
        } else if(niz2.length>niz1.length && niz2.length>niz3.length) {
            najduziNiz=niz2;
        } else {
            najduziNiz=niz3;
        }
        return najduziNiz;
    }




    public static void stampajInt(int[] niz) {
        for(int i=0; i<niz.length; i++) {
            System.out.println(niz[i]);
        }
    }

    public static void stampajString(String[] niz) {
        for(int i=0; i<niz.length; i++) {
            System.out.println(niz[i]);
        }
    }
}
