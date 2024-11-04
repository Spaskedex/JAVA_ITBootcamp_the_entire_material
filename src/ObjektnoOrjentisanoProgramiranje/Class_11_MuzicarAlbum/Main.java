package ObjektnoOrjentisanoProgramiranje.Class_11_MuzicarAlbum;

/*
Zadatak 3:
Napraviti klasu Album koji ima kao atribute naziv, godinu objavljivanja I broj pesama.
Napraviti klasu Muzicar koji od atributa ima ime, godinu pocetka karijere I jedan album.
Napraviti metode:
- prviHit() -> ukoliko je album objavljen kad je muzicar I zapoceo karijeru, ispisati poruku da mu je to prvi hit
- zarada() -> vraca zaradu od albuma ako znamo da zaradjuje 1000 po pesmi.
Napraviti klasu RokMuzicar koji nasledjuje klasu Muzicar I on zaradjuje 750 po pesmi.
Napraviti klasu PopMuzicar koji nasledjuje klasu Muzicar.
Napraviti klasu Reper koji nasledjuje klasu Muzicar I on zaradjuje 500 po pesmi.
 */

public class Main {
    public static void main(String[] args) {

        Album rokAlbum = new Album("Riblja Corba", 1976, 8);
        System.out.println(rokAlbum);
        Album popAlbum = new Album("Vlado Georgijev", 2006, 10);
        System.out.println(popAlbum);
        Album repAlbum = new Album("187", 2008, 6);
        System.out.println(repAlbum);
        Muzicar rockMuzicar = new RokMuzicar("Riblja Corba", 1976, rokAlbum);
        Muzicar popMuzicar = new PopMuzicar("Vlado Georgijev", 2004, popAlbum);
        Muzicar repMuzicar = new Reper("187", 2001, repAlbum);
        System.out.println(rockMuzicar + " zarada: " + rockMuzicar.zarada());
        rockMuzicar.prviHit();
        System.out.println(popMuzicar + " zarada: " + popMuzicar.zarada());
        popMuzicar.prviHit();
        System.out.println(repMuzicar + " zarada: " + repMuzicar.zarada());
        repMuzicar.prviHit();


    }
}
