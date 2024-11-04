package IT_BootCamp_JAVA;

/*
Zadatak 3:
a)Napraviti metodu koja prima niz celih brojeva i povecava sve brojeve za 1.
b)Napraviti metodu koja je zaduzena za stampanje nizova
 */

public class Class_6_practice_3 {
    public static void main(String[] args) {
       int[] niz1 = {12, 23, 25, 56, 67, 87};
       povecaj(niz1);
       stampaj(niz1);
    }
    public static void povecaj (int[] nekiNiz) {
        for(int i=0; i<nekiNiz.length; i++) {
            nekiNiz[i]++;

        }

    }
    public static void stampaj(int[] niz) {
        for(int i=0; i<niz.length; i++) {
            System.out.println(niz[i]);
        }
    }
}
