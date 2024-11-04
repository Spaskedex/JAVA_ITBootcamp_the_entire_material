package ObjektnoOrjentisanoProgramiranje.Class_8_OOP.Auto_covek.Auto_Covek;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


//            Scanner sc = new Scanner(System.in);
//            System.out.println("Unesi ime: ");
//            String ime = sc.nextLine();


            Covek c = new Covek("Marko","Tomin",12345,1998);
            Covek c1 = new Covek("Dejan", "Grujic",54321, 2000);

            System.out.println("Moje ime je: " + c.ime + " Moje prezime je: " + c.prezime);
            System.out.println(c);
            c.pozdraviSe();

            car a = new car("BMW", 299, 55000, "Red");
        System.out.println(a);
        System.out.println(a.getMaxSpeed());
        System.out.println(a.popustNaBoju("purple"));
        System.out.println(a.getMaxSpeed());








    }
}
