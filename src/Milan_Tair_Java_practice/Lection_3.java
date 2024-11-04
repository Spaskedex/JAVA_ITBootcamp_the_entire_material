package Milan_Tair_Java_practice;

import java.util.Scanner;

public class Lection_3 {
    public static void main(String[] args) {
        System.out.println("Unesite vasu godinu rodjenja: ");
        Scanner s = new Scanner(System.in);
        int godRodjenja = s.nextInt();
        if (godRodjenja == 2000) {
            System.out.println("Vasa godina rodjenja je parna i rodjeni ste 2000-te godine.");
        } else if (godRodjenja < 2000 && godRodjenja % 2 == 0) {
            System.out.println("Rodjeni ste pre 2000-te i vasa godina je parna.");
        } else if (godRodjenja > 2000 && godRodjenja % 2 == 0) {
            System.out.println("Rodjeni ste posle 2000-te i vasa godina rodjenja je parna.");
        } else if (godRodjenja > 2000) {
            System.out.println("Rodjeni ste posle 2000-te i vasa godina rodjenja je neparna.");
        } else {
            System.out.println("Rodjeni ste pre 2000-te i vasa godina rodjenja je neparna.");
        }
    }
}


//        Scanner s = new Scanner(System.in);
//        System.out.println("Unesite ime grada: ");
//
//        String imeGrada = s.nextLine();
//        imeGrada = imeGrada.toUpperCase();
//        imeGrada = imeGrada.trim();
//        if ( imeGrada.equals("BEOGRAD") || imeGrada.equals("NOVI SAD")) {
//            System.out.println("Imamo predstavnistvo u vasem gradu " + imeGrada + ".");
//        } else {
//            System.out.println("Zao nam je, nemamo predstavnistvo u vasem gradu po imenu " + imeGrada);
//        }
//    }
//}
