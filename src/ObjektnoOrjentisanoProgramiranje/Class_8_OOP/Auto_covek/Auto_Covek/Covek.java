package ObjektnoOrjentisanoProgramiranje.Class_8_OOP.Auto_covek.Auto_Covek;

public class Covek {

    String ime; // ovo je jedan atribut klase
    String prezime;
    int jmbg;
    int godinaRodjenja;

    public Covek(String ime, String prezime, int jmbg, int godinaRodjenja) {             //konstruktor metoda
        this.ime=ime;
        this.prezime=prezime;
        this.jmbg=jmbg;
        this.godinaRodjenja=godinaRodjenja;
    }


    //Metode unutar neke klase opisuju ponasanje tog objekta
    public void pozdraviSe() {

        System.out.println("Cao! Moje ime je: " + ime);
    }

    public int izracunajGodine() {

        return 2024-godinaRodjenja;
    }


    //toString() metod vraca String reprezentaciju nekog objekta
    //pozvan je po defaulta
    public String toString() {
        return "[" + ime + " " + prezime + " " + jmbg + " " + godinaRodjenja + "]";
    }

}
