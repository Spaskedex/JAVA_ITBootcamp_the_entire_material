package Practice_Projects;

import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {

//        String text = "Neki String";
//        int duzinaStringa = text.length();
//        System.out.println("Duzina stringa je: " + duzinaStringa);
//
//        for (int i=0; i<duzinaStringa; i++) {
//            System.out.println("Karakter stringa: " + text.charAt(i));
//        }
/*
0-ta pozicija je uvek na prvom mestu u nizu dok je poslednja pozicija uvek duzina stringa - 1;
--text.contains("") proverava sadrzaj nekog strniga, trazi odredjeni podstring u stringu;
--text.trim() - sece i cisti sve praznine iz stringa;
--text.isEmpty() - vraca true ako je string prazan;
 */
//        if (text.contains("i")) {
//            System.out.println("Imamo podstring.");
//        } else {
//            System.out.println("Nemamo ga.");
//        }
/*
        Zadatak 4:
        Napraviti program gde cete preko Scanner-a unositi neki String sve dok ne unesete tacku, cim se unese tacka
        treba kao rezultat vratiti sav prethodno uneti String.
*/
//Nacin1:

//        System.out.println("Unesite tekstualni niz:");
        Scanner sc = new Scanner(System.in);
        String text = "";
        String ceoUnos = "";
//
        while(!text.equalsIgnoreCase(".")) {
            System.out.println("Unesite tekstualni niz:");
            ceoUnos += text;
            text = sc.nextLine();
        }
        System.out.println(ceoUnos);

//        Nacin2:


//        while (true) {
//            text = sc.nextLine();
//            if(text.equalsIgnoreCase(".")) {
//                break;
//            }
//            rezultat+=text;
//        }
//        System.out.println(rezultat);




    }
}
