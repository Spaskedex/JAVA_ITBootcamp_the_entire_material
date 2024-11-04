package IT_BootCamp_JAVA;

import java.util.Scanner;

public class Class_3_switch {
    public static void main(String[] args) {

        /*
        SwitchNaredba : omogucava da uzmemo promenljivu, uzmemo njenu vrednost i gradimo case-ve gde za svaki case,
        vrednost, proizvodi neku funkcionalnost. Switch je slican if/else grananju. U okviru switch gradimo neke
        case-ve koji prekidaju izvrsavanje naredbom break. Default je osnovni case koji se izvrsava po defaultu
        u slucaju da nijedan case nije izvrsen. Switch obuhvata bilo koji tip podatka.
         */

//        int x = 2;
//
//        switch(x) {
//            case 1:
//                System.out.println("Vrednost x-a je 1.");
//                break;
//            case 2:
//                System.out.println("Vrednost x-a je 2.");
//                break;
//            default:
//                System.out.println("Vrednost x-a nije ni 1 ni 2.");

        /*
        Zadatak 1:
        Kreirati dva proizvoljna broja i ponuditi korisniku jednu od dve operacije za primenu(sabiranje ili oduzimanje).
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Unesite prvi od dva proizvoljna broja: ");
//        int x = sc.nextInt();
//        System.out.println("Unesite drugi broj: ");
//        int y = sc.nextInt();
//        System.out.println("Unesite '+' ili '-' za operaciju :");
//        char operacija = sc.next().charAt(0);
//        int rezultat;
//        switch (operacija) {
//            case '+':
//                rezultat = x + y;
//                System.out.println("Rezultat sabiranja je : " + rezultat);
//                break;
//            case '-':
//                rezultat = x - y;
//                System.out.println("Rezultat razlike je: " + rezultat);
//                break;
//            default:
//                System.out.println("Pogresan unos operacije.");
//                break;

        /*
        Zadatak 2:
        Kreirati dva proizvoljna broja i ponuditi korisniku jednu od tri operacije za primenu(mnozenje, ostatak i inkrement).
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi od dva proizvoljna broja: ");
        double a = sc.nextDouble();
        System.out.println("Unesite drugi broj: ");
        double b = sc.nextDouble();
        System.out.println("Unesite jednu od tri operacije : '*' za mnozenje, '%' za ostatak i '+' za inkrement.");
        char operacija = sc.next().charAt(0);
        double rezultat;
        switch (operacija) {
            case '*':
            rezultat = a * b;
                System.out.println("Rezultat mnozenja je : " + rezultat);
                break;
            case '%':
                rezultat = a % b;
                System.out.println("Ostatak je :" + rezultat);
                break;
            case '-':
                rezultat = ++a;
                System.out.println("Inkrement je :" + rezultat);
                break;
            default:
                System.out.println("Pogresan unos.");
                break;







        }
    }
}



