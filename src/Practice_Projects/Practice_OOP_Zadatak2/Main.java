package Practice_Projects.Practice_OOP_Zadatak2;

/*
Zadatak 2:
Napraviti klasu Stavka koja ima od atributa naziv i cenu.
Napraviti klasu KreditnaKartica koja od atributa ima stanje na racunu.
Napraviti klasu Korpa koji ima od atributa jednu stavku i kreditnu karticu.
Napraviti metode:
- plati() -> skida pare sa kreditne kartice u iznosu od cene stavke, ukoliko nema dovoljno, ispisati poruku.
- viseStavki() -> vraca nam Koliko puta mozemo da kupimo tu stavku sa parama koje imamo
OnlineKorpa nasledjuje klasu Korpa i on prilikom placanja daje popust od 10%.
FizickaKorpa nasledjuje klasu Korpa.
 */

public class Main {
    public static void main(String[] args) {

        Stavka stavka = new Stavka("Laptop", 1000);
        Stavka stavka2 = new Stavka("DesktopPC", 1500);
        Stavka stavka3 = new Stavka("Mleko", 124);
        KreditnaKartica kartica = new KreditnaKartica(15000);
        Korpa korpa = new Korpa(stavka, kartica);
        Korpa onlineKorpa = new Korpa(stavka2,kartica);
        Korpa fizickaKorpa = new FizickaKorpa(stavka3, kartica);
        System.out.println(korpa.viseStavki());
        korpa.plati();
        onlineKorpa.plati();
        fizickaKorpa.plati();

    }
}
