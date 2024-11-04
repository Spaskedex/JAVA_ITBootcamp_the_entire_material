package ObjektnoOrjentisanoProgramiranje.Class_11_Bolnica;

public class Main {
    public static void main(String[] args) {

        Doktor d = new Pedijatar("Milos", 10, 1990);
        Doktor d1 = new Hirurg("Spaske", 20, 1997);
        Doktor d2 = new Oftamolog("Sasa", 15, 2002);

        System.out.println(d + "zaposlen: " + d.getGodineZaposlenja() + "plata: " + d.plata());
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d.godineStaza());
        System.out.println(d.plata());
    }
}
