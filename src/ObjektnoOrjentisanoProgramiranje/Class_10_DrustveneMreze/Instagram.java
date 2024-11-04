package ObjektnoOrjentisanoProgramiranje.Class_10_DrustveneMreze;

public class Instagram extends DrustvenaMreza{
    public Instagram(int brojKorisnika, int brojReklama) {
        super(brojKorisnika, brojReklama);
    }

    @Override
    public double zarada() {
        double zarada= ((1*getBrojKorisnika())+(10*getBrojReklama()));
        return zarada;
    }
}
