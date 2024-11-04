package ObjektnoOrjentisanoProgramiranje.Class_9_Zadatak3;


/*
Zadatak 3:
Napraviti klasu Knjiga koja ima od atributa naziv, broj strana,godinu izdanja i cenu.
Napraviti metodu:
-popust() -> ako je duzina knjige veca od 300 strana, umanjiti za 20%
-oldTimer() -> ako je knjiga starija od 20 godina, ispisati poruku da je u pitanju stara knjiga
 */


public class Knjiga {


    private String naslov;
    private int brojStrana;
    private int godinaIzdanja;
    private double cena;


    public Knjiga(String naslov, int brojStrana, int godinaIzdanja, double cena) {
        this.naslov=naslov;
        this.brojStrana=brojStrana;
        this.godinaIzdanja=godinaIzdanja;
        this.cena=cena;
    }

    public String toString() {
        return "Naslov knjige: [" + naslov + "]; broj strana: " + brojStrana + "; godina izdanja: " + godinaIzdanja + "; cena: " + cena + " RSD;";
    }

    public String getNaslov() {
        return naslov;
    }
    public void setNaslov(String newNaslov) {
        this.naslov=newNaslov;
    }

    public int getBrojStrana() {
        return brojStrana;
    }
    public void setBrojStrana(int newBrStrana) {
        this.brojStrana=newBrStrana;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }
    public void setGodinaIzdanja(int newGodinaIzdanja) {
        this.godinaIzdanja=newGodinaIzdanja;
    }

    public double getCena() {
        return cena;
    }
    public void setCena(double newCena) {
        this.cena=newCena;
    }

    public void popust() {
        if(getBrojStrana()>300) {
            setCena(getCena()*0.8);
        } else {
            setCena(getCena());
        }
    }

    public void oldTimer() {
        if((2024-getGodinaIzdanja())>20) {
            System.out.println("U pitanju je stara knjiga oldTimer");
        } else {
            System.out.println("Knjiga nije oldTimer");
        }
    }


}
