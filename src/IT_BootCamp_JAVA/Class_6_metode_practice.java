package IT_BootCamp_JAVA;

public class Class_6_metode_practice {
    public static void main(String[] args) {

        /*
        Zadatak 1:
Napraviti metodu koja prihvata neki String i vraca Koliko on ima samoglasnika.
         */


        String prvi = "prvi string ima nekoliko";
        String drugi = "drugi string ima vise nego nekoliko";
        String treci = "aaaaaaaeeeeiopsadwqeoifgrot ima najvise samoglasnika";

        int broj = prebrojSamoglasnike(prvi);
        System.out.println("Broj samoglasnika u prvom stringu :" + broj);
        int broj1 = prebrojSamoglasnike(drugi);
        System.out.println("Broj samoglasnika u drugom stringu :" + broj1);
        int broj2 = prebrojSamoglasnike(treci);
        System.out.println("Broj samoglasnika u trecem stringu :" + broj2);

    }
    public static int prebrojSamoglasnike(String nekiString) {
        int rezultat = 0;
        for (int i = 0; i < nekiString.length(); i++) {
            if (nekiString.charAt(i) == 'a' || nekiString.charAt(i) == 'e' || nekiString.charAt(i) == 'i' || nekiString.charAt(i) == 'o'
                    || nekiString.charAt(i) == 'u') {
                rezultat++;
            }
        }
        return rezultat;
    }
}
/*
public static int prebrojSamoglasnike(String nekiString) {
int rezultat=0;
char[] samoglasnici = {'a', 'e', 'i', 'o', 'u'};
for(int i=0; i>nekiString.length(); i++) {
if(trenutniSamoglasnik == samoglasnici[j]) {
rezultat++;
    }
}
 */