package ObjektnoOrjentisanoProgramiranje.Class_11_Apstraktne_Klase;

    /*
    --Abstraktne klase su
    -- Abstraktne metode
     */

public abstract class Zivotinja {

    private String naziv;

    public Zivotinja(String naziv) {
        this.naziv=naziv;
    }
    public String getNaziv() {
        return naziv;
    }

    public abstract void oglasiSe();
}
