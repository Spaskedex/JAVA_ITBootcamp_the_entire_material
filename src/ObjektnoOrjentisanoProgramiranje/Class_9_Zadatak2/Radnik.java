package ObjektnoOrjentisanoProgramiranje.Class_9_Zadatak2;


/*
Zadatak 2:
Napraviti klasu Radnik koja ima id, godinu zaposlenja i platu radnika.
Napraviti metodu koja racuna staz radniku i metodu koja daje povisicu za 20%
ukoliko se radnik tu nalazi vise od 5 godina, i povisicu od 40% ukoliko ima
staz duzi od 10 godina.
Napraviti adekvatan konstruktor, get i set metod, kao i toString.
 */


public class Radnik {

    private int id;
    private int godinaZaposlenja;
    private double plata;



    public Radnik(int id, int godinaZaposlenja, int plata) {
        this.id=id;
        this.godinaZaposlenja=godinaZaposlenja;
        this.plata=plata;
    }

    public String toString() {
        return "ID [" + id + "] " + " godina zaposlenja: " + godinaZaposlenja + "; " + " plata: " + plata;
    }

    public int getId() {
        return id;
    }
    public void setId(int newId) {
        this.id=newId;
    }

    public int getGodinaZaposlenja() {
        return godinaZaposlenja;
    }
    public void setGodinaZaposlenja(int newGodZaposlenja) {
        this.godinaZaposlenja=newGodZaposlenja;
    }

    public double getPlata() {
        return plata;
    }
    public void setPlata(double newPlata) {
        this.plata=newPlata;
    }

    public int staz() {
        return 2024-getGodinaZaposlenja();
    }

    public void povisica() {
        double plataNakonPovisice= getPlata();
        if(staz()>5 && staz()<=10) {
            plataNakonPovisice*=1.2;
        }
        if(staz()>10) {
            plataNakonPovisice*=1.4;
        }
        setPlata(plataNakonPovisice);
    }







}
