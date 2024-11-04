package Homework.Homework_8;


/*
Domaci:
Kreirati klasu BankovniRacun koja modeluje bankovni racun. Svaki bankovni racun ima svoj jedinstveni broj,
 ime vlasnika racuna, i trenutno stanje na racunu.
Implementirati konstruktor koji postavlja vrednosti ovih atributa pri kreiranju racuna.
Dodati metode uplata i isplata koje omogucavaju uplatu i isplatu novca sa racuna.
Obe metode primaju iznos kao argument. Metoda uplata povecava trenutno stanje racuna za dati iznos,
dok metoda skidanje smanjuje trenutno stanje racuna.
Implementirati provere da li je iznos uplate ili skidanja pozitivan i da li postoji dovoljno sredstava na racunu za skidanje.
Napisati metodu toString koja generise string reprezentaciju objekta, uključujući broj racuna,
ime vlasnika i trenutno stanje na racunu.
U main metodi, kreirati objekat klase BankovniRacun, ispisati informacije o računu pomocu
metode toString, izvrsiti nekoliko uplata i skidanja novca na računu pomoću metoda uplata i
skidanje, te na kraju ispisati azurirane informacije o racunu.
 */
/*
Domaci:
Prepraviti prethodni domaci tako sto cete dodati odgovarajuce modifikatore
vidljivosti i primeniti enkapsulaciju. Domaci predajete do sutrasnjeg predavanja
 */

public class BankovniRacun {

    private int brojRacuna;
    private String ime;
    private String prezime;
    private int stanjeNaRacunu;


    public BankovniRacun(int jedinstveniBroj, String ime, String prezime, int stanjeRacuna) {
        this.brojRacuna=jedinstveniBroj;
        this.ime=ime;
        this.prezime=prezime;
        this.stanjeNaRacunu=stanjeRacuna;
    }

    public String toString () {
        return "Broj racuna: " + brojRacuna + "; Ime i prezime: " + ime + " " + prezime + "; " + "Stanje na racunu: " + stanjeNaRacunu + " RSD;";
    }

    public int uplata(int iznos) {
        int novoStanje = getStanjeNaRacunu();
        setStanjeNaRacunu(novoStanje+iznos);
        return getStanjeNaRacunu();
    }

    public void isplata(int iznos) {
//        int novoStanje = getStanjeNaRacunu();
        if(getStanjeNaRacunu()>=iznos) {
            setStanjeNaRacunu(getStanjeNaRacunu()-iznos);
            System.out.println("Stanje na vasem racunu posle isplate od: " + iznos + " RSD je: " + getStanjeNaRacunu() + " RSD.");
        } else {
            System.out.println("Nemate dovoljno sredstava na racunu!");
        }
    }

    public int getBrojRacuna() {
        return brojRacuna;
    }
    public void setBrojRacuna(Integer newBrojRacuna) {
        this.brojRacuna=newBrojRacuna;
    }

    public String getIme() {
        return ime;
    }
    public void setIme(String newIme) {
        this.ime=newIme;
    }

    public String getPrezime() {
        return prezime;
    }
    public void setPrezime(String newPrezime) {
        this.prezime=newPrezime;
    }

    public int getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }
    public void setStanjeNaRacunu(Integer newStanjeNaRacunu) {
        this.stanjeNaRacunu=newStanjeNaRacunu;
    }

}
