package Practice_Projects;


/*
Zadatak 1:
Napraviti metodu koja prihvata niz String-ova i jos jedan String, vraca broj pojavljivanja tog String-a u nizu.
Zadatak 2:
Napraviti metodu koja prihvata niz celih brojeva i vraca najmanji broj iz niza.
Zadatak 3:
Napraviti metodu koja prihvata niz brojeva i vraca proizvod svih parnih brojeva.
Zadatak 4(Ogledalo):
Napraviti metodu koja prihvata niz brojeva i kao rezultat vraca taj niz samo u obrnutom redosledu.
Zadatak 5:
Napraviti metodu koja prihvata neki niz String-ova i vraca taj niz bez duplikata.
Zadatak 6:
Napraviti metodu koja prihvata dva niza String-ova i konkatenira sve String-ove na istim pozicijama.
 */

public class Test_probni {
    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] niz2 = {11, 22, 33, 44, 55};

        String[] array1 = {"Elephant", "Horse", "Rabit", "Zevra", "Tiktok", "Dracula", "Ajkula", "Lion", "Wolf"};
        String[] array2 = {"Tiktok", "Lion", "Girafa", "Wolf", "Facebook"};
        String[] array3 = {"Mouse", "String", "Giros", "Wolfenstein", "Facedefect"};
        String array4 = "Tiktok";

        System.out.println(brojPojavljivanja(array1, array4));   // 1. Prvi zadatak;

        System.out.println(najmanjiBroj(niz1));       // 2. Drugi zadatak;

        System.out.println(proizvodParnih(niz1));    // 3. Treci zadatak;
        nizOgledalo(niz2);
        int[] ogledalo = nizOgledalo(niz1);
        System.out.println(ogledalo);
//        stampaj(ogledalo);



//        System.out.println(dvaNizaKonkatenacija(array2, array3));


    }

    public static void stampaj(String[] niz) {
        for(int i=0; i<niz.length; i++) {
            System.out.println(niz[i]);
        }
    }

    /*
        Zadatak 1:
Napraviti metodu koja prihvata niz String-ova i jos jedan String, vraca broj pojavljivanja tog String-a u nizu.
         */

    public static int brojPojavljivanja(String[] niz1, String niz2) {
        int brojPojavljivanja = 0;
        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i].contains(niz2)) {
                brojPojavljivanja++;
            }
        }
        return brojPojavljivanja;
    }


    /*
    Zadatak 2:
Napraviti metodu koja prihvata niz celih brojeva i vraca najmanji broj iz niza.
     */

    public static int najmanjiBroj(int[] niz) {
        int minBr = Integer.MAX_VALUE;
        for (int i = 0; i < niz.length; i++) {
            if (minBr > niz[i]) {
                minBr = niz[i];
            }
        }
        return minBr;
    }


    /*
    Zadatak 3:
Napraviti metodu koja prihvata niz brojeva i vraca proizvod svih parnih brojeva.
     */

    public static int proizvodParnih(int[] niz) {
        int proizvodPar = 1;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 0) {
                proizvodPar *= niz[i];
            }
        }
        return proizvodPar;
    }


    /*
    Zadatak 4(Ogledalo):
Napraviti metodu koja prihvata niz brojeva i kao rezultat vraca taj niz samo u obrnutom redosledu.
     */

    public static int[] nizOgledalo(int[] niz) {
        int[] nizobrnuti = new int[niz.length];
        int j=0;
        for (int i = niz.length - 1; i >= 0; i--) {                    // vraca adresu, zaboravio ...:(
            nizobrnuti[j] = niz[i];
            j++;
        }
        return nizobrnuti;
    }

}


    /*
    Zadatak 5:
Napraviti metodu koja prihvata neki niz String-ova i vraca taj niz bez duplikata.
     */
//    public static String[] duplikat(String[] array) {
//        String[] bezDuplikata;                                                              // nemam vise ideje, zablokirao...da li sam bar na "dobrom putu"?
//        String[] test = new String[array.length];
//        int brojac = 0;
//        int brojacRazlike = 0;
//        String[] razlikaStringova = new String[brojacRazlike];
//        for (int i = 0; i < array.length; i++) {
//            if (test[i].equals(array[i])) {
//                brojac++;
//                bezDuplikata = new String[brojac];


//            }
//            if (!test[i].equals(array[i])) {
//                brojacRazlike++;

//            }
//            razlikaStringova[brojacRazlike];
//            bezDuplikata[brojac]+=test[i];
//        }
//        return bezDuplikata;
//        }








    /*
    Zadatak 6:
Napraviti metodu koja prihvata dva niza String-ova i konkatenira sve String-ove na istim pozicijama.    //Da li su iste duzine? :D u nedoumici sam kako ... i da li void? :D
     */

//        public static String[] dvaNizaKonkatenacija (String[]niz1, String[]niz2){
//            String[] konkatenacija = new String[niz1.length];
//            for (int i = 0; i < niz1.length; i++) {
//                konkatenacija[i] = niz1[i] + niz2[i];
//            }
//            return konkatenacija;
//        }

//            }