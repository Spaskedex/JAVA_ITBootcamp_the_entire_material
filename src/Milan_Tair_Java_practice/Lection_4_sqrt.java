package Milan_Tair_Java_practice;

import java.util.Scanner;

public class Lection_4_sqrt {
    public static void main(String[] args) {

        System.out.println("Unesite broj iz kog zelite da izvucete koren: ");
        Scanner s = new Scanner(System.in);

        double unetiBroj = s.nextDouble();
        double korenBroja = Math.sqrt(unetiBroj);

        System.out.println("Koren unetog broja je : " + korenBroja);
    }
}
