package ObjektnoOrjentisanoProgramiranje.Class_10_Garaza;

/*
    --Nasledjivanje classa (parent i child), clasa nasledjuje atribute, metode,toString, set-get-ere...
        Jedna klasa moze da nasledjuje najvise jednu klasu.
    --extends
    --anotacija @Override :
     */


public class Brod extends Vozilo {

        private int tezinaBroda;

        public Brod(double cena, int kilometraza, int godinaProizvodnje, int tezinaBroda) {
            super(cena,kilometraza,godinaProizvodnje);
            this.tezinaBroda=tezinaBroda;
        }

    }



