package Practice_Projects;

/*
4. Napisati program koji koristi metodu za izracunavanje faktorijela unetog broja.
*/

import java.util.Scanner;

public class Vezbanje {
    public static void main(String[] args) {

        int[] niz = {1,2,3,4,5,6,7,8,9,10,};
        String[] nizString = {"Elephant", "Lion", "Wolf", "Hiena", "Rabit", "Girafe", "Pig", "Horse", "Tigar"};
        String[] nizString2 = {"Horse", "Camila", "Duck", "Donkey"};

        stampajInt(niz);
        stampajInt(ogledalo(niz));
        stampajString(nizString);
        stampajString(ogledaloString(nizString));
        stampajString(sabiranjeNizova(nizString, nizString2));

    }



    public static String[] sabiranjeNizova(String[] niz1, String[] niz2) {
        String[] zbir = new String[niz1.length+niz2.length];
        for(int i=0; i<niz1.length; i++) {
            zbir[i]=niz1[i];
        }
        int j=0;
        for(int i=niz1.length; i<zbir.length; i++) {
            zbir[i]=niz2[j];
            j++;
        }
        return zbir;
    }


    public static String[] ogledaloString(String[] niz) {
        String[] ogledalo = new String[niz.length];
        int j = 0;
        for(int i=niz.length-1; i>=0; i--) {
            ogledalo[j]=niz[i];
            j++;
        }
        return ogledalo;
    }


    public static String najduziString(String[] niz) {
        String najduzi = niz[0];
        for(int i=0; i<niz.length; i++) {
            if(najduzi.length()<niz[i].length()) {
                najduzi=niz[i];
            }
        }
        return najduzi;
    }

    public static int[] ogledalo(int[] niz) {
        int j = 0;
        int[] ogledalo = new int[niz.length];
        for(int i=niz.length-1; i>=0; i--) {
            ogledalo[j]=niz[i];
            j++;
        }
        return ogledalo;
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
