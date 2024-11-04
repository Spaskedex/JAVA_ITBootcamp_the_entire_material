package Homework;


/*
1. Napisati program koji izracunava povrsinu i obim kruga za radijus r. (2 * r * PI)
 */

import java.util.Scanner;


public class Homework_2_1 {

    private static final double PI = 3.14;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite poluprecnik kruga (r) : ");

        double r = sc.nextDouble();


        double P = Math.pow(r, 2) * PI;
        double O = 2 * r * PI;

        System.out.println("Povrsina kruga (P) za uneti poluprecnik je r2 * PI = " + P);
        System.out.println("Obim kruga (O) za dati poluprecnik je  2r * PI = " + O);
    }


}
