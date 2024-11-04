package Milan_Tair_Java_practice;

import java.util.Scanner;

public class Lection_6_for {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.println("unesite broj:");
            int br = s.nextInt();
            if(br%2 == 0) {
                System.out.println("Broj je paran.");
            } else {
                System.out.println("Broj je neparan.");
            }
        }
        System.out.println("kraj");
    }
}
