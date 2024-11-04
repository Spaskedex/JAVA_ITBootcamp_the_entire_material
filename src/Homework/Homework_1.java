package Homework;

/*
Domaći:
1. Napisati program koji računa površinu i obim pravougaonika sa zadatim dimenzijama a = 5 i b = 13 (dužine stranica).
2. String s1 = "bootcamp qa" i s2 = "xx generacija" spojiti u novi string i ispisati ga u konzoli tako da sva slova budu velika.
3. Inicijalizovati promenljive broj1 i broj2 sa proizvoljnim vrednostima, zatim ispisati rezultate njihovog zbira, proizvoda i ostatka pri deljenju.
 */

public class Homework_1 {
    public static void main(String[] args) {
// Zadatak_1 :
        int a = 5;
        int b = 13;
        int povrsina = a * b;
        int obim = (2*a) + (2*b);
        System.out.println("Povrsina pravougaonika iznosi: " + povrsina);
        System.out.println("Obim pravougaonika iznosi: " + obim);

//Zadatak_2 :

        String s1 = "bootcamp qa";
        String s2 = " xx generacija";
        String s3 = s1 + s2;
        s3 = s3.toUpperCase();
        System.out.println(s3);

// Zadatak_3 :

        int broj1;
        int broj2;
        broj1 = 23;
        broj2 = 13;
        System.out.println("Zbir brojeva " + broj1 + " i " + broj2 + " iznosi: " + (broj1 + broj2) +
                ", njihov proizvod: " + (broj1 * broj2) + ", dok je ostatak njihovog deljenja: " + (broj1 % broj2) + ".");

    }
}
