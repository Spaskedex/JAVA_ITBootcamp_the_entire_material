package ObjektnoOrjentisanoProgramiranje.Class_10_DrustveneMreze;

/*
Zadatak 1:
Napraviti klasu DrustvenaMreza koja od atributa ima broj korisnika i broj reklama.
Napraviti metodu:
- zarada() -> racuna zaradu za drustvene mreze ako zaradjuje 2 po korisniku a 5 po reklami.
- upozorenje() -> ispisuje poruku o upozorenju ukoliko drustvena mreza nema dovoljno korisnika (manje od 200)
Napraviti klasu Facebook koji nasledjuje klasu DrustvenaMreza.
Napraviti klasu Instagram koji nasledjuje klasu DrustvenaMreza I on zaradjuje 1 po korisniku I 10 po reklami.
Napraviti klasu TikTok koji nasledjuje klasu DrustvenaMreza I on ispisuje upozorenje ukoliko ima manje od 500 korisnika.
 */


public class Main {
    public static void main(String[] args) {

        DrustvenaMreza FaceBook = new FaceBook(7654321, 12487);
        DrustvenaMreza Instagram = new Instagram(3431654, 4876);
        DrustvenaMreza TikTok = new TikTok(1568792,2500);

        System.out.println(FaceBook);
        System.out.println(Instagram);
        System.out.println(TikTok);
        System.out.println("Zarada FaceBook mreze od korisnika i reklama je : " + FaceBook.zarada());
        System.out.println("Zarada Instagram mreze od korisnika i reklama je : " + Instagram.zarada());
        System.out.println("Zarada TikTok mreze od korisnika i reklama je : " + TikTok.zarada());
        System.out.println("Zarada od svih drustvenih mreza je: " + (FaceBook.zarada() + Instagram.zarada() + TikTok.zarada()));
        FaceBook.upozorenje();
        Instagram.upozorenje();
        TikTok.upozorenje();
    }

}
