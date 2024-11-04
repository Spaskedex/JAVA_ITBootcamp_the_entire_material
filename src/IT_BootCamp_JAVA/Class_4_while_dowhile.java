package IT_BootCamp_JAVA;

/*
--while - petlja koja se izvrsava sve dok je odredjeni uslov true, prvo proveravaq uslov pa ispunjava blok petlje;
--do while - petlja prvo izvrsava blok petlje pa tek onda proverava uslov, obezbedjuje bar jedno izvrsavanje bloka koda
i ako uslov nije kasnije ispunjen pa ne nastavlja izvrsavanje( obezbedjuje jednu sigurnu iteraciju)
--Iteracija - predstavlja jedan krug u izvrsavanju petlje.
--Razlika izmedju 'while' i 'for' je sto 'for' koristimo u slucaju kada znamo koliko koraka iteracije imamo dok
'while' koristimo kada ne znamo unapred broj iteracija;
--Continue i break : Dve naredbe; 'continue' preskace trenutnu iteraciju i vraca nas na prvu narednu iteraciju;
--'break' nas izbacuje iz trenutne petlje i stavlja nas na prvo mesto nakon petlje;
--'continue' i 'break" se uvek koriste i petljama (for, while i do while), ne van njih.
 */


import java.util.Scanner;

public class Class_4_while_dowhile {
    public static void main(String[] args) {

//        int i = 1;
//        while ( i<=5 ) {
//            System.out.println("Hello World!" + i);
//            i++;
//        }
//
//        int s = 7;
//        do {
//            System.out.println("Hello World!" + i);
//        } while (s<5);


        /*
        Zadatak 1:
Zadati neki broj N i pomocu while petlje izracunati njegov faktorijel.
         */

//        System.out.println("Unesite broj ciji faktorijel zelite da izracunate: ");
//        Scanner skener = new Scanner(System.in);
//
//        int broj = skener.nextInt();
//        int i=1;
//        int faktorijel = 1;
//        while(i<=broj) {
//            faktorijel *= i;
//            i++;
//        }
//        System.out.println("Faktorijel unetog broja je: " + faktorijel);


        /*
        Zadatak 2:
Pomocu while petlje izracunati sumu prvih 10 brojeva.
         */
//        int s = 1;
//        int suma = 0;
//        while (s<=10) {
//             suma += s;
//             s++;
//        }
//        System.out.println("Zbir prvih 10 brojeva je: "+ suma);


//        int broj = 0;
//        while(broj<=10) {
//            if ( broj == 6) {
//                broj++;
//                continue;
//            }
//            if ( broj == 9) {
//                break;
//            }
//            System.out.println("Broj je:" + broj);
//            broj++;
//        }
//        System.out.println("Kraj programa.");

/*
Zadatak 3:
a)Stampati brojeve od 1 do 40 osim onih koji su deljivi sa 6.
b)Stampati brojeve od 1 do 100, ukoliko naidjete na 78 zaustaviti rad.
 */

//        int i = 1;
//        while(i<=40) {
//            if(i%6==0) {
//        i++;
//        continue;
//        }
//            System.out.println("Broj koji nije deljiv sa 6: " + i);
//            i++;
//        }

        int i =1;
        while(i<=100) {
            if (i == 78) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Kraj programa.");

    }

}
