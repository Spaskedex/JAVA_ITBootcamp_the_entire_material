package Practice_Projects.Practice_OOP_Zadatak2;

public class OnlineKorpa extends Korpa{
    public OnlineKorpa(Stavka stavka, KreditnaKartica kartica) {
        super(stavka, kartica);
    }

    @Override
    public void plati() {
        double skini = 0;
        if(getKartica().getStanjeNaRacunu()>=getStavka().getCena()) {
            skini = getKartica().getStanjeNaRacunu() - (getStavka().getCena()*0.9);
            getKartica().setStanjeNaRacunu(skini);
            System.out.println("Placeno. Stanje na racunu: " + getKartica().getStanjeNaRacunu());
        } else {
            System.out.println("Nemate dovoljno sredstava na racunu.");
        }
    }
}
