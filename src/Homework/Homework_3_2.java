package Homework;

/*
2. Napisi program koji koristi for petlju da proveri da li je broj N prost.
Korisnik treba da unese vrednost N, a program treba da ispita da li je taj broj deljiv
samo sa 1 i sa samim sobom. Ispiši odgovarajuću poruku.
 */


import java.util.Scanner;

public class Homework_3_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Unesite broj N: ");
//
//        int n = sc.nextInt();
//
//        for (int i = 0; i < 1; i++) {
//            if (n % 2 == 0) {
//                System.out.println("Uneti broj " + n + " je paran, nije prost.");
//            } else if (n > 3 && n % 3 == 0) {
//                System.out.println("Broj je deljiv sa 3 i nije prost.");
//            } else if (n > 5 && n % 5 == 0) {
//                System.out.println("Broj je deljiv sa 5 i nije prost.");
//            } else if (n > 7 && n % 7 == 0) {
//                System.out.println("Broj je deljiv sa 7 i nije prost. ");
//            } else {
//                System.out.println("Uneti broj je prost broj.");
//            }
//
//        }

        System.out.println("Unesite  broj:");
        int broj = sc.nextInt();
        boolean prost = true;
        if(broj<=1) {
            prost=false;
        } else {
            for(int i =2; i<=Math.sqrt(broj); i++) {
                if (broj%i==0) {
                    prost = false;
                    break;
                }
            }
        } if(prost) {
            System.out.println(broj + " je prost");
        } else {
            System.out.println(broj + " nije prost.");
        }

    }

}
