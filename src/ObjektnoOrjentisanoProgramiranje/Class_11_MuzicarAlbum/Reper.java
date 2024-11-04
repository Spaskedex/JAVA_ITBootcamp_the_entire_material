package ObjektnoOrjentisanoProgramiranje.Class_11_MuzicarAlbum;

public class Reper extends Muzicar{
    public Reper(String ime, int godinaPocetka, Album album) {
        super(ime, godinaPocetka, album);
    }


    @Override
    public double zarada() {
        return getAlbum().getBrojPesama()*500;
    }
}
