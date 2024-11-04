package ObjektnoOrjentisanoProgramiranje.Class_8_OOP.Auto_covek.Student;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {


        ArrayList<Integer> listaOcena = new ArrayList<>();
        listaOcena.add(5);
        listaOcena.add(5);
        listaOcena.add(3);
        listaOcena.add(3);
        listaOcena.add(4);

        Student ucenik = new Student("Dragan", listaOcena);
        System.out.println(ucenik);
        System.out.println(ucenik.prosek());
        ucenik.popravni();

    }
}
