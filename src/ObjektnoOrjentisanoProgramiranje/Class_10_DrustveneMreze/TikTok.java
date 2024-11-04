package ObjektnoOrjentisanoProgramiranje.Class_10_DrustveneMreze;

public class TikTok extends DrustvenaMreza{
    public TikTok(int brojKorisnika, int brojReklama) {
        super(brojKorisnika, brojReklama);
    }

    @Override
    public void upozorenje() {
        if(getBrojKorisnika()<850000) {
            System.out.println("Nedovoljno korisnika na mrezi!");
        } else {
            System.out.println("Na mrezi je " + getBrojKorisnika() + " korisnika");
        }
    }
}
