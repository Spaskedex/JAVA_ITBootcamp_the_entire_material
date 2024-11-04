package IT_BootCamp_JAVA;

       /*
        Zadatak 2:
        Napraviti metodu koja prihvata dva broja i stampa poruku koji je od ta dva broja veci.
         */


public class Class_6_practice_2 {
    public static void main(String[] args) {

        int br1 = 23;
        int br2 = 13;
//        provera(44, 44);
        provera2(34, 21);
        System.out.println(provera2(34, 21));
    }
//    public class int poredjenje (int x, int y) {
//
//        if(x > y) {
//            System.out.println("Veci je br1."); {
//                return
//            }
//        }
//    }
//    public static void provera(int a, int b) {                // pomocu void metode:
//        if(a>b) {
//            System.out.println("Prvi broj je veci.");
//        } else if(b>a) {
//            System.out.println("Drugi broj je veci.");
//        } else {
//            System.out.println("Brojevi su isti.");
//        }
//    }

    public static String provera2(int g, int h) {
        String poruka1 = "Prvi broj je veci.";
        String poruka2 = "Drugi broj je veci.";
        String poruka3 = "Brojevi su isti";

        if(g>h) {
            return poruka1;
        } else if (h>g) {
            return poruka2;
        }  else {
            return poruka3;
        }
    }

}
