package ObjektnoOrjentisanoProgramiranje.Class_10_Glumac;

/*
Zadatak 2:
Napraviti klasu Glumac koji ima godinu rodjenja I ime.
Napraviti klasu Film koji od atributa ima godinu objavljivanja, glavnog glumca I ukupno zaradjenih para.
Napraviti metode:
- godineGlavnogGlumca() -> kao rezultat vraca broj godina koje je glumac imao kad je snimio film
- troskovi() -> vraca nam koliki su troskovi ako racunamo da iznose 20% od ukupne zarade filma
Klasa Horor nasledjuje klasu Film.
Klasa AkcioniFilm nasledjuje klasu Film I njegovi troskovi iznose 40% od ukupne zarade.
Klasa Romantika nasledjuje klasu Film I njegovi troskovi iznose 10% od ukupne zarade.
 */

public class Main {
    public static void main(String[] args) {

        Glumac glumac1 = new Glumac(1989, "Silvester Stalone");
        Film film = new Film(2009, glumac1, 2365879);
        System.out.println(glumac1);
        System.out.println(film);
        System.out.println("Glavni glumac je imao " + film.godineGlavnogGlumca(glumac1.getGodRodjenja()) + " prilikom objavljivanja filma.");
        System.out.println("Troskovi: " + film.troskovi(film.getUkupnaZarada()));
    }
}
