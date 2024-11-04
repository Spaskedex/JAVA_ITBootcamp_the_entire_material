package ObjektnoOrjentisanoProgramiranje.Class_9_OOP.Zadatak1;

public class Sportista {

    private String ime;
    private int brojNagrada;
    private int godRodjenja;

    public Sportista(String ime, int brojNagrada, int godRodjenja) {
        this.ime=ime;
        this.brojNagrada=brojNagrada;
        this.godRodjenja=godRodjenja;
    }

    public String toString () {
        return "Ime: " + ime + " broj nagrada: " + brojNagrada + " rodjen: " + godRodjenja;
    }

    public void penzija(int potrebnoNagrada) {
        if(getBrojNagrada()>=potrebnoNagrada) {
            System.out.println("Penzija je obezbedjena dovoljnim brojem nagrada.");
        } else {
            System.out.println("Nedovoljno nagrada za ostvarenje penzije.");
        }
    }

    public void veteran(int sadGodina) {
        if((sadGodina-getGodRodjenja())>=40) {
            System.out.println("Sportista je veteran.");
        } else {
            System.out.println("Sportista nije veteran.");
        }
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String novoIme) {
        this.ime=novoIme;
    }

    public int getBrojNagrada() {
        return brojNagrada;
    }

    public void setBrojNagrada(int novBrojNagrada) {
        this.brojNagrada=novBrojNagrada;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public void  setGodRodjenja(int novaGodina) {
        this.godRodjenja=novaGodina;
    }


}
