package ObjektnoOrjentisanoProgramiranje.Class_8_OOP.Auto_covek.Student;
/*
Zadatak 2:
Napraviti klasu Student koji ima od atributa ime i listu ocena.
Napraviti metodu koja racuna studentov prosek.
Napraviti metodu koja proverava prosek I ukoliko je manji od 1.5 ispisati poruku da mora na popravni.
Klasa mora imati adekvatan konstruktor I toString.
*/


import java.util.ArrayList;

public class Student {

    String ime;
    ArrayList<Integer> listaOcena;

    public Student(String ime, ArrayList<Integer> listaOcena) {
        this.ime=ime;
        this.listaOcena=listaOcena;
    }

    public String toString() {
        return "[" + ime + " " + listaOcena + "]";
    }

    public double prosek() {
        double suma=0;
        for(Integer i:listaOcena) {
            suma+=i;
        }
        return suma/listaOcena.size();
    }

    public void popravni() {
        if( prosek()<1.5) {
            System.out.println("Moras na popravni.");
        } else {
            System.out.println("Polozili ste!");
        }
    }
}
