package IT_BootCamp_JAVA;

/*
 -- Nizovi;
    [] - uglaste zagrade posle klase govore da se radi o nizu a ne o jednoj promenljivoj; zauzima(dodeljuje) vise memorije u startu;
    null - za razliku od praznog niza u int nizu, u String-u null oznacava prazno mesto bez ikakvog sadrzaja, ne zauzima memoriju;
    0 - prva pozicija u nizu se uvek broji i oznacava '0' nulom
    - konkatenacija - spajanje dva stringa, sabiranje;
 */


public class Class_5_Nizovi {
    public static void main(String[] args) {

        int[] niz = {1, 2 ,3 ,4 ,5};
        int[] niz2 = new int[5];   // po default su nule {0,0,0,0,0}
        String[] niz3 = new String[3];  // null, null, null ;

        System.out.println(niz[0]);   // niz[0] vraca prvi element iz niza;  index - vraca poziciju elementa u nizu i krece brojanje od nule;
        System.out.println(niz[1]);   // niz[1] vraca drugi element iz niza;
        System.out.println(niz[2]);   // niz[2] vraca treci element iz niza;
        System.out.println(niz[3]);   // niz[3] vraca cetvrti element iz niza;
        System.out.println(niz[4]);   // niz[4] vraca peti element iz niza;

//        1 primer, METODA ZA STAMPANJE NIZA;
        for ( int i = 0; i<niz.length; i++) {
            System.out.println(niz[i]);         // niz.length vraca ukupan broj elemenata; ovaj blok koda predstavlja stampanje niza;
        }

        for ( int i=niz.length-1; i>=0; i--) {
            System.out.println(niz[i]);         // stampa niz od nazad, obrnutim redosledom;
        }
        System.out.println(niz[niz.length-3]); // vraca sadrzaj odredjenog mesta u nizu


//        2 primer POPUNJAVANJE PRAZNOG REZERVISANOG NIZA :

        int[] niz4 = new int[4];  // {0,0,0,0}
        niz4[0] = 3;
        niz4[3] = 9;
        niz4[2] = 15;
        niz4[1] = 12;
        System.out.println(niz4);  // ovaj nacin printanja niza vraca samo adresu niza;
        for(int i=0; i<niz4.length; i++) {
            System.out.println(niz4[i]);
        }

        //--- NIZOVI - JEDNAKOST - dva niza su jednaka kada im je duzina ista i kada su svi elementi na istim pozicijama.
        //   {1, 2, 3, 4, 5} == {1, 2, 3, 4, 5};
        //   ( akko = ako i samo ako )
        // Primer:

        int[] nizJedan = {1, 2, 3, 4};
        int[] nizDva = {1, 2, 3, 5};
        boolean b = true;
        if(nizJedan.length == nizDva.length) {    // prvi uslov za jednakost je da su iste duzine
            for(int i = 0; i<nizJedan.length; i++) {
                if(nizJedan[i] == nizDva[i]) {
                    continue;
                } else {
                    b = false;
                    break;
                }
            }
        } else {
            b = false;
        }
        if(b) {
            System.out.println("Nizovi su isti.");
        }
        else {
            System.out.println("Nizovi nisu isti.");
        }

        /*
                        **KOPIRANJE NIZOVA:
         Jednakost, kopiranje nizova. Postoje dve vrste kopiranja nizova: duboko, plitko(kopiranje po referenci);
         Referenca je memorijska adresa. Prilikom plitkog kopiranja niz kopira memorijsku adresu, identicne su kopije i
         promena u jednom direktno utice na istu promenu u drugom.
         * Duboko kopiranje - pravi kopiju gde se pravi prvo kopija niza u memoriji sa razlicitim memorijskim adresama
         stoga promena u jednom ne utice na drugi niz.
         */

        int[] niz11 = {1, 2, 3, 4, 5};
        int[] niz22= niz11;   // plitko kopiranje niza (umesto vrednosti iz niza11 u nizu22 vidimo memorijsku adresu niza11;

        // Duboko kopiranje :
        int[] niz33 = new int[niz11.length];   // {0, 0, 0, 0, 0} -- {1, 2, 3, 4, 5}
        for(int i=0; i<niz11.length; i++) {
            niz33[i] = niz11[i];
        }
    }
}

