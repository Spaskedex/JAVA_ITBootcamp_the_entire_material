package Practice_Projects;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        int[] nizInt = {1,2,3,4,5,6,7,8,9,10};
        int[] nizInt2 = {23,34,54,56,67,88,99};
       String str = "asdqwewerrytuiiooiuprtgrpoiuiiqweuqruagadszxcvbnvbasdqpworiwtugvaaoieoiapoieuuuauaeoiuaieuoiauaieuu";

        int br1 = 43;
        int br2 = 123;
        int br3 = 10;
        int[] newIntNiz = new int[5];

       



    }



    public static void ogledalo(int[] niz) {
        for(int i=niz.length-1; i>=0;i--) {
            System.out.println(niz[i]);
        }
    }

    public static void unosNiza(int[] niz) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza:");
        int duzina = sc.nextInt();
        System.out.println("Unesite elemente niza: ");
        int[] nizInt = new int[duzina];
        for(int i=0; i<nizInt.length; i++) {
            nizInt[i] = sc.nextInt();
        }
    }

    public static int faktorijel(int broj) {
        int faktorijel = 1;
        for(int i=1; i<=broj;i++) {
            faktorijel*=i;
        }
        return faktorijel;
    }


        public static void stampajNizInt(int[] niz) {
        for(int i=0; i<niz.length; i++) {
            System.out.println(niz[i]);
        }
    }



    public static int brojSamoglasnika(String niz) {
        int brojac = 0;
        for(int i=0; i<niz.length(); i++) {
         char slovo = niz.charAt(i);
         if(slovo=='a' || slovo=='e' || slovo=='i' || slovo=='o' || slovo=='u') {
             brojac++;
         }
        }
        return brojac;
    }



    public static boolean jednakiNizovi (int[] niz1, int[] niz2) {
        if (niz1.length != niz2.length) {
            return false;
        }
        for(int i=0; i<niz1.length; i++) {
            if(niz1[i] != niz2[i]) {
                return false;
            }
        }
        return true;
    }



}
