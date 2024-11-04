package ObjektnoOrjentisanoProgramiranje.Class_9_OOP.Zadatak1;


/*
Zadatak 1:
Napraviti klasu Sportista koji od atributa ima ime, broj nagrada i godinu rodjenja.
Napraviti metodu:
- penzija(int potrebnoNagrada) -> ova metoda prima kao argument neki potreban broj nagrada da bi
sportista otisao u penziju
- veteran() -> metoda ispisuje poruku o tome da li je ovaj sportista veteran, tj stariji od 40 godina
Napraviti adekvatan konstruktor, get i set metod, kao i toString.
 */

public class Main {
    public static void main(String[] args) {

        Sportista sport1 = new Sportista("Marko", 21, 1998);

        System.out.println(sport1);
        sport1.penzija(20);
        sport1.veteran(2024);



    }
}
