package Milan_Tair_Java_practice;

import java.util.Scanner;

public class Lection_5_Quiz_pogadjanje_broja {
    public static void main(String[] args) {

        System.out.println("Imate tri pokusaja da pogodite tajni broj koji se nalazi izmedju 1 i 30! Unesite vas broj:");
        double tajniBroj = (int) (1 +(Math.random()) * 30);
        int preostalo = 3;
        for (int i = 0; i < 3; i++) {
            Scanner s = new Scanner(System.in);
            int unetiBroj = s.nextInt();
            preostalo--;
            if (unetiBroj == tajniBroj) {
                System.out.println("Bravo! Pogodili ste tajni broj!");
            } else if (unetiBroj > tajniBroj) {
                System.out.println("Tajni broj je manji! Preostali pokusaji: " + preostalo);
            } else {
                System.out.println("Tajni broj je veci! Preostali pokusaji: " + preostalo);
            }
        }
        System.out.println("Tajni broj je bio: " + ((int)tajniBroj));
        System.out.println("Kraj igre!");
    }
}
