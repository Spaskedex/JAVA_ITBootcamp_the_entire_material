package IT_BootCamp_JAVA;

public class Class_5_NizoviPractice {
    public static void main(String[] args) {

        /*
        Zadatak 1:
Napraviti niz brojeva i stampati samo parne.
         */


        int[] niz = {1, 2, 3, 4, 5, 6};
        System.out.println("Parni brojevi niza su:");
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 0) {
                System.out.println(niz[i]);
            }
        }
        System.out.println("Kraj prvog programa.");

        /*
        Zadatak 2:
Napraviti niz brojeva i povecati ih sve za 1.
         */
        int[] niz2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for ( int i = 0; i < niz2.length; i++) {
            niz2[i]+=1;  // ili izraz : niz2[i]++;  isti rezultat;
            System.out.println(niz2[i]);  // ili sout izraz System.out.println(niz2[i]+=1);
        }
        System.out.println("Kraj drugog programa.");

        /*
        Zadatak 3:
Napraviti niz brojeva i prebrojati Koliko ima brojeva koji su deljivi sa 3.
         */
        int brojac = 0;
        int[] niz3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for ( int i = 0; i < niz3.length; i++) {
            if (niz3[i]%3==0) {
                System.out.println(niz3[i]);
                brojac++;
            }
        }
        System.out.println("Brojeva deljivih sa 3 ima:" + brojac);
    }
}