package IT_BootCamp_JAVA;

// Uslovno grananje IF - ELSE
/*
Zadatak 1:
Napraviti promenljivu gde ce stojati vas broj godina,
ukoliko imate 18 i vise godina, ispisati poruku da imate dovoljno godina da
konzumirate alkohol, u suprotnom ispisti da ste previse mladi.
 */


import java.util.Scanner;

public class Class_2_IfElse {
    public static void main(String[] args) {

//        System.out.println("Unesite broj vasih godina: ");
//        Scanner s = new Scanner(System.in);
//        int brojGodina = s.nextInt();
//        if ( brojGodina > 18 || brojGodina == 18) {
//            System.out.println("Imate dovoljno godina da konzumirate alkohol :D");
//        } else {
//            System.out.println("Zao mi je, previse ste mladi! Za vas u ponudi imamo sokic + lizalica gratis! :P");
//        }

        /*
        Zadatak 2:
Napraviti dve promenljive sa proizvoljnim brojevima,
zatim izracunati njihov zbir i proizvod. Ako je proizvod veci - ispisati poruku,
ako je zbir veci - ispisati poruku o tome, u suprotnom ispisati poruku da su brojevi jednaki.
         */
//
//        int a = 5;
//        int b = 5;
//
//        int zbir = a + b;
//        int proizvod = a * b;
//
//        if ( proizvod > zbir) {
//            System.out.println("Proizvod je veci od zbira : " + proizvod + " > " + zbir);
//        } else if ( proizvod < zbir) {
//            System.out.println("Zbir je veci od proizvoda : " + zbir + " > " + proizvod);
//        } else {
//            System.out.println("Zbir je jednak proizvodu: " + zbir + " = " + proizvod);
//        }

        /*
        Scanner je Java alat koja nam omogucava komunikaciju sa konzolom.
        Scanner si importuje sa Scanner  alt+Enter
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Unesite ime: ");
//        String ime = sc.nextLine();
//        System.out.println("Unesite prezime: ");
//        String prezime = sc.nextLine();
//        System.out.println("Unesite godinu rodjenja: ");
//        int godRodj = sc.nextInt();
//        System.out.println("Vasi podaci  ");
//        System.out.println("Ime " + ime + " prezime " + prezime + " godina rodjenja: " + godRodj);

        /*
        Zadatak 3:
Uneti prvi broj preko skenera, zatim uneti drugi broj preko skenera i kao rezultat ispisati njihov zbir.
         */

//        sSystem.out.println("Unesite random broj: ");
//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        System.out.println("Unesite drugi random broj :");
//        int b = s.nextInt();
//        int zbir = a + b;
//        Sytem.out.println("Zbir vasa dva uneta broja je : " + a + " + " + b + " = " + zbir);


        /*
        Zadatak 4:
        Uneti preko skenera neki broj, ukoliko je taj broj veci od 10 i paran,
        smanjiti ga za 1, u suprotnom ga povecati za 1.
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Unesite random prirodni broj: ");
//
//        int broj = sc.nextInt();
//
//        if ( broj > 10 && broj %2==0 ) {
//            System.out.println("Vas broj ce biti umanjen za 1 :" + (broj - 1));
//        } else {
//            System.out.println("Vas broj ce biti uvecan za 1: " + (broj + 1));
//        }

        /*
        Zadatak 5:
        Napraviti program gde cete uneti koji je mesec u godini, u slucaju da su uneti "Jun" ili "Jul",
        ispisati poruku da su vrucine prevelike, u suprotnom ispisati da je temperatura stabilna.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite trenutni mesec: ");
        String mesec = sc.nextLine();

        if ( (mesec.equalsIgnoreCase("jun")) || (mesec.equalsIgnoreCase("jul")) ) {
            System.out.println("Vrucine su prevelike!");
        } else {
            System.out.println("Temperatura je stabilna!");
        }

    }
}
