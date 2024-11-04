package IT_BootCamp_JAVA;

public class Class_6_Funkcije_metode {
    public static void main (String[] args) {

        /*
        -- Metode(funkcije) najcesce koristimo
        -- Metode uvek kreiramo van 'main" public bloka;
        -- public - znaci da je vidimo svugde, mozemo da je koristimo bilo gde u aplikaciji;
        -- static -
        -- public static int IME - metode- int oznacava tip podataka koje koristimo u metodi; metode moraju sadrzati i argumente;
        -- public static int sabiranje() {  // zapis metode
        -- Metoda mora da ima 'return' da bi mogao rezultat da se koristi dalje u pogramu; return odmah vraca rezultat u blok;
                }
        -- void - metode ne vracaju vrednost, samo izvrsavaju
        --Metode mogu biti void (ne vraca nista u main) i tip (int, double, String ...)

        -- Dve metode su iste tek kada je ceo zapis apsolutno isti i ne mogu se kreirati. Metoda mora biti unikatna i razlikovati se bar po necemu;
         */

        int x = 12;
        int y = 11;
        int z = -1;
        int d = 0;

        int sabiranje = sabiranje(x, y);
        int sabiranje2 = sabiranje(y, z);
        int sabiranje3 = sabiranje(123, 432);

        System.out.println(sabiranje);
        System.out.println(sabiranje2);
        System.out.println(sabiranje3);

        sabiranjeX(x, y);   // metoda void izlazi iz vod i dolazi u main, ne moze se smestiti u system.out.print ...

    }

    public static int sabiranje(int a, int b) {
        int c = a + b;
        return c;
    }
    public static void sabiranjeX(int a, int b) {
        int c = a + b;
        System.out.println("rezultat sabiranja :" + c);
    }
   // public static void povecaj(int[] niz);
}
