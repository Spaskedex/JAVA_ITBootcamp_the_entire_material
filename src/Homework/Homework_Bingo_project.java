package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework_Bingo_project {
    public static void main(String[] args) {

        System.out.println("Pozdrav za bata Mara i Dekija! BINGO game from the scratch! :D");
        System.out.println("Ako osvojite BINGO i scrshot dobijete balonce domace ljute prepecenice i pecenje jaga/guda/rostilj pride po izboru! Srecno!");

        int[] bingoBrojevi = new int[6];
        int[] izvuceniBingoBrojeviNiz = new int[30];

        unesiBingoBrojeve(bingoBrojevi);
        System.out.println("Vasi brojevi:");
        stampaj(bingoBrojevi);

        izvuceniBingoBrojevi(izvuceniBingoBrojeviNiz);
        System.out.println("Izvuceni brojevi:");
        stampaj(izvuceniBingoBrojeviNiz);

        ArrayList<Integer> pogodjeniBrojevi = pogodjeniBrojevi(bingoBrojevi, izvuceniBingoBrojeviNiz);

        int pogodjeno = pogodjenoBrojeva(bingoBrojevi, izvuceniBingoBrojeviNiz);

        System.out.println("Osvojili ste BINGO : " + dobitak(bingoBrojevi, izvuceniBingoBrojeviNiz));
        System.out.println("Pogodjenih brojeva ima " + pogodjeno);
        System.out.println("Pogodili ste sledece brojeve: " + pogodjeniBrojevi);

        switch (pogodjeno) {
            case 3:
                System.out.println("Osvojili ste zamenu BINGO srecke!");
                break;
            case 4:
                System.out.println("Cestitamo! Osvojili ste 1000 RSD!");
                break;
            case 5:
                System.out.println("Cestitamo! Osvojili ste 375.999 RSD!");
                break;
            case 6:
                System.out.println("BINGO!!! Cestitamo, osvojili ste 2.479.657 RSD!");
                break;
            default:
                System.out.println("Vise srece drugi put! Vidimo se u sledecem kolu igre na srecu BINGO!");
                break;
        }

    }

    public static int[] unesiBingoBrojeve(int[] niz) {
        Scanner sc = new Scanner(System.in);
        int broj;
        for(int i=0; i<6; i++) {
            System.out.println("Unesite vasih 6 BINGO brojeva (1-75):");
            broj=sc.nextInt();
            niz[i]+= broj;
        }
        return niz;
    }

    public static int[] izvuceniBingoBrojevi(int[] niz) {
        double broj;
        for(int i=0; i<30; i++) {
            broj = (int) (1+Math.random()*74);
            niz[i]+=(int) broj;
        }
        return niz;
    }

    public static boolean dobitak(int[] niz1, int[] niz2) {
        boolean b = true;
        int pogodjeniBrojeviBrojac = 0;
        for(int i=0; i<6; i++) {
            for(int j=0; j<30; j++) {
                if(niz1[i]==niz2[j]) {
                    pogodjeniBrojeviBrojac++;
                }
            }
            if(pogodjeniBrojeviBrojac==niz1.length) {
                b=true;
            } else {
                b=false;
            }
        }
        return b;
    }

    public static int pogodjenoBrojeva(int[] niz1, int[] niz2) {
        int brojac = 0;
        for( int i=0; i<6; i++) {
            for(int j =0; j<30; j++) {
                if(niz1[i]==niz2[j]) {
                    brojac++;
                }
            }
        }
        return brojac;
    }

    public static ArrayList<Integer> pogodjeniBrojevi(int[] niz1, int[] niz2) {
        ArrayList<Integer> pogodjeniBrojevi = new ArrayList<>();
        for(int i=0; i<6; i++) {
            for(int j=0; j<30; j++) {
                if(niz1[i]==niz2[j]) {
                    pogodjeniBrojevi.add(niz1[i]);
                }
            }
        }
        return pogodjeniBrojevi;
    }


    public static void stampaj(int[] niz) {
        for(int i=0; i<niz.length; i++) {
            System.out.println(niz[i]);
        }
    }


}
