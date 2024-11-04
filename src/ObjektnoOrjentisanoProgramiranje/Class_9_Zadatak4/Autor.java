package ObjektnoOrjentisanoProgramiranje.Class_9_Zadatak4;

/*
Zadatak 4:
Napraviti klasu Autor koji u sklopu ima ime, godinu rodjenja,ukupan broj prodanih dela i jednu knjigu.
Napraviti metodu:
-ranaObjava() -> ispisati poruku ako je autor objavio svoju knjigu pre 25 godine
-zarada() -> Koliko je zaradio ukupno para od svih prodanih dela ako racunamo da imaju isti cenu kao ta jedna knjiga
 */


public class Autor {

    private String ime;
    private int godinaRodjenja;
    private int brojProdatihDela;
    private Knjiga k;

    public Autor(String ime, int godinaRodjenja, int brojProdatihDela, Knjiga k) {
        this.ime=ime;
        this.godinaRodjenja=godinaRodjenja;
        this.brojProdatihDela=brojProdatihDela;
        this.k=k;
    }

    public String toString() {
        return "Autor: [" + ime + "] godina rodjenja [" + godinaRodjenja + "]; ukupno prodato knjiga: [" + brojProdatihDela + "];";
    }

    public String getIme() {
        return ime;
    }
    public void setIme(String novoIme) {
        this.ime=novoIme;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }
    public void setGodinaRodjenja(Integer novaGodRodjenja) {
        this.godinaRodjenja=novaGodRodjenja;
    }

    public int getBrojProdatihDela() {
        return brojProdatihDela;
    }
    public void setBrojProdatihDela(Integer noviBrojProdatihDela) {
        this.brojProdatihDela=noviBrojProdatihDela;
    }

    public void ranaObjava() {
        int autoroveGodine = getK().getGodinaIzdavanja()-getGodinaRodjenja();
        if(autoroveGodine<=25) {
            System.out.println("Autorova rana objava.");
        } else {
            System.out.println("Nije autorova rana objava.");
        }
    }

    public Knjiga getK() {
        return k;
    }
    public void setK(Knjiga novaKnjiga) {
        this.k=novaKnjiga;
    }

    public double zarada() {
        double  rez = k.getCena() * getBrojProdatihDela();
        return rez;
    }



}
